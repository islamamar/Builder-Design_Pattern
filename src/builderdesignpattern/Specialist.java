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
public class Specialist  { 
       private Personal personal;
    private Address address;
    private Education education ; 
    private Biography biography ;  
    private  Specialization specialization ; 

    public Specialist(Personal personal, Address address, Education education, Biography biography, Specialization specialization) {
        this.personal = personal;
        this.address = address;
        this.education = education;
        this.biography = biography;
        this.specialization = specialization;
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

    public Specialization getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "Specialist{" + "personal=" + personal + ", address=" + address + ", education=" + education + ", biography=" + biography + ", specialization=" + specialization + '}';
    }
    
    
}
