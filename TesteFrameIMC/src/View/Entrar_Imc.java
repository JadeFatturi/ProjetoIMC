package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import imcCalculo.CalculoIMC;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class Entrar_Imc extends JFrame {
	private JTextField pesoTextField;
	private JTextField alturaTextField;
	private JTextPane resultadoTextPane;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrar_Imc frame = new Entrar_Imc();
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
	public Entrar_Imc() {
		setAlwaysOnTop(true);
		setTitle("C\u00E1lculadora IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel calculadoraNewLabel = new JLabel("Calculadora IMC");
		calculadoraNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
		calculadoraNewLabel.setBounds(124, 11, 239, 68);
		contentPane.add(calculadoraNewLabel);
		
		JLabel pesoNewLabel = new JLabel("Peso (kg)");
		pesoNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		pesoNewLabel.setBounds(53, 101, 91, 30);
		contentPane.add(pesoNewLabel);
		
		pesoTextField = new JTextField();
		pesoTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		pesoTextField.setHorizontalAlignment(SwingConstants.CENTER);
		pesoTextField.setText("0.0");
		pesoTextField.setBounds(191, 97, 239, 36);
		contentPane.add(pesoTextField);
		pesoTextField.setColumns(10);
		
		JLabel alturaNewLabel = new JLabel("Altura (m)");
		alturaNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		alturaNewLabel.setBounds(53, 175, 91, 30);
		contentPane.add(alturaNewLabel);
		
		alturaTextField = new JTextField();
		alturaTextField.setText("0.0");
		alturaTextField.setHorizontalAlignment(SwingConstants.CENTER);
		alturaTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		alturaTextField.setColumns(10);
		alturaTextField.setBounds(191, 182, 239, 36);
		contentPane.add(alturaTextField);
		
		JButton calcularNewButton = new JButton("Calcular");
		calcularNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		calcularNewButton.setBounds(53, 241, 377, 44);
		calcularNewButton.addActionListener(new CalculoIMC(this));
		contentPane.add(calcularNewButton);
		
	 resultadoTextPane = new JTextPane();
		resultadoTextPane.setFont(new Font("Arial", Font.PLAIN, 12));
		resultadoTextPane.setBounds(53, 309, 377, 120);
		contentPane.add(resultadoTextPane);
		
	}


	public JTextField getPesoTextField() {
		return pesoTextField;
	}

	public void setPesoTextField(JTextField pesoTextField) {
		this.pesoTextField = pesoTextField;
	}

	public JTextField getAlturaTextField() {
		return alturaTextField;
	}

	public void setAlturaTextField(JTextField alturaTextField) {
		this.alturaTextField = alturaTextField;
	}

	public JTextPane getResultadoTextPane() {
		return resultadoTextPane;
	}

	public void setResultadoTextPane(JTextPane resultadoTextPane) {
		this.resultadoTextPane = resultadoTextPane;
	}

	
	

}
