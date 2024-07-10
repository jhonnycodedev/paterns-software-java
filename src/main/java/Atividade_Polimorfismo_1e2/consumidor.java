package Atividade_Polimorfismo_1e2;

public class consumidor {

	public static void main(String[] args) {
		
		//Atividade 1;
		Retangulo novo = new Retangulo();
		
		novo.base = 13;
		novo.altura = 7;
		
		System.out.println("Area do retangulo: " + novo.calculaArea());
		System.out.println("Perimetro do retangulo: " +novo.calculaPerimetro());
		
		
		Circulo c = new Circulo();
		c.raio = 2;
		
		System.out.println("Area do circulo: "+ c.calculaArea());
		System.out.println("Perimetro do circulo: "+ c.calculaPerimetro());
		
		
		
		//gerarando um triangulo Atividade 1;
		
		int triangulo = novo.calculaArea()/2;
		System.out.println("Triangulo: "+ triangulo);
		
		
	}

}
