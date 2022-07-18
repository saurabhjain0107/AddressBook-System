package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook{
    static String name;
    static boolean is_Running=false;

    public static void main(String[] args){

        System.out.println("Welcome to the ADDRESS BOOK");
        HashMap<String,ContactInfo> addressBook = new HashMap<>();

        while (!is_Running) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 to create a new contact and 2 to exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                ContactInfo contact = new ContactInfo();
                contact.setContactInfo();
                name = contact.firstName + " " + contact.lastName;
                addressBook.put(name, contact);
                addressBook.get(name).displayContactInfo();
            }else if (choice==2){
                is_Running = true;
            }
        }
    }
}

class ContactInfo{
    String firstName,lastName,address,city,state,zipcode,phoneNo,email;

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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: \n Last Name: \n Address: \n City: \n State: \n Zipcode: \n PhoneNO: \n Email: \n");
        setFirstName(sc.nextLine());
        setLastName(sc.nextLine());
        setAddress(sc.nextLine());
        setCity(sc.nextLine());
        setState(sc.nextLine());
        setZipcode(sc.nextLine());
        setPhoneNo(sc.nextLine());
        setEmail(sc.nextLine());
    }
    public void displayContactInfo(){
        System.out.print(" First Name: "+firstName+"\n Last Name: "+lastName+"\n Address: "+address+
                "\n City: "+city+"\n State: "+state+ "\n Zipcode: "+zipcode+"\n PhoneNO: "+phoneNo+"\n Email: "+email+"\n");
    }
}






























