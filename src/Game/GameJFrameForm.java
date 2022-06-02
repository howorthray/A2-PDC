
package Game;

import javax.swing.JOptionPane;

public class GameJFrameForm extends javax.swing.JFrame {
    
    String answer;
    public boolean correct = true;
  
    public GameJFrameForm() {
        initComponents();
    }

    //Setting question options and answer for each game 
    public void setOptA(String questionOptA){
        optionA.setText(questionOptA);
    }

    public void setOptB(String optB){
        optionB.setText(optB);
    }
    
    public void setOptC(String optC){
        optionC.setText(optC);
    }
    
    public void setOptD(String optD){
        optionD.setText(optD);
    }
    
    public void setQuestion(String question){
        questionDisplay.setText(question);
    }
    
    public void setAnswer(String answer){
        this.answer = answer;
    }
    
    public void setProgess(int current, int total){
        Progress.setText("Question: " + current +"/" + total);
    }
    
    //Checks the option that the user inputs and returns if its correct or not
    public boolean checkAnswer(String input){
        correct = false;
        if(this.answer.equalsIgnoreCase(input)){
            correct = true;
        }
        return correct;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        questionDisplay = new javax.swing.JLabel();
        optionA = new javax.swing.JButton();
        optionB = new javax.swing.JButton();
        optionC = new javax.swing.JButton();
        optionD = new javax.swing.JButton();
        Progress = new javax.swing.JLabel();
        quitGameButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        questionDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionDisplay.setText("(Question Display)");

        optionA.setText("A");
        optionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionAActionPerformed(evt);
            }
        });

        optionB.setText("B");
        optionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionBActionPerformed(evt);
            }
        });

        optionC.setText("C");
        optionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionCActionPerformed(evt);
            }
        });

        optionD.setText("D");
        optionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionDActionPerformed(evt);
            }
        });

        Progress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Progress.setText("num of questions");

        quitGameButton.setText("Exit");
        quitGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitGameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questionDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optionA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Progress, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                        .addComponent(quitGameButton))
                    .addComponent(optionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optionC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optionD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(quitGameButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Progress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24)
                .addComponent(questionDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionD)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Checks if selected button is equal to answer
    private void optionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionAActionPerformed
        String input = optionA.getText();
        //If selected answer is wrong, displays appropiate message and goes back to GameMode menu
        if(!checkAnswer(input)){
            correct = false;
            JOptionPane.showMessageDialog(null, "Wrong answer!");
            this.setVisible(false);
            SelectGameModeJFrameForm gameModes = new SelectGameModeJFrameForm();
                
            gameModes.setVisible(true);
            gameModes.setLocationRelativeTo(null);
            //Resets question count back to 0
            GameHelper.resetCount();
        }
        else{
            //Correct answer case, continues game
            this.setVisible(false);
            GameManager gm = new GameManager(GameHelper.gameMode);

        }
    }//GEN-LAST:event_optionAActionPerformed
    
    //Checks if selected button is equal to answer
    private void optionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionBActionPerformed
        String input = optionB.getText();
        //If selected answer is wrong, displays appropiate message and goes back to GameMode menu
        if(!checkAnswer(input)){
            correct = false;
            JOptionPane.showMessageDialog(null, "Wrong answer!");
            this.setVisible(false);
            SelectGameModeJFrameForm gameModes = new SelectGameModeJFrameForm();
                
            gameModes.setVisible(true);
            gameModes.setLocationRelativeTo(null);
            //Resets question count back to 0
            GameHelper.resetCount();
        }
        else{
            //Correct answer case, continues game
            this.setVisible(false);
            GameManager gm = new GameManager(GameHelper.gameMode);
        }
    }//GEN-LAST:event_optionBActionPerformed
    
    //Checks if selected button is equal to answer
    private void optionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionCActionPerformed
        String input = optionC.getText();
        //If selected answer is wrong, displays appropiate message and goes back to GameMode menu
        if(!checkAnswer(input)){
            correct = false;
            JOptionPane.showMessageDialog(null, "Wrong answer!");
            this.setVisible(false);
            SelectGameModeJFrameForm gameModes = new SelectGameModeJFrameForm();
                
            gameModes.setVisible(true);
            gameModes.setLocationRelativeTo(null);
            //Resets question count back to 0
            GameHelper.resetCount();
        }
        else{
            //Correct answer case, continues game
            this.setVisible(false);
            GameManager gm = new GameManager(GameHelper.gameMode);
        }
    }//GEN-LAST:event_optionCActionPerformed

    //Checks if selected button is equal to answer
    private void optionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionDActionPerformed
        String input = optionD.getText();
        //If selected answer is wrong, displays appropiate message and goes back to GameMode menu
        if(!checkAnswer(input)){
            correct = false;
            
            JOptionPane.showMessageDialog(null, "Wrong answer!");
            this.setVisible(false);
            SelectGameModeJFrameForm gameModes = new SelectGameModeJFrameForm();
                
            gameModes.setVisible(true);
            gameModes.setLocationRelativeTo(null);
            //Resets question count back to 0
            GameHelper.resetCount();
        }
        else{
            //Correct answer case, continues game
            this.setVisible(false);
            GameManager gm = new GameManager(GameHelper.gameMode);

        }
    }//GEN-LAST:event_optionDActionPerformed

    //Button for quitting current game, sends back to Game Select menu
    private void quitGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitGameButtonActionPerformed
        SelectGameModeJFrameForm sgm = new SelectGameModeJFrameForm();
        this.setVisible(false);
        sgm.setVisible(true);
        sgm.setLocationRelativeTo(null);
        GameHelper.resetCount();
    }//GEN-LAST:event_quitGameButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Progress;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JButton optionA;
    private javax.swing.JButton optionB;
    private javax.swing.JButton optionC;
    private javax.swing.JButton optionD;
    private javax.swing.JLabel questionDisplay;
    private javax.swing.JButton quitGameButton;
    // End of variables declaration//GEN-END:variables
}
