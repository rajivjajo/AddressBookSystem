package com.bridgelabz.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book system program !");
        AddressBook addressBook = new AddressBook();


        System.out.println(addressBook.contacts.getFirstName());
        System.out.println(addressBook.contacts.getLastName());
        System.out.println(addressBook.contacts.getAddress());
        System.out.println(addressBook.contacts.getCity());
        System.out.println(addressBook.contacts.getState());
        System.out.println(addressBook.contacts.getZip());
        System.out.println(addressBook.contacts.getPhoneNumber());
        System.out.println(addressBook.contacts.getEmail());


        addressBook.addContacts();
        System.out.println();

        System.out.println(addressBook.contacts.getFirstName());
        System.out.println(addressBook.contacts.getLastName());
        System.out.println(addressBook.contacts.getAddress());
        System.out.println(addressBook.contacts.getCity());
        System.out.println(addressBook.contacts.getState());
        System.out.println(addressBook.contacts.getZip());
        System.out.println(addressBook.contacts.getPhoneNumber());
        System.out.println(addressBook.contacts.getEmail());


        addressBook.editContacts();
        System.out.println();

        System.out.println(addressBook.contacts.getFirstName());
        System.out.println(addressBook.contacts.getLastName());
        System.out.println(addressBook.contacts.getAddress());
        System.out.println(addressBook.contacts.getCity());
        System.out.println(addressBook.contacts.getState());
        System.out.println(addressBook.contacts.getZip());
        System.out.println(addressBook.contacts.getPhoneNumber());
        System.out.println(addressBook.contacts.getEmail());


        addressBook.deleteContacts();

        System.out.println(addressBook.contacts.getFirstName());
        System.out.println(addressBook.contacts.getLastName());
        System.out.println(addressBook.contacts.getAddress());
        System.out.println(addressBook.contacts.getCity());
        System.out.println(addressBook.contacts.getState());
        System.out.println(addressBook.contacts.getZip());
        System.out.println(addressBook.contacts.getPhoneNumber());
        System.out.println(addressBook.contacts.getEmail());
    }
}
