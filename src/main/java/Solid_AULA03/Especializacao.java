package Solid_AULA03;

public class Especializacao extends Curso {
	
	
	
	
	public String resultado() {
		
		
		
		if(this.nota.equals("A") || this.nota.equals("a")) {
			
		
			this.resultado = "Aprovado";
			return this.resultado;
		}
		
		if(this.nota.equals("B") || this.nota.equals("b")) {
			
			
			this.resultado = "Aprovado";
			return this.resultado;
		}
		
		if(this.nota.equals("C") || this.nota.equals("c")) {
			
			
			this.resultado = "Aprovado";
			return this.resultado;
			
		}
		
		else{
			
			this.resultado = "reprovado";
			
			return this.resultado;
		}
		
	}	
}
