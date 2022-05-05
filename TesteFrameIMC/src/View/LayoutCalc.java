package View;

import java.awt.EventQueue;


import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class LayoutCalc extends JFrame {
	private JFrame frameImc;
	private JFrame frameAgua;
	private JFrame frameRCQ;
	private JFrame frameTMB;
	

	public LayoutCalc() {
		setTitle("Saúde em dia");
		setSize(800, 500);
		setLocation(50, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menu = new JMenuBar();
		JMenu menuIMC = new JMenu("Imc");
		JMenu menuAgua = new JMenu ("Consumo de \u00E0gua");
		JMenu menuRCQ = new JMenu("RCQ");
		JMenu menuTMB = new JMenu ("TMB");
		
		JMenuItem entrarIMC = new JMenuItem ("Entrar");
		
		entrarIMC.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			Entrar_Imc entrat_ImcTela = new Entrar_Imc();
			entrat_ImcTela.setVisible(true);
			
				
			}
		});
	
		
		
		
	
		JMenuItem sairIMC = new JMenuItem (new SairAction());
		sairIMC.setText("Sair");
		
		menuIMC.add(entrarIMC);
		menuIMC.add(sairIMC);
		
		
		JMenuItem entrarAgua = new JMenuItem ("Entrar");
		entrarAgua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsumoAgua ConsumoAguaTela = new ConsumoAgua();
				ConsumoAguaTela.setVisible(true);
			}
		});
		
		
		JMenuItem sairAgua = new JMenuItem (new SairAction());
		sairAgua.setText("Sair");
		menuAgua.add(entrarAgua);
		menuAgua.add(sairAgua);
		
		JMenuItem entrarRCQ = new JMenuItem ("Entrar");
		entrarRCQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RCQCalc RCQCalcTela = new RCQCalc();
				RCQCalcTela.setVisible(true);
				
				
			}
		});
		JMenuItem sairRCQ = new JMenuItem (new SairAction());
		sairRCQ.setText("Sair");
		menuRCQ.add(entrarRCQ);
		menuRCQ.add(sairRCQ);
		
		JMenuItem entrarTMB = new JMenuItem ("Entrar");
		entrarTMB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TmbView TmbViewTela = new TmbView ();
				TmbViewTela.setVisible(true);
				
			}
		});
		JMenuItem sairTMB = new JMenuItem (new SairAction());
		sairTMB.setText("Sair");
		menuTMB.add(entrarTMB);
		menuTMB.add(sairTMB);
		
		menu.add(menuIMC);
		menu.add(menuAgua);
		menu.add(menuRCQ);
		menu.add(menuTMB);
		
		setJMenuBar(menu);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Imc = ");
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(23, 48, 78, 34);
		getContentPane().add(lblNewLabel);
		
		JTextPane txtpnOMenuDe = new JTextPane();
		txtpnOMenuDe.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnOMenuDe.setText("O menu de IMC, fornecer\u00E1 uma calculadora de IMC. Trata-se \u00CDndice de massa corporal, que nada mais \u00E9 que um c\u00E1lculo que serve para avaliar se a pessoa est\u00E1 dentro do seu peso ideal em rela\u00E7\u00E3o \u00E0 altura. ");
		txtpnOMenuDe.setBounds(102, 40, 521, 56);
		getContentPane().add(txtpnOMenuDe);
		
		JLabel lblConsumoDegua = new JLabel("Consumo de \u00E0gua");
		lblConsumoDegua.setForeground(new Color(75, 0, 130));
		lblConsumoDegua.setFont(new Font("Arial", Font.BOLD, 17));
		lblConsumoDegua.setBounds(23, 124, 163, 34);
		getContentPane().add(lblConsumoDegua);
		
		JTextPane txtpnOMenuDe_1 = new JTextPane();
		txtpnOMenuDe_1.setText("O menu de Consumo de \u00E1gua, fornecer\u00E1 uma calculadora de cosumo di\u00E1rio de \u00E1gua. Trata-se da sugest\u00E3o do consumo di\u00E1rio de  \u00E1gua que cada pessoa necessita ingerir, variando de acordo com o peso, idade ");
		txtpnOMenuDe_1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnOMenuDe_1.setBounds(176, 130, 521, 56);
		getContentPane().add(txtpnOMenuDe_1);
		
		JLabel lblRcq = new JLabel("RCQ = ");
		lblRcq.setForeground(new Color(255, 20, 147));
		lblRcq.setFont(new Font("Arial", Font.BOLD, 20));
		lblRcq.setBounds(23, 215, 78, 34);
		getContentPane().add(lblRcq);
		
		JTextPane txtpnOMenuDe_1_1 = new JTextPane();
		txtpnOMenuDe_1_1.setText("O menu de RCQ (rela\u00E7\u00E3o cintura-quadril), fornecer\u00E1 uma calculadora com a rela\u00E7\u00E3o cintura-quadril trata-se de um c\u00E1lculo que se faz a partir das medidas da cintura e do quadril para verificar o risco que uma pessoa tem de desenvolver uma doen\u00E7a cardiovascular.");
		txtpnOMenuDe_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnOMenuDe_1_1.setBounds(111, 221, 521, 56);
		getContentPane().add(txtpnOMenuDe_1_1);
		
		JLabel lblTmb = new JLabel("TMB = ");
		lblTmb.setForeground(new Color(0, 0, 139));
		lblTmb.setFont(new Font("Arial", Font.BOLD, 20));
		lblTmb.setBounds(23, 306, 78, 34);
		getContentPane().add(lblTmb);
		
		JTextPane txtpnOMenuDe_1_1_1 = new JTextPane();
		txtpnOMenuDe_1_1_1.setText("O menu de TMB (taxa metab\u00F3lica basal), fornecer\u00E1 uma calculadora de estima da taxa metab\u00F3lica basal. Ou seja, a quantidade de energia gasta em repouso (em um ambiente de temperatura neutra e em um estado p\u00F3s-absor\u00E7\u00E3o com isso podemos calcular e orientar o d\u00E9ficit cal\u00F3ric.");
		txtpnOMenuDe_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnOMenuDe_1_1_1.setBounds(102, 306, 521, 56);
		getContentPane().add(txtpnOMenuDe_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("O uso desse programa n\u00E3o dispensa a consulta de um profissional, programa apenas para exercitar os c\u00F3digos em Java");
		lblNewLabel_1.setBounds(53, 404, 696, 26);
		getContentPane().add(lblNewLabel_1);
		
		
		
		setVisible(true);

	}

	public static void main(String[] args) {
		new LayoutCalc();
	}



	public void setFrameIMC(JFrame frameIMC) {
		this.frameImc = frameIMC;
	}

	public JFrame getFrameTMB() {
		return frameTMB;
	}

	public void setFrameTMB(JFrame frameTMB) {
		this.frameTMB = frameTMB;
	}

	public JFrame getFrameRCQ() {
		return frameRCQ;
	}

	public void setFrameRCQ(JFrame frameRCQ) {
		this.frameRCQ = frameRCQ;
	}

	public JFrame getFrameAgua() {
		return frameAgua;
	}

	public void setFrameAgua(JFrame frameAgua) {
		this.frameAgua = frameAgua;
	}

	public JFrame getFrameImc() {
		return frameImc;
	}

	public void setFrameImc(JFrame frameImc) {
		this.frameImc = frameImc;
	}

	public Object getPesotextField() {
		// TODO Auto-generated method stub
		return null;
	}
	
}