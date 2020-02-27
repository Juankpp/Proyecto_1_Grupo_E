package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField input;
	private JButton sendBtn;
	public static final String SEND = "send";
	
	public PanelOperaciones() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(2, 1));
		TitledBorder border = BorderFactory.createTitledBorder("Operations");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		input = new JTextField();
		sendBtn = new JButton("Send");
		sendBtn.setActionCommand(SEND);
		
		add(input);
		add(sendBtn);
	}

	public JTextField getInput() {
		return input;
	}

	public void setInput(JTextField input) {
		this.input = input;
	}

	public JButton getSendBtn() {
		return sendBtn;
	}

	public void setSendBtn(JButton sendBtn) {
		this.sendBtn = sendBtn;
	}
	
	

}
