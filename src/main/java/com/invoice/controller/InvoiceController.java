/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.invoice.controller;

import com.invoice.model.dto.InvoiceDetailsResponse;
import com.invoice.service.InvoiceServiceImpl;
import java.util.concurrent.CompletableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Taiwo.Kasumu
 */
@RestController
public class InvoiceController {

    @Autowired
    private InvoiceServiceImpl invoiceService;

    @RequestMapping(value = "/getInvoiceDetails", method = RequestMethod.POST
    )
    @ResponseBody
    public CompletableFuture<InvoiceDetailsResponse> getInvoiceDetails(
            @RequestParam("invoiceNo") int invoiceNo, @RequestParam("customerId") String customerId
    ) {
        InvoiceDetailsResponse response = new InvoiceDetailsResponse(10, "Request Processing Error");

        response = invoiceService.getInvoiceDetails(invoiceNo, customerId);

        return CompletableFuture.completedFuture(response);
    }

}
