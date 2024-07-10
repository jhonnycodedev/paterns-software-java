package Atividade_Polimorfismo_1e2;

public class Retangulo extends geometria {

	
	public int calculaArea() {
		
		return this.base * this.altura;
		
	}
	
	public int calculaPerimetro() {
		
		return 2* (this.base + this.altura);
		
		
	}
	
}
