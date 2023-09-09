package com.example.sharingapp;

public class ContactController {
    private Contact contact;

    ContactController(Contact contact) {
        this.contact = contact;
    }


    // getters and setters

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    
    // Delegate methods

    public String getUsername() {
        return contact.getUsername();
    }

    public void setUsername(String username) {
        contact.setUsername(username);
    }

    public String getEmail() {
        return contact.getEmail();
    }

    public void setEmail(String email) {
        contact.setEmail(email);
    }

    public String getId() {
        return contact.getId();
    }

    public void setId() {
        contact.setId();
    }

    public void updateId(String id) {
        contact.updateId(id);
    }

    public void addObserver(Observer observer) {
        contact.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        contact.removeObserver(observer);
    }
}
