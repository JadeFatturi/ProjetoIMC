package tmbPackM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import AguaPack.Agua_Calc;
import View.ConsumoAgua;
import View.TmbView;
import tmbPack.TMB_Calc;

public class TMB_Model implements ActionListener{
	private TmbView  context;
	private TMB_Calc consumoAgua;
	
	public TMB_Model() {
	
	}
	public TMB_Model (TmbView  context) {
		if(this.context ==null)
			this.context = context;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
