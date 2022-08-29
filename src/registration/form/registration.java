/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registration.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Priya
 */
public class registration extends javax.swing.JFrame {

   Connection c = null;
   PreparedStatement s = null;
    public registration() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        mob = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        Username = new javax.swing.JTextField();
        Mobile = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Email = new javax.swing.JTextField();
        heading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        user.setBackground(new java.awt.Color(255, 255, 255));
        user.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        user.setText("Username");

        mob.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mob.setText("Mobile No.");

        pass.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pass.setText("Password");

        mail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mail.setText("Email");

        submit.setBackground(new java.awt.Color(204, 255, 204));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(204, 255, 204));
        reset.setText("Reset");

        heading.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        heading.setText("REGISTRATION FORM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mob)
                    .addComponent(user))
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(Mobile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(mail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(Email))
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(542, 542, 542)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(heading)
                .addGap(403, 403, 403))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mobile, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))))
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
    
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationform","root","");
            s=c.prepareStatement("INSERT INTO `register`(`Username`, `Password`, `Mobile`, `Email`) VALUES (?,?,?,?)");
            s.setString(1,Username.getText());
            s.setString(2,Password.getText());
            s.setString(3,Mobile.getText());
            
            s.setString(4,Email.getText());
            
            //This method is used to execute statements such as insert,update ,delete.
            //It returns integer value representing the number of rows affected
            s.executeUpdate();
          
            JOptionPane.showMessageDialog(null,"Register Successfully");
            
            if(c!=null && s!=null)
            {
                c.close();
                s.close();
            }
                  
        }
         
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,e);
                   
        }
       
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Mobile;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel heading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel mob;
    private javax.swing.JLabel pass;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
