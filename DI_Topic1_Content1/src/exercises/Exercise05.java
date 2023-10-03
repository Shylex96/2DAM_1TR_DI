package exercises;

import javax.swing.*;

public class Exercise05 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextField txtUsuario;
	private JTextField txtClave;

	public Exercise05() {
		
		setTitle("Ejercicio 5");
		setSize(280, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblUsuario = new JLabel("Nombre de usuario:");
		txtUsuario = new JTextField(10);

		JLabel lblClave = new JLabel("Contraseña:");
		txtClave = new JTextField(14);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(e -> {
			String usuarioIngresado = txtUsuario.getText();
			String claveIngresada = txtClave.getText();

			if (usuarioIngresado.equals("maria") && claveIngresada.equals("1234abcd")) {
				setTitle("Correcto");
			} else {
				setTitle("Incorrecto");
			}
		});

		JPanel panel = new JPanel();
		panel.add(lblUsuario);
		panel.add(txtUsuario);
		panel.add(lblClave);
		panel.add(txtClave);
		panel.add(btnAceptar);

		getContentPane().add(panel);

		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new Exercise05());
	}
}
