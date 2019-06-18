package de.fhdo.swt.order.controller;

import de.fhdo.swt.order.entity.Invoice;
import de.fhdo.swt.order.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/resources/v1/invoiceinterface", produces = "application/json")
public class InvoiceController {
  private InvoiceService invoiceService;

  @Autowired
  public void setInvoiceService(InvoiceService invoiceService) {
    this.invoiceService = invoiceService;
  }

  @GetMapping(value = "/invoice/orderid/{orderId}/locationid/{locationId}")
  public Invoice createInvoice(@PathVariable String orderId, @PathVariable String locationId){
    return invoiceService.createInvoice(orderId, locationId);
  }
}
