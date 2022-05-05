package imcCalculo;

import View.Entrar_Imc;

import javax.swing.JOptionPane;

import View.LayoutCalc;
import View.Model_IMC;
//import modelIMC.Model_Imc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import modelIMC.Model_Imc;

public class CalculoIMC implements ActionListener {
	private Entrar_Imc  context;
	private Model_IMC imc;

public  CalculoIMC() {
	
}
public  CalculoIMC (Entrar_Imc context) {
	if(this.context ==null)
		this.context = context;
}
	

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	imc = new Model_IMC(context.getPesoTextField().getText(),
			context.getAlturaTextField().getText());

      context.getResultadoTextPane().setText (imc.toString());
      
}

}
	

