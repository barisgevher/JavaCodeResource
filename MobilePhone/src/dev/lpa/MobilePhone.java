package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }



    public boolean addNewContract(Contact contact){
        if (myContacts.contains(contact)){
            return  false;
        }else {
            myContacts.add(contact);
            return true;
        }
    }


    public boolean updateContact(Contact oldContact, Contact newContact){
        if (myContacts.contains(oldContact)){
            int index = myContacts.indexOf(oldContact);
            if (index != -1){
                myContacts.set(index, newContact);
                return  true;
            }else {
                return false;
            }
        }else{
            return  false;
        }

    }


    public boolean removeContact(Contact contact){

       if (myContacts.contains(contact)){
           myContacts.remove(contact);
           return true;
       }else {
           return  false;
       }

    }


    private int findContact(Contact contact){
       int index = myContacts.indexOf(contact);
       if (index >= 0){
           return  index;
       } else {
           return  -1;
       }

    }

    private int findContact(String name) {

        for (Contact el : myContacts) {
            if (el.getName() == name) {
                return myContacts.indexOf(el);
            }


        }

        return -1;
    }

    public Contact queryContact(String name) {
    if (findContact(name) > 0){
        return myContacts.get(findContact(name));
    }else{
        return null;
    }

    }


    public void printContacts() {

//        String textBlock1 = """
//                Contact List:
//                1. Bob -> 31415926
//                2. Alice -> 16180339
//                3. Tom -> 11235813
//                4. Jane -> 23571113""";

        StringBuilder textBlock = new StringBuilder("""
                Contact List:
                """);

        for (int i = 0; i < myContacts.size(); i++) {
            textBlock.append(i + 1).append(". ").append(myContacts.get(i).getName()).append(" -> ").append(myContacts.get(i).getPhoneNumber()).append("\n");
        }


    }

}
