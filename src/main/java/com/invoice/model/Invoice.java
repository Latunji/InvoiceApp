/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.invoice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Taiwo.Kasumu
 */
@Getter
@Setter
@Entity
public class Invoice {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    private String customerName;  
    private int invoiceNo;
    private String customerId;
    private String companyName;
    private String companyAddress;
    private String companyPhone;
    private String customerRole;
    private String senderName;
    private String senderAddress;
    private String senderPhone;
}
