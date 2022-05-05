package View;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import rcqM.RCQ_Model;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class RCQCalc extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2059967785228479471L;
	private JPanel contentPane;
	private JTextField cinturaTextField;
	private JTextField quadrilTextField;
	private JTextPane respostaRcqTextPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RCQCalc frame = new RCQCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RCQCalc() {
		setTitle("Rela\u00E7\u00E3o cintura-quadril  (RCQ)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel rcqLabel = new JLabel("C\u00E1lculo RCQ");
		rcqLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		rcqLabel.setBounds(163, 37, 173, 32);
		contentPane.add(rcqLabel);
		
		JLabel rcqCinturaLabel = new JLabel("Circunfer\u00EAncia da cinturas (cm)");
		rcqCinturaLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		rcqCinturaLabel.setBounds(21, 110, 221, 37);
		contentPane.add(rcqCinturaLabel);
		
		JLabel circunfernciaDoQuadril = new JLabel("Circunfer\u00EAncia do quadril (cm)");
		circunfernciaDoQuadril.setFont(new Font("Arial", Font.PLAIN, 15));
		circunfernciaDoQuadril.setBounds(21, 170, 221, 37);
		contentPane.add(circunfernciaDoQuadril);
		
		cinturaTextField = new JTextField();
		cinturaTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		cinturaTextField.setHorizontalAlignment(SwingConstants.CENTER);
		cinturaTextField.setText("0.0");
		cinturaTextField.setBounds(252, 108, 200, 39);
		contentPane.add(cinturaTextField);
		cinturaTextField.setColumns(10);
		
		quadrilTextField = new JTextField();
		quadrilTextField.setText("0.0");
		quadrilTextField.setHorizontalAlignment(SwingConstants.CENTER);
		quadrilTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		quadrilTextField.setColumns(10);
		quadrilTextField.setBounds(252, 167, 200, 39);
		contentPane.add(quadrilTextField);
		
		JButton rcqNewButton = new JButton("Calcular");
		rcqNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		rcqNewButton.setBounds(21, 240, 431, 46);
		rcqNewButton.addActionListener(new RCQ_Model(this));
		contentPane.add(rcqNewButton);
		
	respostaRcqTextPane = new JTextPane();
		respostaRcqTextPane.setFont(new Font("Arial", Font.PLAIN, 12));
		respostaRcqTextPane.setBounds(21, 297, 431, 128);
		contentPane.add(respostaRcqTextPane);
	}

	private JPanel getContentPanercq() {
	return contentPane;
	}

	private void setContentPanercq(JPanel contentPane) {
 this.contentPane = contentPane;	}

	public JTextField getCinturaTextField() {
		return cinturaTextField;
	}

	public void setCinturaTextField(JTextField cinturaTextField) {
		this.cinturaTextField = cinturaTextField;
	}

	public JTextField getQuadrilTextField() {
		return quadrilTextField;
	}

	public void setQuadrilTextField(JTextField quadrilTextField) {
		this.quadrilTextField = quadrilTextField;
	}

	public JTextPane getRespostaRcqTextPane() {
		return respostaRcqTextPane;
	}

	public void setRespostaRcqTextPane(JTextPane respostaRcqTextPane) {
		this.respostaRcqTextPane = respostaRcqTextPane;
	}

}
