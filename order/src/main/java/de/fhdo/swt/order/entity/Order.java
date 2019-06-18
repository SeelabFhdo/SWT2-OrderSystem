package de.fhdo.swt.order.entity;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "location")
public class Order {
  @Id
  public String id;
  public String destinationId;
  public List<String> itemIdList;

  public Order() {
    itemIdList = new LinkedList<>();
  }

  public Order(String id, String destinationId, List<String> itemIdList) {
    this.id = id;
    this.destinationId = destinationId;
    this.itemIdList = itemIdList;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }

  @Override
  public String toString() {
    return "Order{" +
        "id='" + id + '\'' +
        ", destinationId='" + destinationId + '\'' +
        ", itemIdList=" + itemIdList +
        '}';
  }

  public List<String> getItemIdList() {
    return itemIdList;
  }

  public void setItemIdList(List<String> itemIdList) {
    this.itemIdList = itemIdList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(id, order.id) &&
        Objects.equals(destinationId, order.destinationId) &&
        Objects.equals(itemIdList, order.itemIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, destinationId, itemIdList);
  }
}
