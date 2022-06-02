
package Game;

import javax.swing.JOptionPane;

public class SelectGameMode extends javax.swing.JFrame {

    public SelectGameMode() {
        initComponents();
        newInitComponents();
    }
    
    //A initializer that overrides the default values 
    private void newInitComponents(){
        usernameLabel.setText("User: " + User.currentUser);
        balanceLabel.setText("Balance: $" + User.userBalance);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        levelOneButton = new javax.swing.JButton();
        LevelTwoButton = new javax.swing.JButton();
        levelThreeButton = new javax.swing.JButton();
        levelFourButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        levelOneButton.setBackground(new java.awt.Color(204, 255, 204));
        levelOneButton.setText("<html>   Level 1<br />Buy in: Free <br /> Reward: $300</html>");
        levelOneButton.setMinimumSize(new java.awt.Dimension(124, 85));
        levelOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelOneButtonActionPerformed(evt);
            }
        });

        LevelTwoButton.setBackground(new java.awt.Color(204, 255, 255));
        LevelTwoButton.setText("<html>   Level 2<br />Buy in: $1,000 <br /> Reward: $10,000</html>");
        LevelTwoButton.setMinimumSize(new java.awt.Dimension(124, 85));
        LevelTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelTwoButtonActionPerformed(evt);
            }
        });

        levelThreeButton.setBackground(new java.awt.Color(255, 255, 153));
        levelThreeButton.setText("<html>   Level 3<br />Buy in: $30,000 <br /> Reward: $10,000</html>");
        levelThreeButton.setMinimumSize(new java.awt.Dimension(124, 85));
        levelThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelThreeButtonActionPerformed(evt);
            }
        });

        levelFourButton.setBackground(new java.awt.Color(255, 102, 102));
        levelFourButton.setText("<html>   Level ELITE<br />Buy in: $100,000 <br /> Reward: $1,000,000</html>");
        levelFourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelFourButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Select what level you would like to play?");

        balanceLabel.setText("Balance: ");

        usernameLabel.setText("Username: ");

        logOutButton.setText("Log out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(usernameLabel)
                        .addGap(197, 197, 197)
                        .addComponent(balanceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(logOutButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(levelThreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(levelOneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LevelTwoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(levelFourButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(balanceLabel)
                        .addComponent(usernameLabel))
                    .addComponent(logOutButton))
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LevelTwoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelOneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelFourButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelThreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Starts a level one game if button is selected
    private void levelOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelOneButtonActionPerformed
        this.setVisible(false);
        LevelOne lvlOne = new LevelOne();
        GameHelper.setNumGames(lvlOne.numQuestions());
        GameHelper.setGameMode(lvlOne);
        GameManager startLvlOne = new GameManager(lvlOne);

    }//GEN-LAST:event_levelOneButtonActionPerformed

    //Starts level two game if button is selected
    private void LevelTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelTwoButtonActionPerformed
        //only starts game if user has enough money
        if(User.checkBalance(1000)){
            this.setVisible(false);
            LevelTwo lvlTwo = new LevelTwo();
            GameHelper.setNumGames(lvlTwo.numQuestions());
            GameHelper.setGameMode(lvlTwo);
            GameManager startLvlTwo = new GameManager(lvlTwo);
            
            User.changeBalance(-lvlTwo.getBuyIn());
        }
        else{
            JOptionPane.showMessageDialog(null, "You need at least $1,000 to play this level.");
        }
    }//GEN-LAST:event_LevelTwoButtonActionPerformed

     //Starts level four/elite game if button is selected
    private void levelFourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelFourButtonActionPerformed
        //only starts game if user has enough money
        if(User.checkBalance(100000)){
            this.setVisible(false);
            LevelElite lvlElite = new LevelElite();
            GameHelper.setNumGames(lvlElite.numQuestions());
            GameHelper.setGameMode(lvlElite);
            GameManager startLvlTwo = new GameManager(lvlElite);
            
            User.changeBalance(-lvlElite.getBuyIn());
        }
        else{
            JOptionPane.showMessageDialog(null, "You need at least $100,000 to play this level.");
        }
    }//GEN-LAST:event_levelFourButtonActionPerformed

    //Starts level three game if button is selected
    private void levelThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelThreeButtonActionPerformed
        //only starts game if user has enough money
        if(User.checkBalance(30000)){
            this.setVisible(false);
            LevelThree lvlThree = new LevelThree();
            GameHelper.setNumGames(lvlThree.numQuestions());
            GameHelper.setGameMode(lvlThree);
            GameManager startLvlTwo = new GameManager(lvlThree);
            
            User.changeBalance(-lvlThree.getBuyIn());
        }
        else{
            JOptionPane.showMessageDialog(null, "You need at least $30,000 to play this level.");
        }
    }//GEN-LAST:event_levelThreeButtonActionPerformed

    //logs out user and returns back to menu if button is selected
    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        //Resets static variable balance back to 0
        User.resetBalance();
        //returns back to menu
        Menu menu = new Menu();
        this.setVisible(false);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_logOutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LevelTwoButton;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton levelFourButton;
    private javax.swing.JButton levelOneButton;
    private javax.swing.JButton levelThreeButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
