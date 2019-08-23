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
     private String PostalCode ;  
     
    
     private String seocndcountry ; 
     private  String secondState; 
     private  String secondCity;     
     private String secondPostCode ;  
     

    public Address(String Country, String State, String City, String PostalCode) {
        this.Country = Country;
        this.State = State;
        this.City = City;      
        this.PostalCode = PostalCode;
    } 

    public Address(String Country, String State, String City, String PostalCode, String seocndcountry, String secondState, String secondCity, String secondPostCode) {
        this.Country = Country;
        this.State = State;
        this.City = City;
        this.PostalCode = PostalCode;
        this.seocndcountry = seocndcountry;
        this.secondState = secondState;
        this.secondCity = secondCity;
        this.secondPostCode = secondPostCode;
    }

    

    public String getSeocndcountry() {
        return seocndcountry;
    }

    public String getSecondState() {
        return secondState;
    }

    public String getSecondCity() {
        return secondCity;
    }

    public String getSecondPostCode() {
        return secondPostCode;
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

  

    public String getPostalCode() {
        return PostalCode;
    }

    @Override
    public String toString() {
        return "Address{" + "Country=" + Country + ", State=" + State + ", City=" + City + ", PostalCode=" + PostalCode + ", seocndcountry=" + seocndcountry + ", secondState=" + secondState + ", secondCity=" + secondCity + ", secondPostCode=" + secondPostCode + '}';
    }

     
             
    
    
}
