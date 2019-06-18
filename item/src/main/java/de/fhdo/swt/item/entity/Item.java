package de.fhdo.swt.item.entity;

import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "item")
public class Item {
  @Id
  private String id;
  private String name;
  private float price;
  private String description;

  public Item() {
  }

  public Item(String id, String name, float price, String description) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.description = description;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Item{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", price=" + price +
        ", description='" + description + '\'' +
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
    Item item = (Item) o;
    return Float.compare(item.price, price) == 0 &&
        Objects.equals(id, item.id) &&
        Objects.equals(name, item.name) &&
        Objects.equals(description, item.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, description);
  }
}
