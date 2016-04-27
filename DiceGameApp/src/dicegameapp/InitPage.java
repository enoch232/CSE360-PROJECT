/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegameapp;
import java.util.*;
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
    
    public InitPage() {
        initComponents();
        admin = new Admin();
        cnt = 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upperTextField = new javax.swing.JTextField();
        upperLabel = new javax.swing.JLabel();
        playerInfoLabel = new javax.swing.JLabel();
        lowerTextField = new javax.swing.JTextField();
        targetNextButton = new javax.swing.JButton();
        lowerLabel = new javax.swing.JLabel();
        playerNextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        upperTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperTextFieldActionPerformed(evt);
            }
        });

        upperLabel.setText("Number of Players");

        playerInfoLabel.setText("Player Info");

        targetNextButton.setText("Next");
        targetNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetNextButtonActionPerformed(evt);
            }
        });

        lowerLabel.setText("Target Points");

        playerNextButton.setText("Next");
        playerNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerNextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(playerInfoLabel)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(upperLabel)
                            .addComponent(lowerLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lowerTextField)
                            .addComponent(upperTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(targetNextButton)
                            .addComponent(playerNextButton))
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(playerInfoLabel)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upperTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upperLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerNextButton)
                    .addComponent(targetNextButton))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upperTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperTextFieldActionPerformed
        
    }//GEN-LAST:event_upperTextFieldActionPerformed

    private void targetNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetNextButtonActionPerformed
        int numOfPlayers = Integer.parseInt(upperTextField.getText());
        int target = Integer.parseInt(lowerTextField.getText());
        admin.setNumOfPlayers(numOfPlayers);
        admin.setTarget(target);
        
        playerArr = new Player[numOfPlayers];
        
        getPlayerInfo(1);
    }//GEN-LAST:event_targetNextButtonActionPerformed

    private void playerNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerNextButtonActionPerformed
        // TODO add your handling code here:
        if(cnt == admin.getNumOfPlayers()){
            super.dispose();
            new GameRunPage(admin, playerArr).setVisible(true);
        }
        else{
            playerArr[cnt] = new Player();
            
            String newName = upperTextField.getText();
            int newBalance = Integer.parseInt(lowerTextField.getText());
            int target = admin.getTarget();
            
            playerArr[cnt].setPlayerName(newName);
            playerArr[cnt].setBalance(newBalance);
            playerArr[cnt].setTargetScore(target);
            
            cnt++;
            getPlayerInfo(cnt);
        }
    }//GEN-LAST:event_playerNextButtonActionPerformed
    
    private void getPlayerInfo(int n){
        targetNextButton.setVisible(false);
        playerNextButton.setVisible(true);
        playerInfoLabel.setVisible(true);
        
        upperLabel.setText("Username");
        lowerLabel.setText("Balance");
        
        upperTextField.setText("Player " + n);
        lowerTextField.setText("");
        
        String infoText = "Player " + n + " Info";
        playerInfoLabel.setText(infoText);
    }
    
    public void startPage(){
        this.setVisible(true);
        playerInfoLabel.setVisible(false);
        playerNextButton.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lowerLabel;
    private javax.swing.JTextField lowerTextField;
    private javax.swing.JLabel playerInfoLabel;
    private javax.swing.JButton playerNextButton;
    private javax.swing.JButton targetNextButton;
    private javax.swing.JLabel upperLabel;
    private javax.swing.JTextField upperTextField;
    // End of variables declaration//GEN-END:variables
}
