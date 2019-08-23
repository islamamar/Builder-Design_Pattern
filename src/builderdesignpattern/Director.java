/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

import javax.swing.JOptionPane;

/**
 *
 * @author 123456789
 */ 
 // dirctor class manage all construction 
// contain all input fields
public class Director {  
    
    
    
    
    
         String FristName ;
         String LastName ;
         String EmailAddress ;
         String webiste ;
         int phone;
         int  LicenseCountry;
         int LicenseNumber ;
         int PracticeYear;  
         String gender;          
         String degree; 
         String major ; 
         String school ; 
         int  year ; 
         String Coutry; 
         String City ; 
         String State; 
         String Postcode  ; 
         
         String Seconddegree ; 
         String secondMajor; 
        String  secondSchool ; 
        int  secondYear ; 
        
        String seocndcountry  ; 
        String secondCity ; 
        String secondState ; 
        String secondPostCode; 
        String specializationArea; 
        int startYear ;  
        
        public Director() 
        {
            
        }
  public Director(String FristName, String LastName, String EmailAddress, String webiste, int phone, int LicenseCountry, int LicenseNumber, int PracticeYear, String gender, String degree, String major, String school, int year, String Coutry, String City,String State, String Postcode, String Seconddegree, String secondMajor, String secondSchool, int secondYear, String seocndcountry, String secondCity, String secondState, String secondPostCode, String specializationArea, int startYear) {
        this.FristName = FristName;
        this.LastName = LastName;
        this.EmailAddress = EmailAddress;
        this.webiste = webiste;
        this.phone = phone;
        this.LicenseCountry = LicenseCountry;
        this.LicenseNumber = LicenseNumber;
        this.PracticeYear = PracticeYear;
        this.gender = gender;
        this.degree = degree;
        this.major = major;
        this.school = school;
        this.year = year;
        this.Coutry = Coutry;
        this.City = City;
        this.State= State; 
        this.Postcode = Postcode;
        this.Seconddegree = Seconddegree;
        this.secondMajor = secondMajor;
        this.secondSchool = secondSchool;
        this.secondYear = secondYear;
        this.seocndcountry = seocndcountry;
        this.secondCity = secondCity;
        this.secondState = secondState;
        this.secondPostCode = secondPostCode;
        this.specializationArea = specializationArea;
        this.startYear = startYear;
        System.out.println("sad"+toString());   
      
       
        
    }
      
    
     public void constructSpecialistDentist(Builder builder) {  
     
         
        builder.setPerson(new Personal(FristName, LastName, EmailAddress, webiste, phone));  
        if (seocndcountry == null  && secondState == null && secondCity== null&& secondPostCode == null)
            
        builder.setAddress(new Address(Coutry, State, City, Postcode) );
        else
              builder.setAddress(new Address(Coutry, State, City, Postcode, seocndcountry, secondState, secondCity, secondPostCode) );
         
              if (Seconddegree == null  && secondMajor == null && secondSchool == null&& secondYear ==0)
             builder.setEducation(new Education(degree, major, school, year)); 
           else  
               builder.setEducation(new Education(degree, major, school, year, Seconddegree, secondMajor, secondSchool, secondYear));   
               builder.setBiography( new Biography(LicenseCountry, LicenseNumber, PracticeYear, gender));
               builder.Specialization(new Specialization(specializationArea, startYear));
                
               
    }

    public void constructGeneralDentist(Builder builder) {
            
       builder.setPerson(new Personal(FristName, LastName, EmailAddress, webiste, phone)); 
       
        if (seocndcountry == null  && secondState == null && secondCity== null&& secondPostCode == null)
            
        builder.setAddress(new Address(Coutry, State, City, Postcode) );
        else
              builder.setAddress(new Address(Coutry, State, City, Postcode, seocndcountry, secondState, secondCity, secondPostCode) );
         
           if (Seconddegree == null  && secondMajor == null && secondSchool == null&& secondYear ==0)
             builder.setEducation(new Education(degree, major, school, year)); 
           else  
               builder.setEducation(new Education(degree, major, school, year, Seconddegree, secondMajor, secondSchool, secondYear));   
               builder.setBiography( new Biography(LicenseCountry, LicenseNumber, PracticeYear, gender));
              builder.Specialization(new Specialization(null, 0));
    }  

    @Override
    public String toString() {
        return "Director{" + "FristName=" + FristName + ", LastName=" + LastName + ", EmailAddress=" + EmailAddress + ", webiste=" + webiste + ", phone=" + phone + ", LicenseCountry=" + LicenseCountry + ", LicenseNumber=" + LicenseNumber + ", PracticeYear=" + PracticeYear + ", gender=" + gender + ", degree=" + degree + ", major=" + major + ", school=" + school + ", year=" + year + ", Coutry=" + Coutry + ", City=" + City + ", State=" + State + ", Postcode=" + Postcode + ", Seconddegree=" + Seconddegree + ", secondMajor=" + secondMajor + ", secondSchool=" + secondSchool + ", secondYear=" + secondYear + ", seocndcountry=" + seocndcountry + ", secondCity=" + secondCity + ", secondState=" + secondState + ", secondPostCode=" + secondPostCode + ", specializationArea=" + specializationArea + ", startYear=" + startYear + '}';
    }
    
    
}
 
