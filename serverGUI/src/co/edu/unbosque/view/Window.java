package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import co.edu.unbosque.Start.Controlador;

public class Window extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanelConsola cmd;
	private PanelOperaciones op;
	
	
	
	public Window(Controlador control) {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		setSize(500,400);
		setTitle("Server Console");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		cmd = new PanelConsola();
		op = new PanelOperaciones();
		
		add(cmd, BorderLayout.CENTER);
		add(op, BorderLayout.SOUTH);
		
		op.getSendBtn().addActionListener(control);
	}



	public PanelConsola getCmd() {
		return cmd;
	}



	public void setCmd(PanelConsola cmd) {
		this.cmd = cmd;
	}



	public PanelOperaciones getOp() {
		return op;
	}



	public void setOp(PanelOperaciones op) {
		this.op = op;
	}
	
	
	
	

}
