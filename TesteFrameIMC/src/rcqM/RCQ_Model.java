package rcqM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
//import View.Model_IMC;
import View.ConsumoAgua;
import View.RCQCalc;
import rcqPack.RCQ_Calc;

public class RCQ_Model  implements ActionListener {
	private RCQCalc  context;
	private RCQ_Calc relacao;
	public  RCQ_Model() {
		
	}
	public  RCQ_Model (RCQCalc context) {
		if(this.context ==null)
			this.context = context;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	 relacao = new RCQ_Calc(context.getCinturaTextField().getText(),
				context.getQuadrilTextField().getText());

	      context.getRespostaRcqTextPane().setText (relacao.toString());
	}

}
