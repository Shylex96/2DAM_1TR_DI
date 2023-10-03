package exercises;

import java.awt.FlowLayout;
import javax.swing.*;

public class Exercise06 extends JFrame {

	private static final long serialVersionUID = 1L;

	public Exercise06() {

		setTitle("Ejercicio 6");
		setSize(280, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Naranja"};

		JComboBox<String> comboBox = new JComboBox<>(colores);
		comboBox.setSelectedIndex(0);

		comboBox.addActionListener(e -> {
			String colorSeleccionado = (String) comboBox.getSelectedItem();
			setTitle(colorSeleccionado);
		});

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(comboBox);

		getContentPane().add(panel);

		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new Exercise06());
	}
}
