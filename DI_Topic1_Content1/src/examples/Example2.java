package examples;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example2 {

	// Constantes y componentes (objetos)
	JButton miBoton;
	
	// Constructor
	public Example2()
	{
		JFrame ventanaJ = new JFrame("Ejemplo 2");
		miBoton = new JButton("Aceptar");
		ventanaJ.add(miBoton);
		ventanaJ.setSize(200,100);
		ventanaJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaJ.setLocationRelativeTo(null);
		ventanaJ.setVisible(true);
	}
	public static void main(String args[])
	{
		new Example2();
	}
}

