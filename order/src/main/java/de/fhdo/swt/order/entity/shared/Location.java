package de.fhdo.swt.order.entity.shared;

import java.util.Objects;

public class Location {
  private String id;
  private String buyer;
  private String street;
  private String streetNumber;
  private int zipCode;
  private String city;

  public Location() {
  }

  public Location(String id, String buyer, String street, String streetNumber, int zipCode,
      String city) {
    this.id = id;
    this.buyer = buyer;
    this.street = street;
    this.streetNumber = streetNumber;
    this.zipCode = zipCode;
    this.city = city;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBuyer() {
    return buyer;
  }

  public void setBuyer(String buyer) {
    this.buyer = buyer;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public int getZipCode() {
    return zipCode;
  }

  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString() {
    return "Location{" +
        "id='" + id + '\'' +
        ", buyer='" + buyer + '\'' +
        ", street='" + street + '\'' +
        ", streetNumber='" + streetNumber + '\'' +
        ", zipCode=" + zipCode +
        ", city='" + city + '\'' +
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
    Location location = (Location) o;
    return zipCode == location.zipCode &&
        Objects.equals(id, location.id) &&
        Objects.equals(buyer, location.buyer) &&
        Objects.equals(street, location.street) &&
        Objects.equals(streetNumber, location.streetNumber) &&
        Objects.equals(city, location.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, buyer, street, streetNumber, zipCode, city);
  }
}
