package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static ArrayList<Contacts> contactList = new ArrayList<>();

    void addContacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First name : ");
        String firstName = scanner.next();
        System.out.println("Enter Last name :");
        String lastName = scanner.next();
        System.out.println("Enter Address : ");
        String address = scanner.next();
        System.out.println("Enter City : ");
        String city = scanner.next();
        System.out.println("Enter State : ");
        String state = scanner.next();
        System.out.println("Enter Phone Number : ");
        Long phoneNumber = scanner.nextLong();
        System.out.println("Enter zip code :");
        int zip = scanner.nextInt();
        System.out.println("Enter Email : ");
        String email = scanner.next();
        Contacts contacts = new Contacts();
        contacts.setFirstName(firstName);
        contacts.setLastName(lastName);
        contacts.setAddress(address);
        contacts.setCity(city);
        contacts.setState(state);
        contacts.setPhoneNumber(phoneNumber);
        contacts.setZip(zip);
        contacts.setEmail(email);
        contactList.add(contacts);
        System.out.println("Contacts details are added.");
    }

    public void editContacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First name you want to edit : ");
        String searchName = scanner.next();
        for (Contacts contacts : contactList) {
            if (contacts.getFirstName().equalsIgnoreCase(searchName)) {
                System.out.println("Enter First name : ");
                String firstName = scanner.next();
                System.out.println("Enter Last name :");
                String lastName = scanner.next();
                System.out.println("Enter Address : ");
                String address = scanner.next();
                System.out.println("Enter City : ");
                String city = scanner.next();
                System.out.println("Enter State : ");
                String state = scanner.next();
                System.out.println("Enter Phone Number : ");
                Long phoneNumber = scanner.nextLong();
                System.out.println("Enter zip code :");
                int zip = scanner.nextInt();
                System.out.println("Enter Email : ");
                String email = scanner.next();
                contacts.setFirstName(firstName);
                contacts.setLastName(lastName);
                contacts.setAddress(address);
                contacts.setCity(city);
                contacts.setState(state);
                contacts.setPhoneNumber(phoneNumber);
                contacts.setZip(zip);
                contacts.setEmail(email);
                break;
            }
        }
    }

    public void deleteContacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name of the contact you want to delete : ");
        String searchName = scanner.next();
        for (Contacts contacts : contactList) {
            if (contacts.getFirstName().equalsIgnoreCase(searchName)) {
                contacts.setFirstName(null);
                contacts.setLastName(null);
                contacts.setAddress(null);
                contacts.setCity(null);
                contacts.setState(null);
                contacts.setPhoneNumber(null);
                contacts.setZip(0);
                contacts.setEmail(null);
                break;

            }
        }
    }
    public void displayContacts(){
        for (Contacts contactsDetailsValue : contactList) {
            System.out.println(contactsDetailsValue);
            System.out.println("________________________________________________");
        }
    }
}
