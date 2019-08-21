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
public interface Builder {  
    void setPerson(Personal personal);
    void setAddress(Address address);
    void setEducation(Education education);
    void setBiography(Biography biography);
    
    
    
    
}
