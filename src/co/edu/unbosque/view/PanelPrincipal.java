package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class PanelPrincipal extends JPanel {
	private JPanel panel;
	private JLabel jugador1, puntos1, jugador2,puntos2,tiempo,dibujo;
	private JButton adivinar, ingresarL;
	private JTextField letra;
	public 	PanelPrincipal () {
	
		TitledBorder border = new TitledBorder("PanelPrincipal Principal");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		setLayout(null);
		componentes();

		
	}
	
	public void componentes() {
		
		jugador1 = new JLabel("Jugador x");
		jugador1.setBounds(20, 350, 100, 100);
		add(jugador1);
		
		puntos1 = new JLabel("Puntos jugador x");
		puntos1.setBounds(130,350,100,100);
		add(puntos1);
		
		jugador2 = new JLabel("Jugador y");
		jugador2.setBounds(400, 5, 100, 100);
		add(jugador2);
		
		puntos2 = new JLabel("Puntos jugador y");
		puntos2.setBounds(490,5,100,100);
		add(puntos2);
		
		adivinar = new JButton("Adivinar");
		adivinar.setBounds(450, 150, 150, 40);
		add(adivinar);
		
		ingresarL = new JButton("Ingresar letra");
		ingresarL.setBounds(450, 300, 150, 40);
		add(ingresarL);
		
		letra = new JTextField();
		letra.setBounds(450, 250, 50, 30);
		add(letra);
		
		tiempo = new JLabel("....");
		tiempo.setBounds(10, 0, 100, 100);
		add(tiempo);
		
		dibujo = new JLabel("Aqui va el ahorcado");
		dibujo.setBounds(40, 80, 300, 300);
		add(dibujo);
		dibujo.setBorder(BorderFactory.createEtchedBorder(null, null));
	}

	public JLabel getJugador1() {
		return jugador1;
	}

	public void setJugador1(JLabel jugador1) {
		this.jugador1 = jugador1;
	}

	public JLabel getPuntos1() {
		return puntos1;
	}

	public void setPuntos1(JLabel puntos1) {
		this.puntos1 = puntos1;
	}

	public JLabel getJugador2() {
		return jugador2;
	}

	public void setJugador2(JLabel jugador2) {
		this.jugador2 = jugador2;
	}

	public JLabel getPuntos2() {
		return puntos2;
	}

	public void setPuntos2(JLabel puntos2) {
		this.puntos2 = puntos2;
	}

	public JButton getAdivinar() {
		return adivinar;
	}

	public void setAdivinar(JButton adivinar) {
		this.adivinar = adivinar;
	}

	public JTextField getLetra() {
		return letra;
	}

	public void setLetra(JTextField letra) {
		this.letra = letra;
	}
	
	

}
