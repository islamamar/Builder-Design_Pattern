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
public class Specialization {
     private String  SpcializatioArea;  
     private int StartYear; 

    public Specialization(String SpcializatioArea, int StartYear) {
        this.SpcializatioArea = SpcializatioArea;
        this.StartYear = StartYear;
    }

    public String  getSpcializatioArea() {
        return SpcializatioArea;
    }

    public int getStartYear() {
        return StartYear;
    }
     
     
     
     
    
}
