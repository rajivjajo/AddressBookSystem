package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void menuChoose(AddressBook addressDetails) {
        Scanner scanner = new Scanner(System.in);
        int chooseOption;
        do {
            System.out.println("Enter task from menu you want to perform : ");
            System.out.println("1. Add Details \n2. Edit Details \n3. Delete Details \n4. Display Details \n5. exit ");
            chooseOption = scanner.nextInt();
            switch (chooseOption) {
                case 1:
                    System.out.println("Add Details");
                    addressDetails.addContacts();
                    break;
                case 2:
                    System.out.println("Edit Details");
                    addressDetails.addContacts();
                    break;
                case 3:
                    System.out.println("Delete Details");
                    addressDetails.deleteContacts();
                    break;
                case 4:
                    System.out.println("Display Contacts");
                    addressDetails.displayContacts();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option chosen");
                    break;
            }
        }while (chooseOption != 5);

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System Program!  ");
        AddressBook addressDetails = new AddressBook();
        menuChoose(addressDetails);


    }
}
