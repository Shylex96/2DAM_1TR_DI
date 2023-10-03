package views;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class mainMenu extends JFrame {

	private static final long serialVersionUID = 1L;

	private Image imgMenu;

	public mainMenu() {
		this.setTitle("Personality Game - Main Menu");
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		imgMenu = toolkit.getImage("resources/mainMenu.png");

		setVisible(true);
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(imgMenu, 0, 20, this);
	}
}