package com.example.course;


public class Person {

  private String firstName;
  private String lastName;
  private String gender;
  private Address address;

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getName() {
    return this.firstName + " " + this.lastName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void init(){
    System.out.println("init called\n");
  }


  public void destroy(){
    System.out.println("destroy called\n");
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address a) {
    this.address = a;
  }



}
