/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegameapp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;

/**
 *
 * @author Yanyao Wang
 */


public class GameRunPage extends JFrame
{
	public JFrame frame;
	public GamePanel gp;
   public GameRunPage ()
   {
      frame = new JFrame("Game Table");
   
      gp = new GamePanel();
      frame.getContentPane().add(gp);
   	
      frame.pack();
      frame.setVisible(true);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
   }
   
}
  


//
//public class GameRunPage extends javax.swing.JFrame {
//
//    /**
//     * Creates new form gameRunPage
//     */
//    public GameRunPage() {
//        initComponents();
//    }
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//    private void initComponents() {
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 509, Short.MAX_VALUE)
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 363, Short.MAX_VALUE)
//        );
//
//        pack();
//    }// </editor-fold>//GEN-END:initComponents
//
//    // Variables declaration - do not modify//GEN-BEGIN:variables
//    // End of variables declaration//GEN-END:variables
//}

