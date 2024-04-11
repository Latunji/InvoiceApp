/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.invoice.repository;

import com.invoice.model.Invoice;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Taiwo.Kasumu
 */
@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
    
    List<Invoice> findByInvoiceNoAndCustomerId(int invoiceNo, String customerId);
    
}
