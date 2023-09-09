package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;

public class ContactListController {
    private ContactList contactList;

    ContactListController (ContactList contactList) {
        this.contactList = contactList;
    }


    // getters and setters

    public ContactList getContactList() {
        return contactList;
    }

    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }


    // Delegate methods

    public void setContacts(ArrayList<Contact> contact_list) {
        contactList.setContacts(contact_list);
    }

    public ArrayList<Contact> getContacts() {
        return contactList.getContacts();
    }

    public ArrayList<String> getAllUsernames() {
        return contactList.getAllUsernames();
    }

    public boolean addContact(Contact contact, Context context) {
//        contactList.addContact(contact);
        AddContactCommand addContactCommand = new AddContactCommand(contactList, contact, context);
        addContactCommand.execute();
        return addContactCommand.isExecuted();
    }

    public boolean deleteContact(Contact contact, Context context) {
//        contactList.deleteContact(contact);
        DeleteContactCommand deleteContactCommand = new DeleteContactCommand(contactList, contact, context);
        deleteContactCommand.execute();
        return deleteContactCommand.isExecuted();
    }

    public Contact getContact(int index) {
        return contactList.getContact(index);
    }

    public int getSize() {
        return contactList.getSize();
    }

    public Contact getContactByUsername(String username) {
        return contactList.getContactByUsername(username);
    }

    public boolean hasContact(Contact contact) {
        return contactList.hasContact(contact);
    }

    public int getIndex(Contact contact) {
        return contactList.getIndex(contact);
    }

    public boolean isUsernameAvailable(String username) {
        return contactList.isUsernameAvailable(username);
    }

    public void loadContacts(Context context) {
        contactList.loadContacts(context);
    }

    public boolean saveContacts(Context context) {
        return contactList.saveContacts(context);
    }

    public void addObserver(Observer observer) {
        contactList.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        contactList.removeObserver(observer);
    }


    // others

    public boolean editContact(Contact oldContact, Contact newContact, Context context) {
        EditContactCommand editContactCommand = new EditContactCommand(contactList, oldContact, newContact, context);
        editContactCommand.execute();
        return editContactCommand.isExecuted();
    }
}
