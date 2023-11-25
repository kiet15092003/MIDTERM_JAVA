package com.example.SpringBootMidTermProject.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_invoiceDetail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long price;
    private int quantity;
    private long sumPayment;
    @ManyToOne
    @JoinColumn(name = "fk_invoice")
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name="fk_product")
    private Product product;

    public InvoiceDetail(long price, int quantity, long sumPayment, Invoice invoice, Product product) {
        this.price = price;
        this.quantity = quantity;
        this.sumPayment = sumPayment;
        this.invoice = invoice;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getSumPayment() {
        return sumPayment;
    }

    public void setSumPayment(long sumPayment) {
        this.sumPayment = sumPayment;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
