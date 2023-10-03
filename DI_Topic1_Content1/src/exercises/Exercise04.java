package exercises;

import javax.swing.*;

public class Exercise04 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField1;
	private JTextField textField2;
	private JLabel label1;
	private JLabel label2;

	public Exercise04() {

		setTitle("Ejercicio 4");
		setSize(250, 140);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label1 = new JLabel("Primer número: ");
		textField1 = new JTextField(10);
		label2 = new JLabel("Segundo número: ");
		textField2 = new JTextField(9);

		JButton btnAceptar = new JButton("Sumar");

		btnAceptar.addActionListener(e -> {

			try {
				double  num1 = Double.parseDouble(textField1.getText());
				double  num2 = Double.parseDouble(textField2.getText());
				double result = (num1 + num2);
				
				String titleString = Double.toString(result);
				
				if (titleString.contains(".0")) {
					String newtitleString = Integer.toString((int) result);
					setTitle(newtitleString);
				} else {
					setTitle(titleString);
				}
				
				// setTitle(""+result)
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos en ambos campos.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});

		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(textField1);
		panel.add(label2);
		panel.add(textField2);
		panel.add(btnAceptar);

		getContentPane().add(panel);

		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new Exercise04());
	}
}
