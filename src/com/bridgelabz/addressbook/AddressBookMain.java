package com.bridgelabz.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Map<String, AddressBook> addressBookHashMap = new HashMap<String, AddressBook>();
        while(true){
            System.out.println("1. Add Address Book");
            System.out.println("2. Edit Address Book");
            System.out.println("3. Display Address Book Names");
            System.out.println("4. Delete Address Book ");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            Scanner s = new Scanner(System.in);
            int addressBookOption = s.nextInt();
            switch(addressBookOption){
                case 1:
                    Scanner sa = new Scanner(System.in);
                    System.out.println("Enter Unique Address Book Name");
                    String addressBookName = s.next();
                    AddressBook addressBookSystem = new AddressBook();
                    addressBookHashMap.put(addressBookName,addressBookSystem);
                    System.out.println("Address Book Successfully created with the name " + addressBookName);
                    break;
                case 2:
                    System.out.println("Welcome to Address Book Editing");
                    while (true) {
                        Scanner sade = new Scanner(System.in);
                        System.out.println("1. Add Contact");
                        System.out.println("2. Display Contacts");
                        System.out.println("3. Edit Contact");
                        System.out.println("4. Delete Contact");
                        System.out.println("5. Exit");
                        System.out.println("Enter your choice: ");
                        int choice = sade.nextInt();
                        System.out.println("Enter Address Book Name");
                        String addressBookNamen = sade.next();
                        try{
                            AddressBook ab = addressBookHashMap.get(addressBookNamen);
                            switch (choice) {
                                case 1:
                                    ab.addContacts();
                                    break;
                                case 2:
                                    ab.displayContacts();
                                    break;
                                case 3:
                                    ab.editContacts();
                                    break;
                                case 4:
                                    ab.deleteContacts();
                                    break;
                                case 5:
                                    System.exit(0);
                                default:
                                    System.out.println("Invalid Choice");
                                    break;
                            }

                        }catch (NullPointerException e){
                            System.out.println("Address Book with name " + addressBookNamen + " does not exist");
                        }
                    }
                case 3:
                    if (addressBookHashMap.size() == 0) {
                        System.out.println("Address Book is Empty");
                    } else {
                        System.out.println("Address Books List");
                        int i = 0;
                        for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
                            String k = entry.getKey();
                            System.out.println(++i + ") " + k);
                        }
                    }
                    break;
                case 4:
                    Scanner s4 = new Scanner(System.in);
                    if (addressBookHashMap.size() != 0) {
                        for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
                            String k = entry.getKey();
                            System.out.println("Address Book Name : " + k);
                        }
                        System.out.println("Enter Address Book name which you want Delete");
                        String addressBookNamed = s4.next();
                        for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
                            String k = entry.getKey();
                            if (k.equalsIgnoreCase(addressBookNamed)) {
                                addressBookHashMap.remove(k);
                                System.out.println("Address Book with name  " + addressBookNamed + " deleted successfully");
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("No Address Book exist in the Record" );
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}