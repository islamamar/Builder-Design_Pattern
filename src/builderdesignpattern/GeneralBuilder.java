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
public class GeneralBuilder implements Builder{ 
      private Personal personal;
    private Address address;
    private Education education ; 
    private Biography biography ; 
   

    @Override
    public void setPerson(Personal personal) {
        //To change body of generated methods, choose Tools | Templates. 
       this.personal= personal ; 
    }

    @Override
    public void setAddress(Address address) {
       //To change body of generated methods, choose Tools | Templates. 
       this.address = address; 
    }

    @Override
    public void setEducation(Education education) {
         //To change body of generated methods, choose Tools | Templates. 
         this.education = education ; 
    }

    @Override
    public void setBiography(Biography biography) {
        //To change body of generated methods, choose Tools | Templates. 
        this.biography= biography;
    } 
   public General getResult() {
        return new General(personal, address, education, biography);
    }
}

