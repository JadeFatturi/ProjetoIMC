package AguaPackM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import AguaPack.Agua_Calc;
import View.ConsumoAgua;
import View.Entrar_Imc;
import View.Model_IMC;

public class Agua_Model implements ActionListener{
	private ConsumoAgua  context;
	private Agua_Calc consumoAgua;
	
	public Agua_Model() {
	
	}
	public  Agua_Model (ConsumoAgua  context) {
		if(this.context ==null)
			this.context = context;
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
 consumoAgua = new Agua_Calc(context.getAguaTextField().getText(),
			context.getIadeAguaTextField().getText());

 context.getRespostaAguaTextPane().setText (consumoAgua.toString());
}
}
