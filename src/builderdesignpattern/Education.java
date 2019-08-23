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
public class Education { 
    private String Degree ; 
    private String Major; 
    private String school; 
    private int  year;
    
        String Seconddegree ; 
         String secondMajor; 
        String  secondSchool ; 
         int  secondYear ; 
  

    public Education(String Degree, String Major, String school, int year, String Seconddegree, String secondMajor, String secondSchool, int secondYear) {
        this.Degree = Degree;
        this.Major = Major;
        this.school = school;
        this.year = year;
        this.Seconddegree = Seconddegree;
        this.secondMajor = secondMajor;
        this.secondSchool = secondSchool;
        this.secondYear = secondYear;
    }

    public Education(String Degree, String Major, String school, int year) {
        this.Degree = Degree;
        this.Major = Major;
        this.school = school;
        this.year = year;
    }

    public String getDegree() {
        return Degree;
    }

    public String getMajor() {
        return Major;
    }

    public String getSchool() {
        return school;
    }

    public int getYear() {
        return year;
    } 
      public String getSeconddegree() {
        return Seconddegree;
    }

    public String getSecondMajor() {
        return secondMajor;
    }

    public String getSecondSchool() {
        return secondSchool;
    }

    public int getSecondYear() {
        return secondYear;
    }
     
    
    
    
    
}
