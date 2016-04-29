package dicegameapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	public GamePanel () {
		setPreferredSize(new Dimension(800, 580));
		setBackground(new Color(51, 102, 0));
		setLayout(new BorderLayout());
		
	}

}
