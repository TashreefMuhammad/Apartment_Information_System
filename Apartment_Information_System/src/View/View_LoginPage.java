package View;

import Controller.*;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class View_LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form View_LoginPage
     */
    Controller_LoginHandling checker = new Controller_LoginHandling();
    protected static String choose;

    public View_LoginPage() {
        initComponents();
        initializeSelf();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Loginpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ContactNoField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        ManagerBut = new javax.swing.JButton();
        ResidentBut = new javax.swing.JButton();
        SecurityBut = new javax.swing.JButton();
        CloseAppBut = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        desLabel4 = new javax.swing.JLabel();
        desLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(153, 153, 153));
        background.setPreferredSize(new java.awt.Dimension(1028, 640));

        Loginpanel.setBackground(new java.awt.Color(0, 153, 240));
        Loginpanel.setPreferredSize(new java.awt.Dimension(477, 640));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Log In");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Contact No");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password");

        ContactNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNoFieldActionPerformed(evt);
            }
        });

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Forgot Password");
        jLabel4.setToolTipText("");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        ManagerBut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ManagerBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Manager.png"))); // NOI18N
        ManagerBut.setText("Manager");
        ManagerBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerButActionPerformed(evt);
            }
        });

        ResidentBut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ResidentBut.setIcon(new javax.swing.ImageIcon("K:\\3.2\\ISD\\Apartment_Information_System\\Apartment_Information_System\\images\\Resident.jpg")); // NOI18N
        ResidentBut.setText("Residence");
        ResidentBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResidentButActionPerformed(evt);
            }
        });

        SecurityBut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SecurityBut.setIcon(new javax.swing.ImageIcon("K:\\3.2\\ISD\\Apartment_Information_System\\Apartment_Information_System\\images\\Security.png")); // NOI18N
        SecurityBut.setText("Security");
        SecurityBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecurityButActionPerformed(evt);
            }
        });

        CloseAppBut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CloseAppBut.setText("Close Application");
        CloseAppBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseAppButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginpanelLayout = new javax.swing.GroupLayout(Loginpanel);
        Loginpanel.setLayout(LoginpanelLayout);
        LoginpanelLayout.setHorizontalGroup(
            LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginpanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(ManagerBut, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(ResidentBut, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(SecurityBut, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(LoginpanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContactNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseAppBut, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        LoginpanelLayout.setVerticalGroup(
            LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginpanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ContactNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addGroup(LoginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SecurityBut, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResidentBut, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManagerBut, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(CloseAppBut, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Welcome");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("TO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("Apartment Information");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("System");

        desLabel4.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        desLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desLabel4.setText("Nikunja Residence");

        desLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        desLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desLabel5.setText("142 Gate Road, Tejgaon");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(desLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(desLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(117, 117, 117)
                .addComponent(Loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Loginpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(desLabel4)
                .addGap(53, 53, 53)
                .addComponent(desLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ContactNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNoFieldActionPerformed

    private void SecurityButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecurityButActionPerformed
        choose = "SecurityGuard";
        goNextPage();
    }//GEN-LAST:event_SecurityButActionPerformed

    private void ManagerButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerButActionPerformed
        // TODO add your handling code here:
        choose = "Manager";
        goNextPage();
    }//GEN-LAST:event_ManagerButActionPerformed

    private void ResidentButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResidentButActionPerformed
        // TODO add your handling code here:
        choose = "Resident";
        goNextPage();
    }//GEN-LAST:event_ResidentButActionPerformed

    private void CloseAppButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseAppButActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseAppButActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        String recover = JOptionPane.showInputDialog("Provide valid e-mail address: ");
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(recover);

        if (mat.matches()) {
            boolean res = checker.resetPass(recover);
            if(res)
                JOptionPane.showMessageDialog(null, "Your password has been sent to your e-mail");
            else
                JOptionPane.showMessageDialog(null, "Provide the e-mail you gave, this is not available to us");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid E-mail Format");
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void initializeSelf() {

        //ManagerBut.setIcon(Resizing.resizeicon("images/manager.png", ManagerBut));
        ContactNoField.setText("");
        PasswordField.setText("");
        try {
            Image image = ImageIO.read(new File("images/manager.png")).getScaledInstance(ManagerBut.getWidth(), ManagerBut.getHeight(), Image.SCALE_DEFAULT);
            ManagerBut.setIcon(new ImageIcon(image));

//            Image image1 = ImageIO.read(new File("images/resident.png")).getScaledInstance(ManagerBut.getWidth(), ManagerBut.getHeight(), Image.SCALE_DEFAULT);
//            ResidentBut.setIcon(new ImageIcon(image1));
//
//            Image image2 = ImageIO.read(new File("images/securityadmin.png")).getScaledInstance(ManagerBut.getWidth(), ManagerBut.getHeight(), Image.SCALE_DEFAULT);
//            SecurityBut.setIcon(new ImageIcon(image2));
        } catch (IOException e) {
            System.out.println(e);
        }

        //ResidentBut.setIcon(Resizing.resizeIcon("images/resident.png", ResidentBut));
        //SecurityBut.setIcon(Resizing.resizeIcon("images/securityadmin.png", SecurityBut));
    }

    public void goNextPage() {
        Controller_LoggerInfo result = checker.verifyLogin(choose, ContactNoField.getText(), PasswordField.getText());
        if (result.stat == 1) {
            View_CommonInterface tmp = new View_CommonInterface();
            tmp.labelValues(result.id,result.name, result.contact, result.email, result.apartment);
            tmp.setVisible(true);
            this.dispose();
        } 
        else if (result.stat == 2){
            JOptionPane.showMessageDialog(null, "You do not have permission to use this software");
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Credentials");
        }
        ContactNoField.setText("");
        PasswordField.setText("");
    }

    public static String getChoice() {
        return choose;
    }

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
            java.util.logging.Logger.getLogger(View_LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseAppBut;
    private javax.swing.JTextField ContactNoField;
    private javax.swing.JPanel Loginpanel;
    private javax.swing.JButton ManagerBut;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton ResidentBut;
    private javax.swing.JButton SecurityBut;
    private javax.swing.JPanel background;
    private javax.swing.JLabel desLabel4;
    private javax.swing.JLabel desLabel5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
