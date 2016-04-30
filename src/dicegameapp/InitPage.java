/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegameapp;
import java.util.*;

import javax.swing.JOptionPane;
/**
 *
 * @author zeyuzhang
 */
public class InitPage extends javax.swing.JFrame {

    /**
     * Creates new form InitialTargetPage
     */
    private Admin admin;
    private Player[] playerArr;
    private int cnt;
    private String numPlayer;
    private String targetPoint;
    private String reg = "\\d+";
    
    public InitPage() {
        initComponents();
        admin = new Admin();
        cnt = 0;
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
        upperTextField = new javax.swing.JTextField();
        upperLabel = new javax.swing.JLabel();
        playerInfoLabel = new javax.swing.JLabel();
        lowerTextField = new javax.swing.JTextField();
        targetNextButton = new javax.swing.JButton();
        lowerLabel = new javax.swing.JLabel();
        playerNextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 0));

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));

        upperTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperTextFieldActionPerformed(evt);
            }
        });

        upperLabel.setFont(new java.awt.Font("Luminari", 0, 14)); // NOI18N
        upperLabel.setForeground(new java.awt.Color(255, 255, 255));
        upperLabel.setText("Number of Players");

        playerInfoLabel.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        playerInfoLabel.setForeground(new java.awt.Color(255, 255, 255));
        playerInfoLabel.setText("Player Info");

        targetNextButton.setBackground(new java.awt.Color(51, 102, 0));
        targetNextButton.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        targetNextButton.setForeground(new java.awt.Color(255, 255, 255));
        targetNextButton.setText("Next");
        targetNextButton.setBorder(null);
        targetNextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                targetNextButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                targetNextButtonMouseEntered(evt);
            }
        });
        targetNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetNextButtonActionPerformed(evt);
            }
        });

        lowerLabel.setFont(new java.awt.Font("Luminari", 0, 14)); // NOI18N
        lowerLabel.setForeground(new java.awt.Color(255, 255, 255));
        lowerLabel.setText("Target Points");

        playerNextButton.setBackground(new java.awt.Color(51, 102, 0));
        playerNextButton.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        playerNextButton.setForeground(new java.awt.Color(255, 255, 255));
        playerNextButton.setText("Next");
        playerNextButton.setBorder(null);
        playerNextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playerNextButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playerNextButtonMouseEntered(evt);
            }
        });
        playerNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerNextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(playerInfoLabel)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(targetNextButton)
                            .addComponent(playerNextButton))
                        .addGap(71, 71, 71))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upperLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lowerLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lowerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upperTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(playerInfoLabel)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upperTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upperLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(playerNextButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(targetNextButton)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playerNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerNextButtonActionPerformed
        if( lowerTextField.getText().matches(reg) )
        {
            String newName = upperTextField.getText();
            int newBalance = Integer.parseInt(lowerTextField.getText());
            int target = admin.getTarget();
            
            if(newBalance == 0){
            	JOptionPane.showMessageDialog(null, "Balance cannot be zero");
            }
            else{
            	playerArr[cnt].setPlayerName(newName);
                playerArr[cnt].setBalance(newBalance);
                playerArr[cnt].setTargetScore(target);

                if(cnt == admin.getNumOfPlayers() - 1){
                    super.dispose();
                    new GameRunPage(admin, playerArr).startGame();
                }

                cnt++;
                getPlayerInfo(cnt);
            }
        }
        else
        	JOptionPane.showMessageDialog(null, "Input must be an integer.");
    }//GEN-LAST:event_playerNextButtonActionPerformed

    private void targetNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetNextButtonActionPerformed
        numPlayer = upperTextField.getText();
        targetPoint = lowerTextField.getText();

        if(numPlayer.matches(reg) && targetPoint.matches(reg))
        {
            int numOfPlayers = Integer.parseInt(upperTextField.getText());
            int target = Integer.parseInt(lowerTextField.getText());
            if(numOfPlayers == 0 || target == 0){
            	JOptionPane.showMessageDialog(null, "Cannot be zero");
            }
            else{
            	admin.setNumOfPlayers(numOfPlayers);
                admin.setTarget(target);

                playerArr = new Player[numOfPlayers];
                for(int i = 0; i < numOfPlayers; i++)
                playerArr[i] = new Player();
                getPlayerInfo(cnt);
            }
        }
        else
        	JOptionPane.showMessageDialog(null, "Input must be an integer.");

    }//GEN-LAST:event_targetNextButtonActionPerformed

    private void upperTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperTextFieldActionPerformed

    }//GEN-LAST:event_upperTextFieldActionPerformed

    private void playerNextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerNextButtonMouseEntered
        // TODO add your handling code here:
        playerNextButton.setForeground(new java.awt.Color(255, 255, 153));
    }//GEN-LAST:event_playerNextButtonMouseEntered

    private void targetNextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_targetNextButtonMouseEntered
        // TODO add your handling code here:
        targetNextButton.setForeground(new java.awt.Color(255, 255, 153));
    }//GEN-LAST:event_targetNextButtonMouseEntered

    private void playerNextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerNextButtonMouseExited
        // TODO add your handling code here:
        playerNextButton.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_playerNextButtonMouseExited

    private void targetNextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_targetNextButtonMouseExited
        // TODO add your handling code here:
        targetNextButton.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_targetNextButtonMouseExited
    
    private void getPlayerInfo(int n){
        targetNextButton.setVisible(false);
        playerNextButton.setVisible(true);
        playerInfoLabel.setVisible(true);
        
        upperLabel.setText("Username");
        lowerLabel.setText("Balance");
        
        n = n + 1;
        
        upperTextField.setText("Player " + n);
        lowerTextField.setText("100");
        
        String infoText = "Player " + n + " Info";
        playerInfoLabel.setText(infoText);
    }
    
    public void startPage(){
        this.setVisible(true);
        lowerTextField.setText("13");
        playerInfoLabel.setVisible(false);
        playerNextButton.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lowerLabel;
    private javax.swing.JTextField lowerTextField;
    private javax.swing.JLabel playerInfoLabel;
    private javax.swing.JButton playerNextButton;
    private javax.swing.JButton targetNextButton;
    private javax.swing.JLabel upperLabel;
    private javax.swing.JTextField upperTextField;
    // End of variables declaration//GEN-END:variables
}
