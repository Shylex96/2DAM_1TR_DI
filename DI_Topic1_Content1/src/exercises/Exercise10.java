package exercises;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Exercise10 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JCheckBox checkBoxTerminos;

	public Exercise10() {


		setTitle("Ejercicio 10");
		setSize(350, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblTerminos = new JLabel("¿Está de acuerdo con las normas del servicio?:");
		checkBoxTerminos = new JCheckBox("Acepto");
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setEnabled(false);
		
		checkBoxTerminos.addActionListener(e -> {
			if (checkBoxTerminos.isSelected()) {
				 btnContinuar.setEnabled(true);
			} else {
				 btnContinuar.setEnabled(false);
			}
		});
		
		btnContinuar.addActionListener(e -> {
			System.out.println("Normas aceptadas.");
		});

		JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(lblTerminos);
        panel.add(checkBoxTerminos);
        panel.add(btnContinuar);
        
        getContentPane().add(panel);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new Exercise10());
	}
}
