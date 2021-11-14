package com.bridgelabzAddressBookValidation;
import java.util.HashMap;
import java.util.Scanner;
//write a java program to ad new details of person
public class Addressjava{
    static String name;
    static boolean is_Running=false;

    public static void main(String[] args){

        System.out.println("Welcome to the ADDRESS BOOK");
        HashMap<String,ContactInfo1> addressBook = new HashMap<>();

        while (!is_Running) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 to create a new contact and 2 to exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                ContactInfo1 contact = new ContactInfo1();
                contact.setContactInfo();
                name = contact.firstName + " " + contact.lastName;
                addressBook.put(name, contact);
                addressBook.get(name).displayContactInfo();
            }else if (choice==2){
                is_Running = true;
            }
        }    }
}

class ContactInfo1{
    String firstName,lastName,address,city,state,zipcode,phoneNo,email;

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setState(String state){
        this.state=state;
    }
    public void setZipcode(String zipcode){
        this.zipcode=zipcode;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo=phoneNo;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public void setContactInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name:");
        setFirstName(sc.nextLine());
        System.out.print("Last Name");
        setLastName(sc.nextLine());
        System.out.print("Address:");
        setAddress(sc.nextLine());
        System.out.print("City:");
        setCity(sc.nextLine());
        System.out.print("State:");
        setState(sc.nextLine());
        System.out.print("Zipcode:");
        setZipcode(sc.nextLine());
        System.out.print(" PhoneNO:");
        setPhoneNo(sc.nextLine());
        System.out.print(" Email");
        setEmail(sc.nextLine());
    }
    public void displayContactInfo(){
        System.out.print(" First Name: "+firstName+"\n Last Name: "+lastName+"\n Address: "+address+
                "\n City: "+city+"\n State: "+state+ "\n Zipcode: "+zipcode+"\n PhoneNO: "+phoneNo+"\n Email: "+email+"\n");
    }
}