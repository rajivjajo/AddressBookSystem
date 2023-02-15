package com.bridgelabz.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Map<String, AddressBook> addressBookHashMap = new HashMap<>();

        while (true) {
            System.out.println("\n1. Add Address Book");
            System.out.println("2. Edit Address Book");
            System.out.println("3. Display Address Book Names");
            System.out.println("4. Delete Address Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter unique address book name: ");
                    String addressBookName = scanner.next();
                    if (addressBookHashMap.containsKey(addressBookName)) {
                        System.out.println("Address book already exists!");
                    } else {
                        AddressBook addressBook = new AddressBook();
                        addressBookHashMap.put(addressBookName, addressBook);
                        System.out.println("Address book created successfully with the name " + addressBookName);
                    }
                    break;

                case 2:
                    System.out.print("Enter address book name: ");
                    String bookName = scanner.next();
                    AddressBook addressBook = addressBookHashMap.get(bookName);
                    if (addressBook == null) {
                        System.out.println("Address book not found!");
                    } else {
                        while (true) {
                            System.out.println("\n1. Add Contact");
                            System.out.println("2. Display Contacts");
                            System.out.println("3. Edit Contact");
                            System.out.println("4. Delete Contact");
                            System.out.println("5. Exit");
                            System.out.print("Enter your choice: ");
                            int option = scanner.nextInt();

                            switch (option) {
                                case 1:
                                    addressBook.addContacts();
                                    break;
                                case 2:
                                    addressBook.displayContacts();
                                    break;
                                case 3:
                                    addressBook.editContacts();
                                    break;
                                case 4:
                                    addressBook.deleteContacts();
                                    break;
                                case 5:
                                    System.out.println("Exiting address book editing...");
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                                    break;
                            }

                            if (option == 5) {
                                break;
                            }
                        }
                    }
                    break;

                case 3:
                    if (addressBookHashMap.isEmpty()) {
                        System.out.println("No address book found!");
                    } else {
                        System.out.println("\nAddress Books:");
                        int i = 1;
                        for (String key : addressBookHashMap.keySet()) {
                            System.out.println(i + ". " + key);
                            i++;
                        }
                    }
                    break;

                case 4:
                    if (addressBookHashMap.isEmpty()) {
                        System.out.println("No address book found!");
                    } else {
                        System.out.print("Enter address book name to delete: ");
                        String bookNameToDelete = scanner.next();
                        AddressBook bookToDelete = addressBookHashMap.get(bookNameToDelete);
                        if (bookToDelete == null) {
                            System.out.println("Address book not found!");
                        } else {
                            addressBookHashMap.remove(bookNameToDelete);
                            System.out.println("Address book deleted successfully!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting address book application...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
