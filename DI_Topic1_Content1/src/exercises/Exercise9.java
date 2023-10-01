package exercises;

import javax.swing.*;
import java.awt.*;

public class Exercise9 extends JFrame {
	
    private static final long serialVersionUID = 1L;
    private JCheckBox checkBoxIngles;
    private JCheckBox checkBoxFrances;
    private JCheckBox checkBoxAleman;

    public Exercise9() {
        setTitle("Ejercicio 9");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        checkBoxIngles = new JCheckBox("Inglés");
        checkBoxFrances = new JCheckBox("Francés");
        checkBoxAleman = new JCheckBox("Alemán");

        checkBoxIngles.addActionListener(e -> {
            actualizarTitulo();
        });

        checkBoxFrances.addActionListener(e -> {
            actualizarTitulo();
        });

        checkBoxAleman.addActionListener(e -> {
            actualizarTitulo();
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(checkBoxIngles);
        panel.add(checkBoxFrances);
        panel.add(checkBoxAleman);

        getContentPane().add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void actualizarTitulo() {
        StringBuilder titulo = new StringBuilder(" ");
        if (checkBoxIngles.isSelected()) {
            titulo.append(" Inglés -");
        }
        if (checkBoxFrances.isSelected()) {
            titulo.append(" Francés - ");
        }
        if (checkBoxAleman.isSelected()) {
            titulo.append(" Alemán");
        }
        setTitle(titulo.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exercise9());
    }
}
