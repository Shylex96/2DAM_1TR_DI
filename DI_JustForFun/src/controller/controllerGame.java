package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import model.modelGame;
import views.FirstQuestions;
import views.mainMenu;

public class controllerGame implements WindowListener, MouseListener, ActionListener {

	private mainMenu mainMenu;
	private modelGame modelg;
	private FirstQuestions fquestions;

	public controllerGame (modelGame modelg, mainMenu mainMenu) {

		this.modelg = modelg;
		this.mainMenu = mainMenu;

		mainMenu.addMouseListener(this);
		mainMenu.addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		int mouseX = e.getX();
		int mouseY = e.getY();

		System.out.println("X: " +mouseX+ " Y: " +mouseY);

		// # MAIN MENU ACTIVE #
		if (mainMenu != null && mainMenu.isActive()) {

			// -- Play:
			if (mouseX >= 210 && mouseX <= 390 && mouseY >= 307 && mouseY <= 381) {

				//mainMenu.setVisible(false);
				fquestions = new FirstQuestions();
				//fquestions.addMouseListener(this);
				System.out.println("Entrando al juego");

			}
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}
