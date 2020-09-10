package org.soyphea.domain;

public class Book {

  private String title;
  private double price;
  private String sbn;

  public Book(String title, double price, String sbn) {
    this.title = title;
    this.price = price;
    this.sbn = sbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getSbn() {
    return sbn;
  }

  public void setSbn(String sbn) {
    this.sbn = sbn;
  }
}

