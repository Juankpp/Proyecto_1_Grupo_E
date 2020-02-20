package co.edu.unbosque.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.temporal.JulianFields;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import co.edu.unbosque.controlador.Controlador;

public class Iniciar extends JFrame implements ActionListener {
	Controlador co;
	JTextField usuario; 
	JButton aceptar;
	Vista v;

	public Iniciar(Controlador co) {

		setSize(300	, 300);

		setLocationRelativeTo(null);

		setVisible(true);
		usuario = new JTextField();
		usuario.setBounds(10, 10, 100, 100);
		add(usuario);
		aceptar = new JButton() ;
		aceptar.setBounds(160, 160, 100, 20);
		aceptar.setActionCommand("Aceptar");
		add(aceptar);
		aceptar.addActionListener(this);

	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String accion = e.getActionCommand();
		if (accion == "Aceptar") {
			v = new Vista(co);
			v.setVisible(true);
			v.getPanel().getJugador1().setText(usuario.getText());
		}

	}
	public JTextField getUsuario() {
		return usuario;
	}


}
