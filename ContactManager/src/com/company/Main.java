package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ContactManager myContactsManager = new ContactManager();
        Contact myContact1 = new Contact();
        Contact myContact2 = new Contact();
        Contact myContact3 = new Contact();
        Contact myContact4 = new Contact();
        Contact ret = new Contact();

        myContact1.name = "Priyo";
        myContact1.phoneNumber = "+7788961703";

        myContact2.name = "Priyo2";
        myContact2.phoneNumber = "+8788961703";

        myContact3.name = "Priyo3";
        myContact3.phoneNumber = "+9788961703";

        myContact4.name = "Priyo4";
        myContact4.phoneNumber = "+6788961703";

        myContactsManager.addContact(myContact1);
        myContactsManager.addContact(myContact2);
        myContactsManager.addContact(myContact3);
        myContactsManager.addContact(myContact4);

        ret = myContactsManager.searchContacts("Priyo4");
        System.out.println(ret.phoneNumber);

        ret = myContactsManager.searchContacts("Priyo");
        System.out.println(ret.phoneNumber);
    }
}
