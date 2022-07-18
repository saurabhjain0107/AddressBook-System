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
        myEntry.setFirstName("Saurabh");
        myEntry.setLastName("Jain");
        myEntry.setAddress("Jain calony");
        myEntry.setCity("bhopal");
        myEntry.setState("mp");
        myEntry.setZip(462001);
        myEntry.setPhoneNumber(987654321);
        myEntry.setEmail("saurabh08@gmail.com");
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




































//        ABS myEntry= new ABS();
//        String firstName="bridgelabz" ;
//        String lastName="RFP-169" ;
//        String address="mango";
//        String city="jsr";
//        String state="jharkhand";
//        long zip=021;
//
//        long phoneNumber = 1256234581;
//        String Email="mango@123.gmAIL.Com";
//
//
//
//        myEntry.setFirstName(firstName);
//        myEntry.setLastName(lastName);
//        myEntry.setAddress(address);
//        myEntry.setCity(city);
//        myEntry.setZip(zip);
//        myEntry.setEmail(Email);
//        myEntry.setPhoneNumber(phoneNumber);
//        myEntry.setState(address);
//
//
//
//        System.out.println("My name is :"+ myEntry.getFirstName());
//        System.out.println("My Last name is"+myEntry.getLastName());
//        System.out.println("adress is "+myEntry.getAddress());
//        System.out.println("city is"+myEntry.getCity());
//        System.out.println("phone number is"+myEntry.getPhoneNumber());
//        System.out.println("state is"+myEntry.getState());
//        System.out.println("zip number is"+myEntry.getZip());



