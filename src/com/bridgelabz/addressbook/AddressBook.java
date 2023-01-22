package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    Contacts contacts = new Contacts();
        void addContacts(){
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
            Long phoneNumber =scanner.nextLong();
            System.out.println("Enter zip code :");
            int zip = scanner.nextInt();
            System.out.println("Enter Email : ");
            String email= scanner.next();
            contacts.setFirstName(firstName);
            contacts.setLastName(lastName);
            contacts.setAddress(address);
            contacts.setCity(city);
            contacts.setState(state);
            contacts.setPhoneNumber(phoneNumber);
            contacts.setZip(zip);
            contacts.setEmail(email);


        }
}
