package AguaPack;

import java.text.DecimalFormat;

public class Agua_Calc {
	private float pesoAgua;
	 private float idadeAgua;
	 public Agua_Calc () {
		 
	 }
	 public Agua_Calc (String pesoAgua, String idadeAgua) {
		 setPesoAgua(pesoAgua);
		 setIdadeAgua(idadeAgua);
		 
		
	 }
	private float getPesoAgua() {
		return pesoAgua;
	}
	private void setPesoAgua(float pesoAgua) {
		this.pesoAgua = pesoAgua;
	}
	public void setPesoAgua(String pesoAgua) {
		this.pesoAgua = (pesoAgua.matches("[0-9.]+")==false ? 0f:Float.parseFloat(pesoAgua));
	}
	private float getIdadeAgua() {
		return idadeAgua;
	}
	private void setIdadeAgua(float idadeAgua) {
		this.idadeAgua = idadeAgua;
	}
	public void setIdadeAgua(String idadeAgua) {
		this.idadeAgua = (idadeAgua.matches("[0-9.]+")==false ? 0f:Float.parseFloat(idadeAgua));

}
	 public String getResultAgua() {
		 Float consumoAgua = pesoAgua*35;
		 if(consumoAgua.isNaN())
         return "Digite novamente!";
		 
		 StringBuilder result = new StringBuilder("Com base em seu peso, o consumo ideal de água é de "+ new DecimalFormat("#.##").format(consumoAgua) + " ml por dia.");
		
		

	 return consumoAgua.toString();
	 }
	@Override
	public String toString() {
		return " Com base em seu peso de " + pesoAgua + " (Kg)" + " e idade de " + idadeAgua + " anos" + "| O consumo ideal de água é de " + getResultAgua()
				+ " ml por dia";
	}
	 
}

