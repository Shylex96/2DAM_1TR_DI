package exercises;

import javax.swing.*;
import java.awt.*;

public class Exercise01_v1 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Exercise01_v1() {
    	
        setTitle("Ejercicio 1");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JButton btnExit = new JButton("Finalizar");
        btnExit.setPreferredSize(new Dimension(100, 25));
        
        btnExit.addActionListener(e -> {
            System.exit(0);
        });

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(btnExit);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercise01_v1());
    }
}

