package com.example.SpringBootMidTermProject.Services;

import com.example.SpringBootMidTermProject.Models.Invoice;
import com.example.SpringBootMidTermProject.Repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;
    public Invoice save(Invoice invoice){
        return invoiceRepository.save(invoice);
    }
    public void remove(Invoice invoice){
        invoiceRepository.delete(invoice);
    }
}
