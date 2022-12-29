package flightproject;
import flightproject.AdminP.AdminUI;
import flightproject.FlightAgentP.FlightAgentUI;
import flightproject.PassengerP.ForgottenPasswordForm;
import flightproject.PassengerP.RegisterationForm;
import flightproject.PassengerP.Passenger;
import flightproject.PassengerP.WelcomeScreen;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class LoginpGUI extends javax.swing.JFrame { 
    private String username, password;
    public LoginpGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignInButton = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        HeaderLabel = new javax.swing.JLabel();
        SignUpTxtLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        passwordfield = new javax.swing.JPasswordField();
        usernamefield = new javax.swing.JTextField();
        ForgottenPasswordLabel = new javax.swing.JLabel();
        SignUpLabel = new javax.swing.JLabel();
        SidePanel = new javax.swing.JPanel();
        IconLabel = new javax.swing.JLabel();

        SignInButton.setBackground(new java.awt.Color(53, 146, 196));
        SignInButton.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        SignInButton.setForeground(new java.awt.Color(255, 255, 255));
        SignInButton.setText("Sign in");
        SignInButton.setFocusPainted(false);
        SignInButton.setFocusable(false);
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));

        HeaderPanel.setBackground(new java.awt.Color(53, 146, 196));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderLabel.setFont(new java.awt.Font("Roboto", 1, 60)); // NOI18N
        HeaderLabel.setForeground(new java.awt.Color(255, 255, 255));
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HeaderLabel.setText("Log In");
        HeaderPanel.add(HeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 179, -1));

        SignUpTxtLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        SignUpTxtLabel.setForeground(new java.awt.Color(51, 51, 51));
        SignUpTxtLabel.setText("Don't have an account yet?");

        PasswordLabel.setBackground(new java.awt.Color(53, 146, 196));
        PasswordLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(51, 51, 51));
        PasswordLabel.setText("Password");

        UsernameLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(51, 51, 51));
        UsernameLabel.setText("User name");

        passwordfield.setBackground(new java.awt.Color(255, 255, 255));
        passwordfield.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        passwordfield.setForeground(new java.awt.Color(102, 102, 102));
        passwordfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordfieldKeyPressed(evt);
            }
        });

        usernamefield.setBackground(new java.awt.Color(255, 255, 255));
        usernamefield.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        usernamefield.setForeground(new java.awt.Color(102, 102, 102));

        ForgottenPasswordLabel.setBackground(new java.awt.Color(255, 255, 255));
        ForgottenPasswordLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ForgottenPasswordLabel.setForeground(new java.awt.Color(53, 146, 196));
        ForgottenPasswordLabel.setText("Forgot your Password?");
        ForgottenPasswordLabel.setFocusable(false);
        ForgottenPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgottenPasswordLabelMouseClicked(evt);
            }
        });

        SignUpLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        SignUpLabel.setForeground(new java.awt.Color(53, 146, 196));
        SignUpLabel.setText("Sign Up");
        SignUpLabel.setFocusable(false);
        SignUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addGap(0, 71, Short.MAX_VALUE)
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(SignUpTxtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SignUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordfield)
                                    .addComponent(usernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(189, 189, 189))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(ForgottenPasswordLabel)
                        .addGap(265, 265, 265))))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ForgottenPasswordLabel)
                .addGap(56, 56, 56)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SignUpTxtLabel)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addComponent(SignUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        HeaderPanel.getAccessibleContext().setAccessibleName("");

        SidePanel.setBackground(new java.awt.Color(91, 120, 152));

        IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SidePanel1.png"))); // NOI18N

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IconLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(703, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                    .addGap(0, 204, Short.MAX_VALUE)
                    .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MainPanelLayout.createSequentialGroup()
                    .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        username = usernamefield.getText();
        password = passwordfield.getText();
        if(Passenger.getID(username) != -1){
            flightProject.currentUserID = Passenger.getID(username);
            if(password.equals(Passenger.getPassword(flightProject.currentUserID))){
                new WelcomeScreen().setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Wrong Password!");
            }
        }else if(flightproject.FlightAgentP.FlightAgent.getID(username) != -1){
            flightProject.currentUserID = flightproject.FlightAgentP.FlightAgent.getID(username);
            if(password.equals(flightproject.FlightAgentP.FlightAgent.getPassword(flightProject.currentUserID))){
                new FlightAgentUI().setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Wrong Password!");
            }
        }else if(flightproject.AdminP.Admin.getID(username) != -1){
            flightProject.currentUserID = flightproject.AdminP.Admin.getID(username);
            if(password.equals(flightproject.AdminP.Admin.getPassword(flightProject.currentUserID))){
                new AdminUI().setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Wrong Password!");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Username doesn't exist!");
        }
    }//GEN-LAST:event_SignInButtonActionPerformed

    private void ForgottenPasswordLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgottenPasswordLabelMouseClicked
        new ForgottenPasswordForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_ForgottenPasswordLabelMouseClicked

    private void SignUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabelMouseClicked
        new RegisterationForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_SignUpLabelMouseClicked

    private void passwordfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordfieldKeyPressed
        java.awt.event.ActionEvent evt1 = new ActionEvent(ERROR, WIDTH, username);
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            SignInButtonActionPerformed(evt1);
        }
    }//GEN-LAST:event_passwordfieldKeyPressed

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
            java.util.logging.Logger.getLogger(LoginpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginpGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginpGUI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ForgottenPasswordLabel;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JButton SignInButton;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JLabel SignUpTxtLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
