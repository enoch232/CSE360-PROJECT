
package dicegameapp;

import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeyuzhang
 */
public class GameRunPage extends javax.swing.JFrame {
    
    private int numOfPlayers;
    private Player[] playerArr;
    private Admin admin;
    private RankBoard rankBoard;
    private int activePlayer;
    private int round;
    private RankBoardPage rankBoardPage;
    /**
     * Creates new form GameRunPage
     */
    public GameRunPage(Admin newAdmin, Player[] newPlayerArr) {
        initComponents();
        admin = newAdmin;
        playerArr = newPlayerArr;
        numOfPlayers = admin.getNumOfPlayers();
        rankBoard = new RankBoard();
        activePlayer = 0;
        round = 1;
        rankBoardPage = new RankBoardPage();
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
        doubleButton = new javax.swing.JButton();
        passButton = new javax.swing.JButton();
        rollDiceButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        rankingButton = new javax.swing.JButton();
        diceRandomLabel = new javax.swing.JLabel();
        diceOneLabel = new javax.swing.JLabel();
        diceTwoLabel = new javax.swing.JLabel();
        diceThreeLabel = new javax.swing.JLabel();
        diceFourLabel = new javax.swing.JLabel();
        diceFiveLabel = new javax.swing.JLabel();
        diceSixLabel = new javax.swing.JLabel();
        nextPlayerButton = new javax.swing.JButton();
        roundLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        betLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        doubleButton.setBackground(new java.awt.Color(255, 255, 204));
        doubleButton.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        doubleButton.setForeground(new java.awt.Color(51, 102, 0));
        doubleButton.setText("Double");
        doubleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleButtonActionPerformed(evt);
            }
        });

        passButton.setBackground(new java.awt.Color(255, 255, 204));
        passButton.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        passButton.setForeground(new java.awt.Color(51, 102, 0));
        passButton.setText("PASS");
        passButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passButtonActionPerformed(evt);
            }
        });

        rollDiceButton.setBackground(new java.awt.Color(255, 255, 204));
        rollDiceButton.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        rollDiceButton.setForeground(new java.awt.Color(51, 102, 0));
        rollDiceButton.setText("Roll Dice");
        rollDiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollDiceButtonActionPerformed(evt);
            }
        });

        quitButton.setBackground(new java.awt.Color(255, 255, 204));
        quitButton.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        quitButton.setForeground(new java.awt.Color(51, 102, 0));
        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        rankingButton.setBackground(new java.awt.Color(255, 255, 204));
        rankingButton.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        rankingButton.setForeground(new java.awt.Color(51, 102, 0));
        rankingButton.setText("Ranking");
        rankingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingButtonActionPerformed(evt);
            }
        });

        diceRandomLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picSrc/dice_random.png"))); // NOI18N
        diceRandomLabel.setInheritsPopupMenu(false);

        diceOneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picSrc/dice_1.png"))); // NOI18N

        diceTwoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picSrc/dice_2.png"))); // NOI18N

        diceThreeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picSrc/dice_3.png"))); // NOI18N

        diceFourLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picSrc/dice_4.png"))); // NOI18N

        diceFiveLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picSrc/dice_5.png"))); // NOI18N

        diceSixLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picSrc/dice_6.png"))); // NOI18N

        nextPlayerButton.setBackground(new java.awt.Color(255, 255, 204));
        nextPlayerButton.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        nextPlayerButton.setForeground(new java.awt.Color(51, 102, 0));
        nextPlayerButton.setText("Next Player");
        nextPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPlayerButtonActionPerformed(evt);
            }
        });

        roundLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        roundLabel.setForeground(new java.awt.Color(255, 255, 153));
        roundLabel.setText("jLabel1");
        roundLabel.setAlignmentY(0.0F);

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bet:");

        betLabel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        betLabel.setForeground(new java.awt.Color(255, 255, 255));
        betLabel.setText("jLabel1");

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Player:");

        scoreLabel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setText("jLabel4");

        balanceLabel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(255, 255, 255));
        balanceLabel.setText("jLabel4");

        usernameLabel.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("jLabel4");

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Balance:");

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Score:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(scoreLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(balanceLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(betLabel)))
                        .addContainerGap(92, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addComponent(usernameLabel)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {balanceLabel, betLabel, jLabel2, jLabel3, jLabel4, jLabel5, scoreLabel, usernameLabel});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(scoreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(balanceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(betLabel)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(usernameLabel))
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {balanceLabel, betLabel, jLabel2, jLabel3, jLabel4, jLabel5, scoreLabel, usernameLabel});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diceFourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diceFiveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diceThreeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diceSixLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diceRandomLabel)
                    .addComponent(diceTwoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diceOneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rankingButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doubleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nextPlayerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rollDiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roundLabel)
                .addGap(233, 233, 233))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {doubleButton, passButton, quitButton, rankingButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diceFourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diceFiveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(diceThreeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(diceSixLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diceRandomLabel)
                    .addComponent(diceTwoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diceOneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(roundLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rankingButton)
                            .addComponent(quitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passButton)
                            .addComponent(doubleButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rollDiceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextPlayerButton))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {doubleButton, passButton, quitButton, rankingButton});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {nextPlayerButton, rollDiceButton});

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

    private void rollDiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollDiceButtonActionPerformed
        diceRandomLabel.setVisible(false);
        
        int dicePoints = playerArr[activePlayer].rollDice();
        
        switch(dicePoints){
            case 1:
                diceOneLabel.setVisible(true);
                break;
            case 2:
                diceTwoLabel.setVisible(true);
                break;
            case 3:
                diceThreeLabel.setVisible(true);
                break;
            case 4:
                diceFourLabel.setVisible(true);
                break;
            case 5:
                diceFiveLabel.setVisible(true);
                break;
            default:
                diceSixLabel.setVisible(true);
                break;
        }
        uploadPlayerInfo(playerArr[activePlayer]);
        if( playerArr[activePlayer].isLose() ){
            roundLabel.setText("Busted !!!");
        }
        rankBoardPage.dispose();
        enableNextPlayerButton();
    }//GEN-LAST:event_rollDiceButtonActionPerformed

    private void doubleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleButtonActionPerformed
        // TODO add your handling code here:
        playerArr[activePlayer].doubleBet();
        doubleButton.setVisible(false);
        rankBoardPage.dispose();
        uploadPlayerInfo(playerArr[activePlayer]);
    }//GEN-LAST:event_doubleButtonActionPerformed

    private void passButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passButtonActionPerformed
        playerArr[activePlayer].pass();
        rankBoardPage.dispose();
        enableNextPlayerButton();
    }//GEN-LAST:event_passButtonActionPerformed

    private void rankingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingButtonActionPerformed
        // TODO add your handling code here:
        rankBoardPage.setText(rankBoard.prb());
        rankBoardPage.setVisible(true);
    }//GEN-LAST:event_rankingButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // TODO add your handling code here:
        playerArr[activePlayer].delete();
        rankBoardPage.dispose();
        enableNextPlayerButton();
    }//GEN-LAST:event_quitButtonActionPerformed

    private void nextPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPlayerButtonActionPerformed
        if(activePlayer == numOfPlayers - 1){
            deletePlayer();
            activePlayer = -1;
            
            if( checkGameStatus() ){
                super.dispose();
                new GameOverPage().setVisible(true);
                rankBoardPage.dispose();
            }
            else if( checkRoundStatus() ){
                gradeCurRound();
        	rankBoard.addNewRecord(generateRecord());
                
                rankBoardPage.setText(rankBoard.plr());
                rankBoardPage.setVisible(true);
                
                for(int i = 0; i < numOfPlayers; i++){
                    playerArr[i].reset();
                }
                
                round++;
                preNextPlayer();
            }
            else
                preNextPlayer();
        }
        else{
            preNextPlayer();
        }
    }//GEN-LAST:event_nextPlayerButtonActionPerformed
    
    private boolean checkRoundStatus(){
    	boolean isDone = true;
    	
    	for(int i = 0; i < numOfPlayers && isDone; i++){
    		if(playerArr[i].isPass() == false){
    			isDone = false;
    		}
    	}
    	
    	return isDone;
    }
    
    private int getHeightestScore(){
        int heighestScore = -1;
        
        for(int i = 0; i < numOfPlayers; i++){
            if(playerArr[i].isLose() == false && playerArr[i].getCurScore() > heighestScore){
                heighestScore = playerArr[i].getCurScore();
            }
        }
        
        return heighestScore;
    }
    
    private void gradeCurRound(){
        int heighestScore = getHeightestScore();
        
        for(int i = 0; i < numOfPlayers; i++)
            playerArr[i].grading(heighestScore);
    }
    
    private Vector<RankRecord> generateRecord(){
    	Vector<RankRecord> recordList = new Vector<RankRecord>();
        RankRecord record = new RankRecord();
        int heighestScore = getHeightestScore();
        
        if(heighestScore != -1){
            for(int i = 0; i < numOfPlayers; i++){
                if(playerArr[i].getCurScore() == heighestScore){
                    record.setWinnerName(playerArr[i].getPlayerName());
                    record.setWinnerScore(playerArr[i].getCurScore());
                    recordList.add(record);
                    record = new RankRecord();
                }
            }
        }
        else{
            record.setTie();
            recordList.add(record);
        }
        
    	return recordList;
    }
    
    private void preNextPlayer(){
        initDicePics();
        activePlayer = (activePlayer + 1) % numOfPlayers;
        playerAction(activePlayer);
    }
    
    private boolean checkGameStatus(){
        if(numOfPlayers > 0)
            return false;
        else
            return true;
    }
    
    private void deletePlayer(){
        Player[] tmpArr = new Player[numOfPlayers];
        int cnt = 0;
        for(int i = 0; i < numOfPlayers; i++){
            if(playerArr[i].getBalance() > 0){
                tmpArr[cnt++] = playerArr[i];
            }
        }
        numOfPlayers = cnt;
        admin.setNumOfPlayers(numOfPlayers);
        playerArr = tmpArr;
    }
    
    private void enableNextPlayerButton(){
        quitButton.setVisible(false);
        passButton.setVisible(false);
        rollDiceButton.setVisible(false);
        rankingButton.setVisible(false);
        doubleButton.setVisible(false);
        nextPlayerButton.setVisible(true);
    }
    
    private void enableGameButton(){
        quitButton.setVisible(true);
        passButton.setVisible(true);
        rollDiceButton.setVisible(true);
        rankingButton.setVisible(true);
        doubleButton.setVisible(true);
        nextPlayerButton.setVisible(false);
    }
    
    private void uploadPlayerInfo(Player player){
        scoreLabel.setText("" + player.getCurScore());
        usernameLabel.setText(player.getPlayerName());
        balanceLabel.setText("" + player.getBalance());
        betLabel.setText("" + player.getBet());
        roundLabel.setText("Round\t" + round);
    }
    
    private void playerAction(int player){
        uploadPlayerInfo(playerArr[player]);
        enableGameButton();
        if(playerArr[player].isPass())
            rollDiceButton.setVisible(false);
    }
    
    private void initDicePics(){
        diceOneLabel.setVisible(false);
        diceTwoLabel.setVisible(false);
        diceThreeLabel.setVisible(false);
        diceFourLabel.setVisible(false);
        diceFiveLabel.setVisible(false);
        diceSixLabel.setVisible(false);
        diceRandomLabel.setVisible(true);
    }
    
    public void startGame(){
        this.setVisible(true);
        
        initDicePics();
        
        playerAction(activePlayer);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel betLabel;
    private javax.swing.JLabel diceFiveLabel;
    private javax.swing.JLabel diceFourLabel;
    private javax.swing.JLabel diceOneLabel;
    private javax.swing.JLabel diceRandomLabel;
    private javax.swing.JLabel diceSixLabel;
    private javax.swing.JLabel diceThreeLabel;
    private javax.swing.JLabel diceTwoLabel;
    private javax.swing.JButton doubleButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nextPlayerButton;
    private javax.swing.JButton passButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton rankingButton;
    private javax.swing.JButton rollDiceButton;
    private javax.swing.JLabel roundLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}

