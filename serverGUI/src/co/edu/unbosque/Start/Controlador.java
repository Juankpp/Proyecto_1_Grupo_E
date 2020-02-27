package co.edu.unbosque.Start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.Window;

public class Controlador implements ActionListener {
	
	private Window gui;
	
	public Controlador() {
		// TODO Auto-generated constructor stub
		gui = new Window(this);
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals(gui.getOp().SEND)) {
			gui.getCmd().getCmd().append(">"+gui.getOp().getInput().getText()+"\n");
			
			gui.getOp().getInput().setText("");
		}
		
	}

}
