package com.example.SpringBootMidTermProject.Repositories;

import com.example.SpringBootMidTermProject.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

}
