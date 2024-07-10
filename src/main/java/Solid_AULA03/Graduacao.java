package Solid_AULA03;

public class Graduacao extends Curso{
	
	
	
	public String resultado() {
		
		float number = Float.parseFloat(this.nota);
		
		if(number >= 6) {
			
			resultado = "Aprovado";
			return this.resultado;
		}
		
		if(number <= 5.9 && number > 4.0) {
			
			resultado = "Exame Final";
			
			return this.resultado;
		}
		
		else{
			
			resultado = "reprovado";
			
			return this.resultado;
		}
		
		
		
	}
}
