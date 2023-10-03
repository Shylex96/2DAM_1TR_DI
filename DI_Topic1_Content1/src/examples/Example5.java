package examples;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Example5 extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JButton boton;
	public Example5()
	{
		boton = new JButton("Pulsar");
		add(boton);
		boton.addActionListener(this);
		setSize(150, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Toolkit.getDefaultToolkit().beep();
	}
	public static void main(String[] args)
	{
		new Example5();
	}
}