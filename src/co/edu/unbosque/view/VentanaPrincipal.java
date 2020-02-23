package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.unbosque.controlador.Controlador;

public class VentanaPrincipal extends JFrame {

	private PanelPrincipal panel;

	public VentanaPrincipal(Controlador co) {

		setTitle("Proyecto corte 1");
		setSize(650, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		panel = new PanelPrincipal();
		getContentPane().add(panel);
		setVisible(true);

	}

	public PanelPrincipal getPanel() {
		return panel;
	}

}
