package rcqPack;

import java.text.DecimalFormat;

public class RCQ_Calc {
	 private float cintura;
	 private float quadril;
	 public RCQ_Calc () {
	 }

	 public RCQ_Calc (String cintura, String quadril) {
		 setCintura(cintura);
		 setQuadril(quadril);
		 
}

	public float getCintura() {
		return cintura;
	}

	public void setCintura(float cintura) {
		this.cintura = cintura;
	}
	public void setCintura(String cintura) {
		this.cintura = (cintura.matches("[0-9.]+")==false ? 0f:Float.parseFloat(cintura));
	}
	public float getQuadril() {
		return quadril;
	}

	public void setQuadril(float quadril) {
		this.quadril = quadril;
	}
	public void setQuadril(String quadril) {
		this.quadril = (quadril.matches("[0-9.]+")==false ? 0f:Float.parseFloat(quadril));
		
	}
	 public String getResultRCQ() {
		 Float relacao = cintura / quadril;
		 if(relacao.isNaN())
			 return "Digite novamente!";
		 StringBuilder result = new StringBuilder("Seu resultado é de "+ new DecimalFormat("#.##").format(relacao));
		 
		 if (relacao <= 0.86) 
	         result.append(" o que significa que você tem baixo risco de desenvolver problemas cardiovasculares!");
	         
		  
		 else if (relacao > 0.87) {
	        	 result.append(" o que significa que você tem alto risco de desenvolver problemas cardiovasculares!");
	         }
	 
	 
	         
		 
		 return result.toString();
	 }

	
	         
	 


	@Override
	public String toString() {
	return getResultRCQ ();
	
	
}
}