/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.invoice.service;

import com.invoice.model.Invoice;
import com.invoice.model.Item;
import com.invoice.model.dto.InvoiceDetailsResponse;
import com.invoice.repository.InvoiceRepository;
import com.invoice.repository.ItemRepository;
import com.sun.istack.logging.Logger;
import java.util.List;
import java.util.logging.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

/**
 *
 * @author Taiwo.Kasumu
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {
    
    @Autowired
    InvoiceRepository invoiceRepo;

    @Autowired
    ItemRepository itemRepo;
    
    private static final Logger LOGGER = Logger.getLogger(InvoiceServiceImpl.class);
    
    @Override
    public InvoiceDetailsResponse getInvoiceDetails(int invoiceNo, String customerId) {
        InvoiceDetailsResponse invoiceResponse = new InvoiceDetailsResponse(10, "Request Processing Error");
        try{
            Invoice invoiceDetails = invoiceRepo.findByInvoiceNoAndCustomerId(invoiceNo, customerId).get(0);
            List<Item> invoiceItems = itemRepo.findByInvoiceNo(invoiceNo);
            if(invoiceDetails == null){
                invoiceResponse.setResponseMessage("No Invoice Found");
            }else{
                invoiceResponse.setResponseMessage("Invoice Fetched Successfully");
                invoiceResponse.setResponseCode(0);
                invoiceResponse.setInvoiceItems(invoiceItems);
                invoiceResponse.setInvoice(invoiceDetails);
            }
        }
        catch(Exception ex){
            LOGGER.log(Level.SEVERE, String.format("Exception Occured for Invoice No %s - %s", invoiceNo, ex.getMessage()));
        }
        return invoiceResponse;
    }
    
}
