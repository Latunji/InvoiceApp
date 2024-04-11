/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.invoice.model.dto;

import com.invoice.model.Invoice;
import com.invoice.model.Item;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Taiwo.Kasumu
 */
@Getter
@Setter
public class InvoiceDetailsResponse {
    
    private int responseCode;
    private Invoice invoice;
    private List<Item> invoiceItems;
    private String responseMessage;
    
    public InvoiceDetailsResponse(int responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }
    
}
