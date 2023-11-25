package com.example.SpringBootMidTermProject.Services;

import com.example.SpringBootMidTermProject.Models.InvoiceDetail;
import com.example.SpringBootMidTermProject.Repositories.InvoiceDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceDetailService {
    @Autowired
    InvoiceDetailRepository invoiceDetailRepository;
    public InvoiceDetail save(InvoiceDetail invoiceDetail){
        return invoiceDetailRepository.save(invoiceDetail);
    }
}
