/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.invoice.service;

import com.invoice.model.dto.InvoiceDetailsResponse;

/**
 *
 * @author Taiwo.Kasumu
 */
public interface InvoiceService {
    
    InvoiceDetailsResponse getInvoiceDetails(int invoiceNo, String customerId);
    
}
