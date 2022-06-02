package Game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        registerText = new javax.swing.JLabel();
        registerPanel = new javax.swing.JPanel();
        registerLabel = new javax.swing.JLabel();
        registerUsernameLabel = new javax.swing.JLabel();
        registerUsernameField = new javax.swing.JTextField();
        registerPasswordLabel = new javax.swing.JLabel();
        registerPasswordField = new javax.swing.JPasswordField();
        createAccountButton = new javax.swing.JButton();
        registerBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 369));
        setMinimumSize(new java.awt.Dimension(400, 369));

        backgroundPanel.setLayout(new java.awt.CardLayout());

        usernameLabel.setText("Username:");

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        passwordLabel.setText("Password:");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        loginLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginLabel.setText("Login");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        registerText.setText("Dont have an account yet?");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(loginLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginButton))
                        .addContainerGap(134, Short.MAX_VALUE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(backButton))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registerText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(loginLabel)
                .addGap(21, 21, 21)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(backButton))
                .addGap(18, 18, 18)
                .addComponent(registerText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerButton)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        backgroundPanel.add(loginPanel, "card2");

        registerLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        registerLabel.setText("Register");

        registerUsernameLabel.setText("Username:");

        registerPasswordLabel.setText("Password:");

        createAccountButton.setText("Create Account");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        registerBackButton.setText("Back");
        registerBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerUsernameLabel)
                            .addComponent(registerUsernameField)
                            .addComponent(registerPasswordLabel)
                            .addComponent(registerPasswordField)
                            .addComponent(createAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(registerBackButton))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(registerLabel)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerBackButton)
                .addGap(28, 28, 28)
                .addComponent(registerLabel)
                .addGap(22, 22, 22)
                .addComponent(registerUsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(createAccountButton)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        backgroundPanel.add(registerPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_backButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        Connection conn = null;
        Statement statement = null;
        String DBQ = "";
        try {
            //connects to embedded database
            conn = DriverManager.getConnection("jdbc:derby:QuizGameDB_Edb; create=true", "pdc", "pdc");
            statement = conn.createStatement();
            //grabs result set for user that user has input
            DBQ = "SELECT * FROM USERS WHERE USERNAME='" + usernameField.getText() + "' AND PASSWORD='" + passwordField.getText() + "'";
            ResultSet rs = statement.executeQuery(DBQ);
            if(rs.next()){
                //if user exists and password is correct, displays appropiate message
                JOptionPane.showMessageDialog(null, "Successful login.");
                //sets static current user and retrieves balance
                User.setCurrentUser(usernameField.getText());
                int balance = rs.getInt("BALANCE");
                //sets balance
                User.changeBalance(balance);
                
                this.setVisible(false);
                SelectGameMode gameModes = new SelectGameMode();
                
                gameModes.setVisible(true);
                gameModes.setLocationRelativeTo(null);
                
            }
            else{
                //if username or password is incorrect, message is displayed
                JOptionPane.showMessageDialog(null, "Incorrect login credentials, please try again.");
            }
        } 
        catch(Exception e){
            System.err.println(e);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    //changes to register panel if user wishes to signup instead
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        loginPanel.setVisible(false);
        registerPanel.setVisible(true);
    }//GEN-LAST:event_registerButtonActionPerformed
    //back button to change to login panel so user can go back to login page if they wish
    private void registerBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBackButtonActionPerformed
        registerPanel.setVisible(false);
        loginPanel.setVisible(true);
    }//GEN-LAST:event_registerBackButtonActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        Connection conn = null;
        Statement statement = null;
        String query = "";
        try{
            //connects to database
            conn = DriverManager.getConnection("jdbc:derby:QuizGameDB_Edb; create=true", "pdc", "pdc");
            statement = conn.createStatement();
            //tries to retrieve if username exists
            query = "SELECT * FROM USERS WHERE USERNAME='" + registerUsernameField.getText() + "'";
            
            ResultSet rs = statement.executeQuery(query);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "This username is taken, please try again.");
            }
            else{
                //if username doesn't exist, inserts user into database
                if(registerUsernameField.getText().equals("") || registerPasswordField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Cannot create account without username and/or password.");
                }
                else{
                    statement.executeUpdate("INSERT INTO USERS VALUES ('" + registerUsernameField.getText() + "', '" + registerPasswordField.getText() + "', 0)");
                    JOptionPane.showMessageDialog(null, "User has been created!");
                    registerPanel.setVisible(false);
                    loginPanel.setVisible(true);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_createAccountButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerBackButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPasswordField registerPasswordField;
    private javax.swing.JLabel registerPasswordLabel;
    private javax.swing.JLabel registerText;
    private javax.swing.JTextField registerUsernameField;
    private javax.swing.JLabel registerUsernameLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
