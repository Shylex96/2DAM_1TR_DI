package exercises;

import java.awt.Color;
import javax.swing.*;

public class Exercise07 extends JFrame {

	private static final long serialVersionUID = 1L;

	public Exercise07() {
		
        setTitle("Ejercicio 7");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuColores = new JMenu("Colores");
        menuBar.add(menuColores);

        JMenuItem menuItemRojo = new JMenuItem("Rojo");
        JMenuItem menuItemVerde = new JMenuItem("Verde");
        JMenuItem menuItemAzul = new JMenuItem("Azul");

        menuColores.add(menuItemRojo);
        menuColores.add(menuItemVerde);
        menuColores.add(menuItemAzul);

        menuItemRojo.addActionListener(e -> {
        	  getContentPane().setBackground(Color.RED);
		});
		
        menuItemVerde.addActionListener(e -> {
        	 getContentPane().setBackground(Color.GREEN);
		});
		
        menuItemAzul.addActionListener(e -> {
        	 getContentPane().setBackground(Color.BLUE);
		});
        
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercise07());
    }
}