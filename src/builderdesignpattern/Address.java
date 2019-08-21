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
     private String Country ; 
     private  String State; 
     private  String City; 
     private String Street;
     private String PostalCode ; 

    public Address(String Country, String State, String City, String Street, String PostalCode) {
        this.Country = Country;
        this.State = State;
        this.City = City;
        this.Street = Street;
        this.PostalCode = PostalCode;
    }

    public String getCountry() {
        return Country;
    }

    public String getState() {
        return State;
    }

    public String getCity() {
        return City;
    }

    public String getStreet() {
        return Street;
    }

    public String getPostalCode() {
        return PostalCode;
    }

     
             
    
    
}
