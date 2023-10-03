package examples;

import javax.swing.JFrame;

public class Example4 extends JFrame
{
	private static final long serialVersionUID = 1L;
	public Example4()
	{
		setTitle("Ejemplo de dibujo");
		add(new Exampl4_POJO());
		setSize(250, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Example4();
	}
}
