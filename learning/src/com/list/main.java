package com.list;

class main {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("123456");
       Contact contact = Contact.createContact("bob","1242367");
       // contact.createContact("bob","123456");
       // System.out.println(contact.getName());
      Contact contact1 = new Contact("Alice","16180339");
        //contact1.createContact("as","12431");
        mobilePhone.addNewContact(contact);
       mobilePhone.addNewContact(contact1);
        System.out.println(mobilePhone.findContact("Alice"));
         mobilePhone.printContact();


    }
}
