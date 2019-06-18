package de.fhdo.swt.order.entity;

import de.fhdo.swt.order.entity.shared.Location;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Invoice {
  private String invoiceId;
  private String invoiceReceiver;
  private float totalAmong;
  private List<String> itemList;
  private Location location;

  public Invoice() {
    itemList = new LinkedList<>();
  }

  public Invoice(String invoiceId, String invoiceReceiver, float totalAmong,
      List<String> itemList, Location location) {
    this.invoiceId = invoiceId;
    this.invoiceReceiver = invoiceReceiver;
    this.totalAmong = totalAmong;
    this.itemList = itemList;
    this.location = location;
  }

  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public String getInvoiceReceiver() {
    return invoiceReceiver;
  }

  public void setInvoiceReceiver(String invoiceReceiver) {
    this.invoiceReceiver = invoiceReceiver;
  }

  public float getTotalAmong() {
    return totalAmong;
  }

  public void setTotalAmong(float totalAmong) {
    this.totalAmong = totalAmong;
  }

  public List<String> getItemList() {
    return itemList;
  }

  public void setItemList(List<String> itemList) {
    this.itemList = itemList;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "Invoice{" +
        "invoiceId='" + invoiceId + '\'' +
        ", invoiceReceiver='" + invoiceReceiver + '\'' +
        ", totalAmong=" + totalAmong +
        ", itemList=" + itemList +
        ", location=" + location +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Float.compare(invoice.totalAmong, totalAmong) == 0 &&
        Objects.equals(invoiceId, invoice.invoiceId) &&
        Objects.equals(invoiceReceiver, invoice.invoiceReceiver) &&
        Objects.equals(itemList, invoice.itemList) &&
        Objects.equals(location, invoice.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, invoiceReceiver, totalAmong, itemList, location);
  }
}
