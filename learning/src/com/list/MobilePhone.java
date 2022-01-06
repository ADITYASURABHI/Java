package com.list;

import java.util.ArrayList;

class MobilePhone {
    private ArrayList <Contact> myContacts;
    private String myNumber;

    public MobilePhone( String myNumber) {
        this.myNumber = myNumber;
        myContacts= new ArrayList<>();
    }

    public boolean addNewContact(Contact c){
       // System.out.println("adding");
        if(findContact(c)==-1){
            myContacts.add(c);
            //System.out.println("hi aisu");
            return true;
        }
        else
            return false;
    }
    public boolean updateContact(Contact old_contact, Contact new_contact){
        if(myContacts.contains(old_contact)){
          int i=  myContacts.indexOf(old_contact);
          myContacts.set(i,new_contact);
          return true;
        }
        else
            return false;

    }
    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }
    public int findContact(Contact contact){
       // System.out.println("hi");
        if(myContacts.contains(contact)){
            return myContacts.indexOf(contact);
        }
        return -1;
    }
    public int findContact(String name){
        for (Contact i: myContacts) {
            if (i.getName() == name) {
                return myContacts.indexOf(i);
            }
        }
        return -1;
    }
    public Contact queryContact(String name){
        if(findContact(name)!=-1){
            int i = findContact(name);
            return myContacts.get(i);
        }
        return null;
    }
    public void printContact(){
        for (int i=0; i<myContacts.size();i++)
        {
           System.out.println(myContacts.get(i).getName()+   "--->"  + myContacts.get(i).getPhoneNumber() );


        }
    }
}

