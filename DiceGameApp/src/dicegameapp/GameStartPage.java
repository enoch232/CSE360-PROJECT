
package dicegameapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeyuzhang
 */
public class GameStartPage extends javax.swing.JFrame {

    /**
     * Creates new form gameStartPage
     */
    public GameStartPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        startPageDicePic = new javax.swing.JLabel();
        diceGameLabel = new javax.swing.JLabel();
        startGameButton = new javax.swing.JButton();
        creditsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));

        startPageDicePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picSrc/startPageDice.jpg"))); // NOI18N

        diceGameLabel.setFont(new java.awt.Font("Luminari", 3, 30)); // NOI18N
        diceGameLabel.setForeground(new java.awt.Color(255, 255, 255));
        diceGameLabel.setText("      Dice Game");

        startGameButton.setBackground(new java.awt.Color(51, 102, 0));
        startGameButton.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        startGameButton.setForeground(new java.awt.Color(255, 255, 255));
        startGameButton.setText("Start New Game");
        startGameButton.setBorder(null);
        startGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startGameButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startGameButtonMouseEntered(evt);
            }
        });
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });

        creditsButton.setBackground(new java.awt.Color(51, 102, 0));
        creditsButton.setFont(new java.awt.Font("Luminari", 0, 18)); // NOI18N
        creditsButton.setForeground(new java.awt.Color(255, 255, 255));
        creditsButton.setText("Credits");
        creditsButton.setBorder(null);
        creditsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creditsButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creditsButtonMouseEntered(evt);
            }
        });
        creditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startPageDicePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(creditsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(diceGameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(diceGameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startPageDicePic)
                .addGap(24, 24, 24)
                .addComponent(startGameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(creditsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        super.dispose();
//        new GameRunPage().setVisible(true);
        new InitPage().startPage();
    }                                               

    private void creditsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        super.dispose();
        new CreditsPage().setVisible(true);
    }                                             

    private void startGameButtonMouseEntered(java.awt.event.MouseEvent evt) {                                             
        // TODO add your handling code here:
        startGameButton.setForeground(new java.awt.Color(255, 255, 153));
    }                                            

    private void startGameButtonMouseExited(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
        startGameButton.setForeground(new java.awt.Color(255, 255, 255));
    }                                           

    private void creditsButtonMouseEntered(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here:
        creditsButton.setForeground(new java.awt.Color(255, 255, 153));
    }                                          

    private void creditsButtonMouseExited(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        creditsButton.setForeground(new java.awt.Color(255, 255, 255));
    }                                         

    // Variables declaration - do not modify                     
    private javax.swing.JButton creditsButton;
    private javax.swing.JLabel diceGameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton startGameButton;
    private javax.swing.JLabel startPageDicePic;
    // End of variables declaration                   
}

