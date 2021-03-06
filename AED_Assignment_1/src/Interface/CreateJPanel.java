/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Person;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author Aditya
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    Person person;

    /**
     * Creates new form CreateJPanel
     */
   
    CreateJPanel(Person person) {
        initComponents();
        this.person=person; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        title_label = new javax.swing.JLabel();
        photo_submit_button = new javax.swing.JButton();
        submit_button = new javax.swing.JButton();
        ssn_textfield = new javax.swing.JTextField();
        medical_label = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        name_textfield = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        dob_textfield = new javax.swing.JTextField();
        dob_label = new javax.swing.JLabel();
        telephone_textfield = new javax.swing.JTextField();
        telephone_label = new javax.swing.JLabel();
        fax_textfield = new javax.swing.JTextField();
        fax_label = new javax.swing.JLabel();
        ssn_label = new javax.swing.JLabel();
        medical_textfield = new javax.swing.JTextField();
        email_label = new javax.swing.JLabel();
        email_textfield = new javax.swing.JTextField();
        hp_textfield = new javax.swing.JTextField();
        ip_textfield = new javax.swing.JTextField();
        ip_label = new javax.swing.JLabel();
        certificate_textfield = new javax.swing.JTextField();
        certificate_label = new javax.swing.JLabel();
        biometric_textfield = new javax.swing.JTextField();
        bank_acc_textfield = new javax.swing.JTextField();
        bank_acc_label = new javax.swing.JLabel();
        linkedin_textfield = new javax.swing.JTextField();
        linkedin_label = new javax.swing.JLabel();
        biometric_label = new javax.swing.JLabel();
        vehicle_textfield = new javax.swing.JTextField();
        fax_label1 = new javax.swing.JLabel();
        healthplan_label = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title_label.setText("Create Person Profile");
        add(title_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        photo_submit_button.setText("Choose Photo");
        photo_submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photo_submit_buttonActionPerformed(evt);
            }
        });
        add(photo_submit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 119, -1, -1));

        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });
        add(submit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 408, -1, -1));

        ssn_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssn_textfieldActionPerformed(evt);
            }
        });
        add(ssn_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 338, 113, -1));

        medical_label.setText("Medical Record No :");
        add(medical_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 364, -1, -1));

        image.setText(null);
        image.setAlignmentY(0.0F);
        add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 68, 100, 110));

        name_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_textfieldActionPerformed(evt);
            }
        });
        add(name_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 208, 113, -1));

        name_label.setText("Name :");
        add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 211, -1, -1));

        dob_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_textfieldActionPerformed(evt);
            }
        });
        add(dob_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 234, 113, -1));

        dob_label.setText("Date of Birth :");
        add(dob_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 234, -1, -1));

        telephone_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephone_textfieldActionPerformed(evt);
            }
        });
        add(telephone_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 260, 113, -1));

        telephone_label.setText("Telephone No :");
        add(telephone_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 260, -1, -1));

        fax_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fax_textfieldActionPerformed(evt);
            }
        });
        add(fax_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 286, 113, -1));

        fax_label.setText("FAX No :");
        add(fax_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 289, -1, -1));

        ssn_label.setText("Social Security No :");
        add(ssn_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 338, -1, -1));

        medical_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medical_textfieldActionPerformed(evt);
            }
        });
        add(medical_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 364, 113, -1));

        email_label.setText("Email Address :");
        add(email_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 315, -1, -1));

        email_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textfieldActionPerformed(evt);
            }
        });
        add(email_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 312, 113, -1));

        hp_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hp_textfieldActionPerformed(evt);
            }
        });
        add(hp_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 313, 113, -1));

        ip_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ip_textfieldActionPerformed(evt);
            }
        });
        add(ip_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 209, 113, -1));

        ip_label.setText("IP address:");
        add(ip_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 212, -1, -1));

        certificate_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certificate_textfieldActionPerformed(evt);
            }
        });
        add(certificate_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 235, 113, -1));

        certificate_label.setText("Certificate No:");
        add(certificate_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 235, -1, -1));

        biometric_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biometric_textfieldActionPerformed(evt);
            }
        });
        add(biometric_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 261, 113, -1));

        bank_acc_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bank_acc_textfieldActionPerformed(evt);
            }
        });
        add(bank_acc_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 339, 113, -1));

        bank_acc_label.setText("Bank Account No :");
        add(bank_acc_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 339, -1, -1));

        linkedin_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkedin_textfieldActionPerformed(evt);
            }
        });
        add(linkedin_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 365, 113, -1));

        linkedin_label.setText("LinkedIn Link :");
        add(linkedin_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 371, -1, -1));

        biometric_label.setText("Biometric Identifier:");
        add(biometric_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 261, -1, -1));

        vehicle_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicle_textfieldActionPerformed(evt);
            }
        });
        add(vehicle_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 287, 113, -1));

        fax_label1.setText("Vehicle Serial No:");
        add(fax_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 290, -1, -1));

        healthplan_label.setText("Health Plan Beneficiary No :");
        add(healthplan_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 313, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void photo_submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photo_submit_buttonActionPerformed
        // TODO add your handling code here:
        //This code will get executed when you click on Choose Photo
        //Instance of JFilechooser is created to open the dialog box
        JFileChooser filechooser = new JFileChooser();
        //Return value if approve (yes is chosen.
        int result = filechooser.showOpenDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION){
          //Instance of selected file is created
          File file = filechooser.getSelectedFile();
           try{
             Image img = null;
             //instance of image is created by reading file
             img = ImageIO.read(file);
             //Scaling of selected image file is done
             Image resizedImage = img.getScaledInstance(119, 108,  Image.SCALE_DEFAULT);
             //instance of ImageIcon is created in order to set it in JLabel
             var resizedImageIcon = new ImageIcon(resizedImage);
             image.setIcon(resizedImageIcon);
             image.setSize(119,108);
          }catch (NullPointerException | IOException | IllegalArgumentException e){
            System.out.print("error");
          }
             person.setPerson_photo(file);
             JOptionPane.showMessageDialog(null, "Photo loaded Successfully");
        }
    
    }//GEN-LAST:event_photo_submit_buttonActionPerformed
 
    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        // TODO add your handling code here:
        //this code will get executed when user clicks on Submit button
        person.setPerson_linkedin(linkedin_textfield.getText());
        person.setPerson_bankacc_no(bank_acc_textfield.getText());
        person.setPerson_hp_no(hp_textfield.getText());
        person.setPerson_ssn(ssn_textfield.getText());
        person.setPerson_medical_no(medical_textfield.getText());
        person.setPerson_email(email_textfield.getText());
        person.setPerson_telephone(telephone_textfield.getText());
        person.setPerson_dob(dob_textfield.getText());
        person.setPerson_fax_no(fax_textfield.getText());
        person.setPerson_name(name_textfield.getText());
        person.setPerson_biometric(biometric_textfield.getText());
        person.setPerson_certificate(certificate_textfield.getText());
        person.setPerson_ip(ip_textfield.getText());
        person.setPerson_vehicle(vehicle_textfield.getText());
        
        JOptionPane.showMessageDialog(null, "Created Profile Successfully");
        
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void ssn_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssn_textfieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ssn_textfieldActionPerformed

    private void name_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_textfieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_name_textfieldActionPerformed

    private void dob_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob_textfieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_dob_textfieldActionPerformed

    private void telephone_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telephone_textfieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_telephone_textfieldActionPerformed

    private void fax_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fax_textfieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_fax_textfieldActionPerformed

    private void medical_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medical_textfieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_medical_textfieldActionPerformed

    private void email_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textfieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_email_textfieldActionPerformed

    private void hp_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hp_textfieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_hp_textfieldActionPerformed

    private void ip_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ip_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ip_textfieldActionPerformed

    private void certificate_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certificate_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_certificate_textfieldActionPerformed

    private void biometric_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biometric_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biometric_textfieldActionPerformed

    private void bank_acc_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bank_acc_textfieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bank_acc_textfieldActionPerformed

    private void linkedin_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkedin_textfieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_linkedin_textfieldActionPerformed

    private void vehicle_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicle_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicle_textfieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bank_acc_label;
    private javax.swing.JTextField bank_acc_textfield;
    private javax.swing.JLabel biometric_label;
    private javax.swing.JTextField biometric_textfield;
    private javax.swing.JLabel certificate_label;
    private javax.swing.JTextField certificate_textfield;
    private javax.swing.JLabel dob_label;
    private javax.swing.JTextField dob_textfield;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_textfield;
    private javax.swing.JLabel fax_label;
    private javax.swing.JLabel fax_label1;
    private javax.swing.JTextField fax_textfield;
    private javax.swing.JLabel healthplan_label;
    private javax.swing.JTextField hp_textfield;
    private javax.swing.JLabel image;
    private javax.swing.JLabel ip_label;
    private javax.swing.JTextField ip_textfield;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel linkedin_label;
    private javax.swing.JTextField linkedin_textfield;
    private javax.swing.JLabel medical_label;
    private javax.swing.JTextField medical_textfield;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_textfield;
    private javax.swing.JButton photo_submit_button;
    private javax.swing.JLabel ssn_label;
    private javax.swing.JTextField ssn_textfield;
    private javax.swing.JButton submit_button;
    private javax.swing.JLabel telephone_label;
    private javax.swing.JTextField telephone_textfield;
    private javax.swing.JLabel title_label;
    private javax.swing.JTextField vehicle_textfield;
    // End of variables declaration//GEN-END:variables
}
