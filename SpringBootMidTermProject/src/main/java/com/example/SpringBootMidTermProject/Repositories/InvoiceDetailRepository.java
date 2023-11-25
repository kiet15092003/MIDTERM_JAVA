package com.example.SpringBootMidTermProject.Repositories;

import com.example.SpringBootMidTermProject.Models.InvoiceDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceDetailRepository extends JpaRepository<InvoiceDetail,Long> {
}
