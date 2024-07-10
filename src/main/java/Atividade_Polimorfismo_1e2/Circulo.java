package Atividade_Polimorfismo_1e2;

import java.lang.Math;

public class Circulo extends geometria {

	
	public int calculaArea() {
		
		return (int) (Math.PI*Math.pow(this.raio, 2));
		
		
	}
	
	public int calculaPerimetro() {
		
		return (int) (2*(Math.PI*this.raio));
	}
}
