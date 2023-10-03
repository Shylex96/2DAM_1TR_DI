package examples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Fun1 extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JButton botonSaray, botonDima, botonVS;
	
	public Fun1()
	{
		setTitle("Combates");
		setLayout(null);
		botonSaray = new JButton(new ImageIcon("resources/saray.png"));
		botonDima = new JButton(new ImageIcon("resources/dima.png"));
		botonVS = new JButton(new ImageIcon("resources/versus.png"));
		
		add(botonDima);
		add(botonSaray);
		add(botonVS);
		
		botonDima.setBounds(160, 10, 300, 300);
		botonSaray.setBounds(160, 400, 300, 300);
		botonVS.setBounds(220, 330, 200, 50);
		botonSaray.addActionListener(this);
		botonDima.addActionListener(this);
		botonVS.addActionListener(this);
		
		setSize(600, 750);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o = e.getSource();
		if(o.equals(botonDima))
		{
			System.out.println("¡Eres un hombre!");
		}
		else if(o.equals(botonSaray))
		{
			System.out.println("¡Eres una mujer!");
		}
	}

	public static void main(String[] args)
	{
		new Fun1();
	}
}