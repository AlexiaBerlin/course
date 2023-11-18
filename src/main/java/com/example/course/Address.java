package com.example.course;

public class Address {
   private String street;
   private String cityState;

  public void setStreet(String street) {
    this.street = street;
  }
  public void setCityState(String cityState) {
    this.cityState = cityState;
  }
//comment


  public String toString(){
    return this.street + "," + this.cityState;
  }

}
