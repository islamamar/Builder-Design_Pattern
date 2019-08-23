/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 123456789
 */
public class PreviewForm extends javax.swing.JFrame {

    /**
     * Creates new form PreviewForm
     */
    public PreviewForm() {
        initComponents();      
        SecondAddressPanel.setVisible(false);
        SecondEducationPanel.setVisible(false);
        SpcializationAreaPanel.setVisible(false);
          Display_information();
        
    } 
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

    public PreviewForm(String FristName, String LastName, String EmailAddress, String webiste, int phone, int LicenseCountry, int LicenseNumber, int PracticeYear, String gender, String degree, String major, String school, int year, String Coutry, String City, String State, String Postcode, String Seconddegree, String secondMajor, String secondSchool, int secondYear, String seocndcountry, String secondCity, String secondState, String secondPostCode, String specializationArea, int startYear) {
         initComponents();
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
        this.State = State;
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
          SecondAddressPanel.setVisible(false);
        SecondEducationPanel.setVisible(false);
        SpcializationAreaPanel.setVisible(false);
           Display_information();
       
    }
 
    
    
   
    
    public void Display_information() 
    {   
        System.out.println("islam");
           Director director = new Director(FristName, LastName, EmailAddress, webiste, phone, LicenseCountry, LicenseNumber, PracticeYear, gender, degree, major, school, year, Coutry, City, State, Postcode, Seconddegree, secondMajor, secondSchool, secondYear, seocndcountry, secondCity, secondState, secondPostCode, specializationArea, startYear);
             
           
           if (specializationArea == null && startYear==0  )
           {
               GeneralBuilder builder = new GeneralBuilder();
               director.constructGeneralDentist(builder);
               General dentist = builder.getResult(); 
               
               
              System.out.println(""+ dentist.getAddress().getCity());             
               FirstNameLabel.setText(dentist.getPersonal().getFirstName());
                 LastNameLabel.setText(dentist.getPersonal().getLastName());
                 EmailLabel.setText(dentist.getPersonal().getEmailAddress());
                 PhoneNumberLabel.setText(dentist.getPersonal().getPhoneNumber()+"");
                 LinkLabel.setText(dentist.getPersonal().getWebSite()); 
                 
                 // show Biograhpy 
                 
                 LicenseCountryLabel.setText(dentist.getBiography().getLicenseCountryNumebr()+"");
                 LicenseNumberLabel.setText(dentist.getBiography().getLicenseNumber()+"");
                 PracticeYearLabel.setText(dentist.getBiography().getYearPractice()+"");
                 GenderLabel.setText(dentist.getBiography().getGender()+""); 
                 //show Education 
                 DegressLabel.setText(dentist.getEducation().getDegree());                 
                  MajorLabel.setText(dentist.getEducation().getMajor());
                 SchoolLabel.setText(dentist.getEducation().getSchool());
                 YearLabel.setText(dentist.getEducation().getYear()+""); 
                 // show Address 
                 CountryLabel.setText(dentist.getAddress().getCountry()) ; 
                 CityLabel.setText(dentist.getAddress().getCity()); 
                 StateLabel.setText(dentist.getAddress().getCity());
                 PostCodeLabel.setText(dentist.getAddress().getPostalCode());
                 
                 
                  if (Seconddegree != null  && secondMajor != null && secondSchool != null&& secondYear !=0)
                  {
                      SecondEducationPanel.setVisible(true); 
                      SecondDegreeLabel.setText(dentist.getEducation().getSeconddegree());
                      SecondMajorLabel.setText(dentist.getEducation().getSecondMajor());
                      SecondYearLabel.setText(dentist.getEducation().getSecondYear()+"");
                  }
                     
                   
               
                  
                    if (seocndcountry != null && secondState != null && secondCity != null && secondPostCode != null)
                      
                    {
                       SecondAddressPanel.setVisible(true); 
                      SecondCounrtyLabel.setText(dentist.getAddress().getSeocndcountry());
                      SecondCityLabel.setText(dentist.getAddress().getSecondCity());
                      SecondStateLabel.setText(dentist.getAddress().getSecondState());
                      PostCodeLabel.setText(dentist.getAddress().getSecondPostCode()+"");
                        
                    }
                 
//               System.out.println("hell");
                    
           
            } 
           else 
           {
               
              SpecialistBuilder builder = new SpecialistBuilder();
           director.constructSpecialistDentist(builder);
               Specialist dentist = builder.getResult();
              System.out.println(""+ dentist.getAddress().getCity()); 
//               System.out.println("damn"); 

                FirstNameLabel.setText(dentist.getPersonal().getFirstName());
                 LastNameLabel.setText(dentist.getPersonal().getLastName());
                 EmailLabel.setText(dentist.getPersonal().getEmailAddress());
                 PhoneNumberLabel.setText(dentist.getPersonal().getPhoneNumber()+"");
                 LinkLabel.setText(dentist.getPersonal().getWebSite()); 
                 
                 // show Biograhpy 
                 
                 LicenseCountryLabel.setText(dentist.getBiography().getLicenseCountryNumebr()+"");
                 LicenseNumberLabel.setText(dentist.getBiography().getLicenseNumber()+"");
                 PracticeYearLabel.setText(dentist.getBiography().getYearPractice()+"");
                 GenderLabel.setText(dentist.getBiography().getGender()+""); 
                 //show Education 
                 DegressLabel.setText(dentist.getEducation().getDegree());                 
                  MajorLabel.setText(dentist.getEducation().getMajor());
                 SchoolLabel.setText(dentist.getEducation().getSchool());
                 YearLabel.setText(dentist.getEducation().getYear()+""); 
                 // show Address 
                 CountryLabel.setText(dentist.getAddress().getCountry()) ; 
                 CityLabel.setText(dentist.getAddress().getCity()); 
                 StateLabel.setText(dentist.getAddress().getCity());
                 PostCodeLabel.setText(dentist.getAddress().getPostalCode());
                 
                 
                  if (Seconddegree != null  && secondMajor != null && secondSchool != null&& secondYear !=0)
                  {
                      SecondEducationPanel.setVisible(true); 
                      SecondDegreeLabel.setText(dentist.getEducation().getSeconddegree());
                      SecondMajorLabel.setText(dentist.getEducation().getSecondMajor());
                      SecondYearLabel.setText(dentist.getEducation().getSecondYear()+"");
                  }
                     
                   
                  
                  
                  if (seocndcountry != null && secondState != null && secondCity != null && secondPostCode != null)
                      
                    {
                       SecondAddressPanel.setVisible(true); 
                      SecondCounrtyLabel.setText(dentist.getAddress().getSeocndcountry());
                      SecondCityLabel.setText(dentist.getAddress().getSecondCity());
                      SecondStateLabel.setText(dentist.getAddress().getSecondState());
                      PostCodeLabel.setText(dentist.getAddress().getSecondPostCode()+"");
                        
                    } 
                  
                  
                  
                  SpcializationAreaPanel.setVisible(true);
                  specializtionLabel.setText(dentist.getSpecialization().getSpcializatioArea());
                  startYearLabel.setText(dentist.getSpecialization().getStartYear()+"");
           } 
           
           
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LicenseCountryLabel = new javax.swing.JLabel();
        LicenseNumberLabel = new javax.swing.JLabel();
        PracticeYearLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        EducationPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        YearLabel = new javax.swing.JLabel();
        DegressLabel = new javax.swing.JLabel();
        MajorLabel = new javax.swing.JLabel();
        SchoolLabel = new javax.swing.JLabel();
        SecondEducationPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        SecondDegreeLabel = new javax.swing.JLabel();
        SecondMajorLabel = new javax.swing.JLabel();
        SecondSchoolLabel = new javax.swing.JLabel();
        SecondYearLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        StateLabel = new javax.swing.JLabel();
        PostCodeLabel = new javax.swing.JLabel();
        CountryLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        SecondAddressPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        SecondCounrtyLabel = new javax.swing.JLabel();
        SecondCityLabel = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        SecondStateLabel = new javax.swing.JLabel();
        SecondPostCodeLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        FirstNameLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        PhoneNumberLabel = new javax.swing.JLabel();
        LinkLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        SpcializationAreaPanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        specializtionLabel = new javax.swing.JLabel();
        startYearLabel = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Biography"));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel9.setText("Licence Country ");

        jLabel10.setText("License Number ");

        jLabel11.setText("Years in practice ");

        jLabel12.setText("Gender");

        LicenseCountryLabel.setText("jLabel1");

        LicenseNumberLabel.setText("jLabel4");

        PracticeYearLabel.setText("jLabel5");

        GenderLabel.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LicenseCountryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(PracticeYearLabel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LicenseNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GenderLabel)
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(LicenseCountryLabel)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(GenderLabel))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(LicenseNumberLabel)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(PracticeYearLabel))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        EducationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Education"));

        jLabel1.setText("Degress");

        jLabel4.setText("Major ");

        jLabel5.setText("School ");

        jLabel6.setText("Year");

        YearLabel.setText("jLabel7");

        DegressLabel.setText("jLabel13");

        MajorLabel.setText("jLabel14");

        SchoolLabel.setText("jLabel15");

        javax.swing.GroupLayout EducationPanelLayout = new javax.swing.GroupLayout(EducationPanel);
        EducationPanel.setLayout(EducationPanelLayout);
        EducationPanelLayout.setHorizontalGroup(
            EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EducationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addComponent(DegressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(YearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MajorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SchoolLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        EducationPanelLayout.setVerticalGroup(
            EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EducationPanelLayout.createSequentialGroup()
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(DegressLabel)))
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(YearLabel))))
                .addGap(18, 18, 18)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(MajorLabel))
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(SchoolLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        SecondEducationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Education_more"));

        jLabel7.setText("Major");

        jLabel13.setText("School");

        jLabel14.setText("Degrees");

        jLabel15.setText("Year");

        SecondDegreeLabel.setText("jLabel16");

        SecondMajorLabel.setText("jLabel17");

        SecondSchoolLabel.setText("jLabel18");

        SecondYearLabel.setText("jLabel19");

        javax.swing.GroupLayout SecondEducationPanelLayout = new javax.swing.GroupLayout(SecondEducationPanel);
        SecondEducationPanel.setLayout(SecondEducationPanelLayout);
        SecondEducationPanelLayout.setHorizontalGroup(
            SecondEducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondEducationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SecondEducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13))
                .addGap(49, 49, 49)
                .addGroup(SecondEducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SecondEducationPanelLayout.createSequentialGroup()
                        .addGroup(SecondEducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SecondMajorLabel)
                            .addComponent(SecondDegreeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(49, 49, 49)
                        .addComponent(SecondYearLabel)
                        .addGap(73, 73, 73))
                    .addGroup(SecondEducationPanelLayout.createSequentialGroup()
                        .addComponent(SecondSchoolLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        SecondEducationPanelLayout.setVerticalGroup(
            SecondEducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondEducationPanelLayout.createSequentialGroup()
                .addGroup(SecondEducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SecondEducationPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(SecondEducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(SecondDegreeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SecondEducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(SecondMajorLabel)))
                    .addGroup(SecondEducationPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(SecondEducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(SecondYearLabel))))
                .addGap(18, 18, 18)
                .addGroup(SecondEducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(SecondSchoolLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));

        jLabel20.setText("Country");

        jLabel21.setText("City");

        jLabel22.setText("Post Code");

        jLabel23.setText("State");

        StateLabel.setText("jLabel24");

        PostCodeLabel.setText("jLabel25");

        CountryLabel.setText("jLabel26");

        CityLabel.setText("jLabel27");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CountryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(59, 59, 59)
                        .addComponent(StateLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PostCodeLabel)))
                .addGap(108, 108, 108))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23)
                    .addComponent(StateLabel)
                    .addComponent(CountryLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(PostCodeLabel)
                    .addComponent(CityLabel))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        SecondAddressPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Address_more"));

        jLabel24.setText("Country");

        jLabel25.setText("City");

        SecondCounrtyLabel.setText("jLabel26");

        SecondCityLabel.setText("jLabel27");

        jLabel28.setText("State");

        jLabel29.setText("Post Code");

        SecondStateLabel.setText("jLabel30");

        SecondPostCodeLabel.setText("jLabel31");

        javax.swing.GroupLayout SecondAddressPanelLayout = new javax.swing.GroupLayout(SecondAddressPanel);
        SecondAddressPanel.setLayout(SecondAddressPanelLayout);
        SecondAddressPanelLayout.setHorizontalGroup(
            SecondAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondAddressPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(SecondAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(SecondAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SecondCityLabel)
                    .addComponent(SecondCounrtyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SecondAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28))
                .addGap(35, 35, 35)
                .addGroup(SecondAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SecondStateLabel)
                    .addComponent(SecondPostCodeLabel))
                .addGap(33, 33, 33))
        );
        SecondAddressPanelLayout.setVerticalGroup(
            SecondAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondAddressPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(SecondAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(SecondCounrtyLabel)
                    .addComponent(jLabel28)
                    .addComponent(SecondStateLabel))
                .addGap(18, 18, 18)
                .addGroup(SecondAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(SecondCityLabel)
                    .addComponent(jLabel29)
                    .addComponent(SecondPostCodeLabel))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        FirstNameLabel.setText("first name ");

        EmailLabel.setText("email");

        LastNameLabel.setText("last name ");

        PhoneNumberLabel.setText("PhoneNumber");

        LinkLabel.setText("Link");

        jLabel16.setText("First Name ");

        jLabel17.setText("Last Name");

        jLabel18.setText("Website ");

        jLabel19.setText("Email");

        jLabel26.setText("PhoneNumber");

        jButton1.setText("Show the widget ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(FirstNameLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(28, 28, 28)
                                .addComponent(LastNameLabel)
                                .addGap(57, 57, 57))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(26, 26, 26)
                                .addComponent(PhoneNumberLabel)
                                .addGap(49, 49, 49)))
                        .addComponent(jLabel18)
                        .addGap(26, 26, 26)
                        .addComponent(LinkLabel)
                        .addContainerGap(338, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(50, 50, 50))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel)
                    .addComponent(LastNameLabel)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton1)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneNumberLabel)
                            .addComponent(LinkLabel)
                            .addComponent(jLabel18)
                            .addComponent(jLabel26)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailLabel)
                            .addComponent(jLabel19))))
                .addContainerGap())
        );

        SpcializationAreaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Area of Specialization"));

        jLabel27.setText("Specialization ");

        jLabel30.setText("year");

        specializtionLabel.setText("jLabel31");

        startYearLabel.setText("jLabel32");

        javax.swing.GroupLayout SpcializationAreaPanelLayout = new javax.swing.GroupLayout(SpcializationAreaPanel);
        SpcializationAreaPanel.setLayout(SpcializationAreaPanelLayout);
        SpcializationAreaPanelLayout.setHorizontalGroup(
            SpcializationAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpcializationAreaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SpcializationAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SpcializationAreaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(116, 116, 116)
                        .addComponent(specializtionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SpcializationAreaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(145, 145, 145)
                        .addComponent(startYearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SpcializationAreaPanelLayout.setVerticalGroup(
            SpcializationAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpcializationAreaPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(SpcializationAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(specializtionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(SpcializationAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(startYearLabel))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EducationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SecondEducationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SecondAddressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SpcializationAreaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpcializationAreaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EducationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(SecondEducationPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SecondAddressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: 
        new WidgetForm(FristName,LastName,degree,Seconddegree,EmailAddress,phone,webiste,Coutry,State,City).setVisible(true); ; 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PreviewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreviewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreviewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreviewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreviewForm().setVisible(true);
            }
        }); 
         
       Director direct ;
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CityLabel;
    private javax.swing.JLabel CountryLabel;
    private javax.swing.JLabel DegressLabel;
    private javax.swing.JPanel EducationPanel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JLabel LicenseCountryLabel;
    private javax.swing.JLabel LicenseNumberLabel;
    private javax.swing.JLabel LinkLabel;
    private javax.swing.JLabel MajorLabel;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JLabel PostCodeLabel;
    private javax.swing.JLabel PracticeYearLabel;
    private javax.swing.JLabel SchoolLabel;
    private javax.swing.JPanel SecondAddressPanel;
    private javax.swing.JLabel SecondCityLabel;
    private javax.swing.JLabel SecondCounrtyLabel;
    private javax.swing.JLabel SecondDegreeLabel;
    private javax.swing.JPanel SecondEducationPanel;
    private javax.swing.JLabel SecondMajorLabel;
    private javax.swing.JLabel SecondPostCodeLabel;
    private javax.swing.JLabel SecondSchoolLabel;
    private javax.swing.JLabel SecondStateLabel;
    private javax.swing.JLabel SecondYearLabel;
    private javax.swing.JPanel SpcializationAreaPanel;
    private javax.swing.JLabel StateLabel;
    private javax.swing.JLabel YearLabel;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel specializtionLabel;
    private javax.swing.JLabel startYearLabel;
    // End of variables declaration//GEN-END:variables
}
