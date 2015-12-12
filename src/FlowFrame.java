import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class FlowFrame extends JFrame {

	private Font _defaultFont;
	private JLabel _firstNameLabel;
	
	public FlowFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		getContentPane().setLayout(new FlowLayout());
		
		this._firstNameLabel = new JLabel("First Name");
		this._firstNameLabel.setFont(this._defaultFont);
		getContentPane().add(_firstNameLabel);
	}
	
	private void _intialize(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,100,100);
		getContentPane().setLayout(new FlowLayout());
		this._defaultFont = new Font("Helvetica Neue", Font.PLAIN, 16);
	}

}
