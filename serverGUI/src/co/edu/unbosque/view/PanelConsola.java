package co.edu.unbosque.view;

import java.awt.Color;

import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelConsola extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextArea cmd;
	
	public PanelConsola() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(1,1));
		TitledBorder border = BorderFactory.createTitledBorder("Console");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		cmd = new JTextArea();
		cmd.setBackground(Color.BLACK);
		cmd.setForeground(Color.GREEN);
		
		cmd.setEditable(false);
		cmd.setLineWrap(true);
		
		add(cmd);
		
	}

	public JTextArea getCmd() {
		return cmd;
	}

	public void setCmd(JTextArea cmd) {
		this.cmd = cmd;
	}
	
	
	
	

}
