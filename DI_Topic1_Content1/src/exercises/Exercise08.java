package exercises;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class Exercise08 extends JFrame {

	private static final long serialVersionUID = 1L;

	public Exercise08() {

		setTitle("Ejercicio 8");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuColores = new JMenu("Opciones");
		menuBar.add(menuColores);

		JMenu submenuDimension = new JMenu("Tamaño de la ventana");
		menuColores.add(submenuDimension);

		JMenuItem menuItemPeque = new JMenuItem("640*480");
		JMenuItem menuItemGrande = new JMenuItem("1024*768");

		submenuDimension.add(menuItemPeque);
		submenuDimension.add(menuItemGrande);

		JMenu submenuFondo = new JMenu("Colores de fondo");
		menuColores.add(submenuFondo);

		JMenuItem menuItemRojo = new JMenuItem("Rojo");
		JMenuItem menuItemVerde = new JMenuItem("Verde");

		submenuFondo.add(menuItemRojo);
		submenuFondo.add(menuItemVerde);

		menuItemPeque.addActionListener(e -> {
			setSize(640, 480);
		});

		menuItemGrande.addActionListener(e -> {
			setSize(1024, 768);
		});

		menuItemRojo.addActionListener(e -> {
			getContentPane().setBackground(Color.RED);
		});

		menuItemVerde.addActionListener(e -> {
			getContentPane().setBackground(Color.GREEN);
		});

		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new Exercise08());
	}
}
