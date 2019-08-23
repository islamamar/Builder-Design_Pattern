/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 123456789
 */
public class PortalForm extends javax.swing.JFrame {

    /**
     * Creates new form PortalForm
     */  
   
     
    
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
         String   specializationArea; 
         int   startYear ; 
        
         
         
    public PortalForm() {
        initComponents();
        
       
        
    }  

    public PortalForm(String FristName, String LastName, String EmailAddress, String webiste, int phone, int LicenseCountry, int LicenseNumber, int PracticeYear, String gender, String degree, String major, String school, int year, String Coutry, String City, String Postcode, String Seconddegree, String secondMajor, String secondSchool, int secondYear, String seocndcountry, String secondCity, String secondState, String secondPostCode, String specializationArea, int startYear) {
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
    }
      
    
    // insert newdentist information 
     public void InsertNewDentist()
     { 
          FristName = firstnametext.getText() ; 
          LastName = lastnametext.getText();
          EmailAddress =EmailAddresstext.getText(); 
          webiste = websitetext.getText(); 
           phone = Integer.parseInt(phonetext.getText());
         
     }  
     // insert Biography information 
     public void InsertBiography()
     {
           LicenseCountry = Integer.parseInt(licensecountrytext.getText());  
          LicenseNumber =  Integer.parseInt(licensenumbertext.getText())  ; 
          PracticeYear=  Integer.parseInt(practiceyeartext.getText()) ; 
          gender = gendertext.getText(); 
         
         
     } 
     public void InsertEducation()
     { 
          degree = degreestext.getText(); 
          major = majortext.getText(); 
          school= schooltext.getText() ; 
          year = Integer.parseInt(yeartext.getText()); 
        
     } 
     public void InsertAddress() 
     {
          Coutry = countrytext.getText(); 
          City = citytext.getText(); 
          State = statetext.getText(); 
          Postcode = postcodetext.getText() ; 
     }
     
    
     
     

