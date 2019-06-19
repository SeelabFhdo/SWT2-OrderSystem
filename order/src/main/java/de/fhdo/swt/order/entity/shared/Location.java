package de.fhdo.swt.order.entity.shared;

import java.util.Objects;

public class Location {
  private String id;
  private String owner;
  private String street;
  private String streetNumber;
  private int zipCode;
  private String city;

  public Location() {
  }

  public Location(String id, String owner, String street, String streetNumber, int zipCode,
      String city) {
    this.id = id;
    this.owner = owner;
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

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
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
        ", owner='" + owner + '\'' +
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
        Objects.equals(owner, location.owner) &&
        Objects.equals(street, location.street) &&
        Objects.equals(streetNumber, location.streetNumber) &&
        Objects.equals(city, location.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, street, streetNumber, zipCode, city);
  }
}
