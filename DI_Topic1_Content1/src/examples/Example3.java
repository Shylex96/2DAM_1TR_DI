package examples;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example3 {

	public Example3()
	{
		JFrame ventanaJ = new JFrame("Ejemplo 3");
		ventanaJ.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		for(int i=0;i<10;i++)
		{
			ventanaJ.add(new JButton("Componente "+ i));
		}
		
		ventanaJ.setSize(400,300);
		ventanaJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaJ.setLocationRelativeTo(null);
		ventanaJ.setVisible(true);
	}
	public static void main(String args[])
	{
		new Example3();
	}
}

