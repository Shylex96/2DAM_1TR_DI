package exercises;

import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class Exercise3 extends JFrame {
	
    private static final long serialVersionUID = 1L;
    private JTextField textField;

    public Exercise3() {
        setTitle("Ejercicio 3");
        setSize(250, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Usuario: ");
        textField = new JTextField(10);

        JButton btnAceptar = new JButton("Aceptar");
        
        btnAceptar.addActionListener(e -> {
        	 String nombreUsuario = textField.getText();
             setTitle(nombreUsuario);
		});
        
        /* Otra posible forma importando los listener sería:
        
        btnAceptar.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                String nombreUsuario = textField.getText();
                setTitle(nombreUsuario);
            }
        });
         */
        
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(btnAceptar);

        getContentPane().add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercise3());
    }
}
