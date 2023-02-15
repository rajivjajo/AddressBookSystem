package com.bridgelabz;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to address book program");

        AddressBook a1 = new AddressBook();
        a1.addContact();
        System.out.println("***************************");

        a1.addContact();
        System.out.println(a1.list);

        a1.editContact();
        System.out.println(a1.list);

        a1.deleteContact();
        System.out.println(a1.list);

        a1.addMultipleAddressBook();

    }
}
