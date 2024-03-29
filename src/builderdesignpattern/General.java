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
public class General {
       private Personal personal;
    private Address address;
    private Education education ; 
    private Biography biography ; 

    public General(Personal personal, Address address, Education education, Biography biography) {
        this.personal = personal;
        this.address = address;
        this.education = education;
        this.biography = biography;
    } 

    public Personal getPersonal() {
        return personal;
    }

    public Address getAddress() {
        return address;
    }

    public Education getEducation() {
        return education;
    }

    public Biography getBiography() {
        return biography;
    }
 
    
    @Override
    public String toString() {
        return "General{" + "personal=" + personal + ", address=" + address + ", education=" + education + ", biography=" + biography + '}';
    }
    
    
    
}
