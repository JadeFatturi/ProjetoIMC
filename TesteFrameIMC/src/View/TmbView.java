package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AguaPackM.Agua_Model;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class TmbView extends JFrame {

	private JPanel contentPane;
	private JTextField pesoTMBtextField;
	private JTextField alturaTMBtextField;
	private JTextField idadeTMBtextField;
	private JTextPane respostaTMBTextPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TmbView frame = new TmbView();
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
	public TmbView() {
		setTitle("Taxa metab\u00F3lica basal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sexoTMBLabel = new JLabel("Sexo");
		sexoTMBLabel.setFont(new Font("Arial", Font.PLAIN, 21));
		sexoTMBLabel.setBounds(126, 90, 80, 54);
		contentPane.add(sexoTMBLabel);
		
		JRadioButton femininoTMBRadioButton = new JRadioButton("Feminino");
		femininoTMBRadioButton.setFont(new Font("Arial", Font.PLAIN, 20));
		femininoTMBRadioButton.setBounds(248, 83, 161, 23);
		contentPane.add(femininoTMBRadioButton);
		
		JRadioButton masculinoTMBRadioButton = new JRadioButton("Masculino");
		masculinoTMBRadioButton.setFont(new Font("Arial", Font.PLAIN, 20));
		masculinoTMBRadioButton.setBounds(248, 121, 161, 23);
		contentPane.add(masculinoTMBRadioButton);
		
		JLabel CalculoTMBNewLabel_1 = new JLabel("Calculo de taxa metab\u00F3lica basal");
		CalculoTMBNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 22));
		CalculoTMBNewLabel_1.setBounds(39, 11, 414, 52);
		contentPane.add(CalculoTMBNewLabel_1);
		
		JLabel pesoTMBLabel = new JLabel("Peso (kg)");
		pesoTMBLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		pesoTMBLabel.setBounds(99, 150, 95, 23);
		contentPane.add(pesoTMBLabel);
		
		JLabel alturaTMBLabel = new JLabel("Altura (m)");
		alturaTMBLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		alturaTMBLabel.setBounds(99, 187, 87, 23);
		contentPane.add(alturaTMBLabel);
		
		JLabel idadeTMBLabel = new JLabel("Idade");
		idadeTMBLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		idadeTMBLabel.setBounds(99, 230, 51, 23);
		contentPane.add(idadeTMBLabel);
		
		pesoTMBtextField = new JTextField();
		pesoTMBtextField.setHorizontalAlignment(SwingConstants.CENTER);
		pesoTMBtextField.setFont(new Font("Arial", Font.PLAIN, 15));
		pesoTMBtextField.setText("0.0");
		pesoTMBtextField.setBounds(196, 149, 195, 23);
		contentPane.add(pesoTMBtextField);
		pesoTMBtextField.setColumns(10);
		
		alturaTMBtextField = new JTextField();
		alturaTMBtextField.setText("0.0");
		alturaTMBtextField.setHorizontalAlignment(SwingConstants.CENTER);
		alturaTMBtextField.setFont(new Font("Arial", Font.PLAIN, 15));
		alturaTMBtextField.setColumns(10);
		alturaTMBtextField.setBounds(196, 186, 195, 23);
		contentPane.add(alturaTMBtextField);
		
		idadeTMBtextField = new JTextField();
		idadeTMBtextField.setText("0.0");
		idadeTMBtextField.setHorizontalAlignment(SwingConstants.CENTER);
		idadeTMBtextField.setFont(new Font("Arial", Font.PLAIN, 15));
		idadeTMBtextField.setColumns(10);
		idadeTMBtextField.setBounds(196, 229, 195, 23);
		contentPane.add(idadeTMBtextField);
		
		respostaTMBTextPane = new JTextPane();
		respostaTMBTextPane.setFont(new Font("Arial", Font.PLAIN, 12));
		respostaTMBTextPane.setBounds(23, 324, 431, 128);
		contentPane.add(respostaTMBTextPane);
		
		JButton tmbButton = new JButton("Calcular");
		tmbButton.setFont(new Font("Arial", Font.PLAIN, 17));
		tmbButton.setBounds(39, 274, 414, 39);
		contentPane.add(tmbButton);
	}

	
	
}
