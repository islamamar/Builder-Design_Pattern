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
     private int SpcializatioYear;  
     private int StartYear; 

    public Specialization(int SpcializatioYear, int StartYear) {
        this.SpcializatioYear = SpcializatioYear;
        this.StartYear = StartYear;
    }

    public int getSpcializatioYear() {
        return SpcializatioYear;
    }

    public int getStartYear() {
        return StartYear;
    }
     
     
     
     
    
}
