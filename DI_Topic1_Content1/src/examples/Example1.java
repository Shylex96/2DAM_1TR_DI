package examples;

import javax.swing.JFrame;

public class Example1 extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	// Constructor
	public Example1()
	{
		setTitle("Ejemplo 1");
		setSize(300,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new Example1();
	}
}
