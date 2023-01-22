package com.bridgelabz.addressbook;
    public class Contacts {
        private String firstName , lastName , address , city , state , email;
        private Long phoneNumber;
        private int zip;
        public Contacts() {
        }

        public Contacts(String firstName, String lastName, String address, String city, String state, Long phoneNumber ,int zip , String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.zip = zip;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(Long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        public int getZip(){
            return zip ;
        }
        public void setZip(){
            this.zip = zip;
        }


        }

