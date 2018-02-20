package com.company;

public class ContactManager {
    //Fields
    Contact [] friends;
    int numberOfFriends;

    //Constructor
    ContactManager(){
        this.numberOfFriends = 0;
        this.friends = new Contact[500];
    }
    //Methods
    void addContact(Contact contact){
        friends[numberOfFriends] = contact;
        numberOfFriends++;
    }

    Contact searchContacts(String searchName){
        for (int i = 0; i < numberOfFriends; i++){
            if(friends[i].name.equals(searchName)) return friends[i];
        }
        return null;
    }
}
