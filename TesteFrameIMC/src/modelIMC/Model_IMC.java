package modelIMC;

import java.text.DecimalFormat;

public class Model_IMC {

		 private float peso;
		 private float altura;
		 public Model_IMC () {
		 }
		 
		 public Model_IMC(String peso, String altura) {
			 setPeso(peso);
			 setAltura(altura);
			 
			
		 }
		 
		 

		public float getPeso() {
			return peso;
		}
		public void setPeso(float peso) {
			this.peso = peso;
		}
		public void setPeso(String peso) {
			this.peso = (peso.matches("[0-9.]+")==false ? 0f:Float.parseFloat(peso));
		}
		public float getAltura() {
			return altura;
		}
		public void setAltura(float altura) {
			this.altura = altura;
		}
		public void setAltura(String altura) {
			this.altura = (altura.matches("[0-9.]+")==false ? 0f:Float.parseFloat(altura));
		}
		 public String getResult() {
			 Float imc = (peso / (altura*altura));
			 if(imc.isNaN())
				 return "Digite novamente!";
			 
			 
			 StringBuilder result = new StringBuilder("Seu IMC é: "+ new DecimalFormat("#.##").format(imc));
			 
			 if (imc <= 18.5) {
		         result.append(" Você está abaixo do peso!");
		         
			 }else if 
		         (imc > 18.6 && imc <= 24.9) {
		        	 result.append(" Você está com o peso normal!");
			 }else if 
		            (imc > 24.9 && imc <= 29.9) {
		            	 result.append(" Você está com sobrepeso! ");
			  }else if (imc > 29.9 && imc <= 34.9) {
		            	   result.append(" Você está com Obesidade Grau 1!");
		               } else if (imc > 34.9 && imc <= 39.9) {
		            		   result.append(" Você está com Obesidade Grau 2!");
		            	   } else if (imc >= 40) {
			            		   result.append(" Você está com Obesidade Grau 3!");
		 }
			 
		            	   
		            	     
		 return imc.toString();
		}
		@Override
		public String toString() {
			return "Model_IMC [peso=" + peso + ", altura=" + altura + ", getResult()=" + getResult() + "]";
		}

			 }
			 
		
		 


