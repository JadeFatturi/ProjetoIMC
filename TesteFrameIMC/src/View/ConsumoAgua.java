package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;


import javax.swing.border.EmptyBorder;

import AguaPackM.Agua_Model;


import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class ConsumoAgua extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPaneAgua;
	private JTextField aguaTextField;
	private JTextField iadeAguaTextField;
	private JTextPane respostaAguaTextPane;

	/**
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsumoAgua frame = new ConsumoAgua();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the panel.
	 */
	public ConsumoAgua() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Consumo de \u00E1gua");
		setBounds(100, 100, 500, 500);
		 contentPaneAgua = new JPanel();
		 contentPaneAgua.setBorder(new EmptyBorder(5, 5, 5, 5));
		 setContentPane (contentPaneAgua);
		 contentPaneAgua.setLayout(null);
		
		getContentPane().setLayout(null);
		
		JLabel aguaLabel = new JLabel("Ingest\u00E3o di\u00E1ria de \u00E1gua");
		aguaLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
		aguaLabel.setBounds(88, 33, 307, 32);
		contentPaneAgua.add(aguaLabel);
		
		JLabel pesoAguaLabel = new JLabel("Peso (kg)");
		pesoAguaLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		pesoAguaLabel.setBounds(54, 80, 108, 32);
		contentPaneAgua.add(pesoAguaLabel);
		
		aguaTextField = new JTextField();
		aguaTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		aguaTextField.setText("0.0");
		aguaTextField.setHorizontalAlignment(SwingConstants.CENTER);
		aguaTextField.setBounds(172, 80, 240, 32);
		contentPaneAgua.add(aguaTextField);
		aguaTextField.setColumns(10);
		
		JLabel iadeAguaLabel = new JLabel("Idade");
		iadeAguaLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		iadeAguaLabel.setBounds(54, 169, 77, 32);
		contentPaneAgua.add(iadeAguaLabel);
		
		iadeAguaTextField = new JTextField();
		iadeAguaTextField.setText("0.0");
		iadeAguaTextField.setHorizontalAlignment(SwingConstants.CENTER);
		iadeAguaTextField.setFont(new Font("Arial", Font.PLAIN, 20));
		iadeAguaTextField.setColumns(10);
		iadeAguaTextField.setBounds(172, 169, 240, 32);
		contentPaneAgua.add(iadeAguaTextField);
		
		JButton calcularAguaNewButton = new JButton("Calcular");
		calcularAguaNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		calcularAguaNewButton.setBounds(54, 233, 382, 52);
		calcularAguaNewButton.addActionListener(new Agua_Model(this));
		contentPaneAgua.add(calcularAguaNewButton);
		
		respostaAguaTextPane = new JTextPane();
		respostaAguaTextPane.setFont(new Font("Arial", Font.PLAIN, 12));
		respostaAguaTextPane.setBounds(54, 296, 382, 128);
		contentPaneAgua.add(respostaAguaTextPane);

	}

	private JPanel getContentPaneAgua() {
		return contentPaneAgua;
	}

	private void setContentPaneAgua(JPanel contentPaneAgua) {
		this.contentPaneAgua = contentPaneAgua;
	}

	public JTextField getAguaTextField() {
		return aguaTextField;
	}

	public void setAguaTextField(JTextField aguaTextField) {
		this.aguaTextField = aguaTextField;
	}

	public JTextField getIadeAguaTextField() {
		return iadeAguaTextField;
	}

	private void setIadeAguaTextField(JTextField iadeAguaTextField) {
		this.iadeAguaTextField = iadeAguaTextField;
	}

	public JTextPane getRespostaAguaTextPane() {
		return respostaAguaTextPane;
	}

	private void setRespostaAguaTextPane(JTextPane respostaAguaTextPane) {
		this.respostaAguaTextPane = respostaAguaTextPane;
	}

	private static long getSerialversionuid() {
		return serialVersionUID;
	}

}