    @Override
    public String toString() {
        return "PortalForm{" + "FristName=" + FristName + ", LastName=" + LastName + ", EmailAddress=" + EmailAddress + ", webiste=" + webiste + ", phone=" + phone + ", LicenseCountry=" + LicenseCountry + ", LicenseNumber=" + LicenseNumber + ", PracticeYear=" + PracticeYear + ", gender=" + gender + ", degree=" + degree + ", major=" + major + ", year=" + year + ", Coutry=" + Coutry + ", City=" + City + ", State=" + State + ", Postcode=" + Postcode + ", Seconddegree=" + Seconddegree + ", secondMajor=" + secondMajor + ", secondSchool=" + secondSchool + ", secondYear=" + secondYear + ", seocndcountry=" + seocndcountry + ", secondCity=" + secondCity + ", secondState=" + secondState + ", secondPostCode=" + secondPostCode + '}';
    }
   
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstnametext = new javax.swing.JTextField();
        EmailAddresstext = new javax.swing.JTextField();
        websitetext = new javax.swing.JTextField();
        lastnametext = new javax.swing.JTextField();
        phonetext = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        licensecountrytext = new javax.swing.JTextField();
        licensenumbertext = new javax.swing.JTextField();
        practiceyeartext = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        gendertext = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        degreestext = new javax.swing.JTextField();
        majortext = new javax.swing.JTextField();
        schooltext = new javax.swing.JTextField();
        yeartext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        countrytext = new javax.swing.JTextField();
        citytext = new javax.swing.JTextField();
        statetext = new javax.swing.JTextField();
        postcodetext = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        SpecailistCheckbox = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("New Dentist"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, -1));

        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 30, -1, -1));

        jLabel4.setText("Website");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 93, 66, -1));

        jLabel5.setText("Email Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 62, -1, -1));

        jLabel6.setText("Phone");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 62, 50, -1));
        jPanel1.add(firstnametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 27, 129, -1));
        jPanel1.add(EmailAddresstext, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 59, 130, -1));
        jPanel1.add(websitetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 90, 130, -1));
        jPanel1.add(lastnametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 27, 127, -1));
        jPanel1.add(phonetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 59, 127, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 632, 120));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Biography"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("License Country");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, -1));

        jLabel7.setText("License Number ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 68, -1, -1));

        jLabel8.setText("Years In Practice ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 106, -1, -1));
        jPanel2.add(licensecountrytext, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 27, 111, -1));
        jPanel2.add(licensenumbertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 65, 110, -1));
        jPanel2.add(practiceyeartext, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 103, 112, -1));

        jLabel9.setText("Gender");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));
        jPanel2.add(gendertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 610, 130));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Education"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 41, -1, -1));

        jLabel11.setText("Degrees");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 55, -1, -1));

        jLabel12.setText("Major ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 93, -1, -1));

        jLabel13.setText("School ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 135, -1, -1));

        jLabel14.setText("Year");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 32, -1));
        jPanel3.add(degreestext, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 52, 135, -1));
        jPanel3.add(majortext, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 90, 135, -1));

        schooltext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schooltextActionPerformed(evt);
            }
        });
        jPanel3.add(schooltext, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 132, 135, -1));
        jPanel3.add(yeartext, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 152, -1));

        jButton1.setText("Add More");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 620, 170));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("County");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 36, -1, -1));

        jLabel16.setText("City");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 74, -1, -1));

        jLabel17.setText("State");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel18.setText("Post Code");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jButton2.setText("Add More");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));
        jPanel4.add(countrytext, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 36, 160, -1));
        jPanel4.add(citytext, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 74, 160, -1));
        jPanel4.add(statetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 160, -1));
        jPanel4.add(postcodetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 160, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 620, 130));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Speciality"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SpecailistCheckbox.setText("is Specialist");
        SpecailistCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecailistCheckboxActionPerformed(evt);
            }
        });
        jPanel5.add(SpecailistCheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 41, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 630, 80));

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, 90, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void schooltextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schooltextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schooltextActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:  
        InsertNewDentist();
        InsertBiography();
        InsertEducation();
        InsertAddress() ;  
      new PreviewForm(FristName, LastName, EmailAddress, webiste, phone, LicenseCountry, LicenseNumber, PracticeYear, gender, degree, major, school, year, Coutry, City,State, Postcode, Seconddegree, secondMajor, secondSchool, secondYear, seocndcountry, secondCity, secondState, secondPostCode, specializationArea, startYear).setVisible(true);
       
        
        
      //  System.out.println(toString());
        
        
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: 
//        new EducationForm().setVisible(true);
            JTextField degreeinput = new JTextField();
             JTextField majorinput = new JTextField(); 
              JTextField schoolinput = new JTextField(); 
               JTextField yearinput = new JTextField(); 
             Object[] fields ={
                 "Degrees ", degreeinput, 
                   "Major", majorinput,
                     "School", schoolinput,
                       "Year", yearinput,
             };
             int dialog= JOptionPane.showConfirmDialog(null, fields, "Education", JOptionPane.CANCEL_OPTION) ; 
            
             
             
             if(JOptionPane.OK_OPTION == dialog)
             {
                this.Seconddegree=degreeinput.getText(); 
                this.secondMajor = majorinput.getText(); 
                this.secondSchool= schoolinput.getText();
                this.secondYear= Integer.parseInt(yearinput.getText()) ;  
                
             }
             

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         JTextField countryinput = new JTextField();
             JTextField Cityinput = new JTextField(); 
              JTextField Stateinput = new JTextField(); 
               JTextField Postcodeinput = new JTextField(); 
             Object[] fields ={
                 "Country ", countryinput, 
                   "City", Cityinput,
                     "State", Stateinput,
                       "PostCode", Postcodeinput,
             };
             int dialog= JOptionPane.showConfirmDialog(null, fields, "Address", JOptionPane.CANCEL_OPTION) ; 
            
             
       
             
             if(JOptionPane.OK_OPTION == dialog)
             {
                this.seocndcountry=countryinput.getText(); 
                this.secondCity = Cityinput.getText(); 
                this.secondState= Stateinput.getText();
                this.secondPostCode= Postcodeinput.getText();  
                
             }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SpecailistCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecailistCheckboxActionPerformed
        // TODO add your handling code here: 
        if (SpecailistCheckbox.isSelected())
        {
              JTextField specializationAreaInput = new JTextField();
             JTextField startYearInput = new JTextField(); 
             
             Object[] fields ={
                 "Area of Specialization ", specializationAreaInput, 
                   "Start Year", startYearInput,
                    
             };
             int dialog= JOptionPane.showConfirmDialog(null, fields, "Address", JOptionPane.CANCEL_OPTION) ; 
            
             
       
             
             if(JOptionPane.OK_OPTION == dialog)
             {
               this.specializationArea= specializationAreaInput.getText(); 
               this.startYear = Integer.parseInt(startYearInput.getText());
                
             }
        }
           
    }//GEN-LAST:event_SpecailistCheckboxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PortalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PortalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PortalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PortalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PortalForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailAddresstext;
    private javax.swing.JCheckBox SpecailistCheckbox;
    private javax.swing.JTextField citytext;
    private javax.swing.JTextField countrytext;
    private javax.swing.JTextField degreestext;
    private javax.swing.JTextField firstnametext;
    private javax.swing.JTextField gendertext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField lastnametext;
    private javax.swing.JTextField licensecountrytext;
    private javax.swing.JTextField licensenumbertext;
    private javax.swing.JTextField majortext;
    private javax.swing.JTextField phonetext;
    private javax.swing.JTextField postcodetext;
    private javax.swing.JTextField practiceyeartext;
    private javax.swing.JTextField schooltext;
    private javax.swing.JTextField statetext;
    private javax.swing.JTextField websitetext;
    private javax.swing.JTextField yeartext;
    // End of variables declaration//GEN-END:variables
}
