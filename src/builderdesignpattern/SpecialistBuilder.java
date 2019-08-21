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
public class SpecialistBuilder  implements Builder { 
     private Personal personal;
    private Address address;
    private Education education ; 
    private Biography biography ;  
    private  Specialization specialization ; 

    @Override
    public void setPerson(Personal personal) {       
        this.personal=personal ; 
    }

    @Override
    public void setAddress(Address address) {    
     this.address = address; 
    }

    @Override
    public void setEducation(Education education) {     
      this.education = education ; 
    }

    @Override
    public void setBiography(Biography biography) {
       this.biography= biography;  //To change body of generated methods, choose Tools | Templates.
    }
      public void setSpecialization(Specialization specialization) {  
          this.specialization = specialization ; 
      }   
      
       public Specialist getResult() {
        return new Specialist(personal, address, education, biography,specialization);
    }
    
}
