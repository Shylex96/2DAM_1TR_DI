package exercises;

import java.awt.*;
import javax.swing.*;

public class Exercise2 extends JFrame {

	private static final long serialVersionUID = 1L;

	public Exercise2() {
		
		setTitle("Ejercicio 2");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		btn1.setPreferredSize(new Dimension(50, 25));
		btn2.setPreferredSize(new Dimension(50, 25));
		btn3.setPreferredSize(new Dimension(50, 25));

		btn1.addActionListener(e -> {
			setTitle("Botón 1");
		});
		
		btn2.addActionListener(e -> {
			setTitle("Botón 2");
		});
		
		btn3.addActionListener(e -> {
			setTitle("Botón 3");
		});

		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(btn1);
		add(btn2);
		add(btn3);

		setLocationRelativeTo(null);
		setVisible(true);
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new Exercise2());
	}
}
