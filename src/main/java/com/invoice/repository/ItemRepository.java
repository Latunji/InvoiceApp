/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.invoice.repository;

import com.invoice.model.Item;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Taiwo.Kasumu
 */
public interface ItemRepository extends CrudRepository<Item, Long> {
    
    List<Item> findByInvoiceNo(int invoiceNo);
    
}
