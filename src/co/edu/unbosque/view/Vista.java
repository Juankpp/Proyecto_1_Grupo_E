package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.unbosque.controlador.Controlador;

public class Vista extends JFrame {
	
	Controlador co;
	private PanelPrincipal panel;

	public Vista(Controlador co) {
		
		setSize(650, 500);
		
		setLocationRelativeTo(null);

		panel = new PanelPrincipal();
		getContentPane().add(panel);
		setVisible(true);
		
	}

	public PanelPrincipal getPanel() {
		return panel;
	}

}
