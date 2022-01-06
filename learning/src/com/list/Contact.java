package com.list;

public class Contact  {
    String name;
    String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber){
        Contact contact = new Contact(name,phoneNumber);
        return contact;
    }
}
