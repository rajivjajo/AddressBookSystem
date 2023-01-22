package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        System.out.println("Enter first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter last name: ");
        String lastName = input.nextLine();

        System.out.println("Enter address: ");
        String address = input.nextLine();

        System.out.println("Enter city: ");
        String city = input.nextLine();

        System.out.println("Enter state: ");
        String state = input.nextLine();

        System.out.println("Enter zip code: ");
        String zip = input.nextLine();

        System.out.println("Enter phone number: ");
        String phoneNumber = input.nextLine();

        System.out.println("Enter email: ");
        String email = input.nextLine();

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

        addressBook.addContact(contact);

        System.out.println("Contact added successfully:");
        System.out.println("Name: " + contact.getFirstName() + " " + contact.getLastName());
        System.out.println("Address: " + contact.getAddress());
        System.out.println("City: " + contact.getCity());
        System.out.println("State: " + contact.getState());
        System.out.println("Zip code: " + contact.getZip());
        System.out.println("Phone number: " + contact.getPhoneNumber());
        System.out.println("Email: " + contact.getEmail());
    }
}

