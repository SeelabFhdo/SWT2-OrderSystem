package de.fhdo.swt.order.service;

import de.fhdo.swt.order.entity.Invoice;

public interface InvoiceService {
  public Invoice createInvoice(String orderId, String locationId);

}
