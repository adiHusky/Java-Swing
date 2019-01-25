/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.io.File;


/**
 *
 * @author Aditya
 */
public class Person {
    /*Class Person is used as a blueprint in order to include all attributes and methods
    related to Person
    */
    
    private String person_name;
    private String person_dob;
    private String person_ssn;
    private String person_medical_no;
    private String person_hp_no;
    private String person_bankacc_no;
    private String person_linkedin;
    private String person_telephone;
    private String person_fax_no;
    private String person_ip;
    private File   person_photo;
    private String person_email;
    private String person_certificate;
    private String person_vehicle;
    private String person_biometric;
    
    /* All  Attributes of class Person are declared as variables. Datatype of person_photo is File 
    so that object of type File can be passed*/
    
    /* Getters Setters methods defined below */

    public String getPerson_certificate() {
        return person_certificate;
    }

    public void setPerson_certificate(String person_certificate) {
        this.person_certificate = person_certificate;
    }

    public String getPerson_vehicle() {
        return person_vehicle;
    }

    public void setPerson_vehicle(String person_vehicle) {
        this.person_vehicle = person_vehicle;
    }

    public String getPerson_biometric() {
        return person_biometric;
    }

    public void setPerson_biometric(String person_biometric) {
        this.person_biometric = person_biometric;
    }
  
    public String getPerson_email() {
        return person_email;
    }

    public void setPerson_email(String person_email) {
        this.person_email = person_email;
    }
    private File f;

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getPerson_dob() {
        return person_dob;
    }

    public void setPerson_dob(String person_dob) {
        this.person_dob = person_dob;
    }

    public String getPerson_ssn() {
        return person_ssn;
    }

    public void setPerson_ssn(String person_ssn) {
        this.person_ssn = person_ssn;
    }

    public String getPerson_medical_no() {
        return person_medical_no;
    }

    public void setPerson_medical_no(String person_medical_no) {
        this.person_medical_no = person_medical_no;
    }

    public String getPerson_hp_no() {
        return person_hp_no;
    }

    public void setPerson_hp_no(String person_hp_no) {
        this.person_hp_no = person_hp_no;
    }

    public String getPerson_bankacc_no() {
        return person_bankacc_no;
    }

    public void setPerson_bankacc_no(String person_bankacc_no) {
        this.person_bankacc_no = person_bankacc_no;
    }

    public String getPerson_linkedin() {
        return person_linkedin;
    }

    public void setPerson_linkedin(String person_linkedin) {
        this.person_linkedin = person_linkedin;
    }

    public String getPerson_telephone() {
        return person_telephone;
    }

    public void setPerson_telephone(String person_telephone) {
        this.person_telephone = person_telephone;
    }

    public String getPerson_fax_no() {
        return person_fax_no;
    }

    public void setPerson_fax_no(String person_fax_no) {
        this.person_fax_no = person_fax_no;
    }

    public String getPerson_ip() {
        return person_ip;
    }

    public void setPerson_ip(String person_ip) {
        this.person_ip = person_ip;
    }

    public File getPerson_photo() {
        return person_photo;
    }

    public void setPerson_photo(File person_photo) {
        this.person_photo = person_photo;
    }

    /**
     * @param args the command line arguments
     */
  
    
}
