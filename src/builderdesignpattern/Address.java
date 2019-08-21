/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

/**
 *
 * @author 123456789
 */
public class Address { 
     private String FirstName ; 
     private  String LastName; 
     private  String EmailAddress; 
     private String Website;
     private String phoneNumber ; 

    public Address(String FirstName, String LastName, String EmailAddress, String Website, String phoneNumber) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.EmailAddress = EmailAddress;
        this.Website = Website;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public String getWebsite() {
        return Website;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
     
     
     
             
    
    
}
