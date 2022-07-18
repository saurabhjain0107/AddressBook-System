package com.bridgelabz;

public class AddressBook {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private long zip;
    private long phoneNumber;
    private String Email;

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

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public static void main(String[] args) {
        AddressBook myEntry = new AddressBook();
    
        System.out.println("my name is :"+ myEntry.getFirstName());
        System.out.println("my last  name is :"+ myEntry.getLastName());
        System.out.println("Address is :" + myEntry.getAddress());
        System.out.println("city is :" + myEntry.getCity());
        System.out.println("state is :" + myEntry.getState());
        System.out.println("zip is :" + myEntry.getZip());
        System.out.println("Email is :"+ myEntry.getEmail());
        System.out.println("Phone number is :" + myEntry.getPhoneNumber());
    }

}
































