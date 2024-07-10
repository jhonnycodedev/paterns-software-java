package Solid_AULA05;



public class consumidor {

	public static void main(String[] args) {
		
		FabricaFormas x = new FabricaFormas(Circulo.desenhaCirculo());
		
		System.out.println(x.imprimeForma());
		
		FabricaFormas y = new FabricaFormas(Retangulo.desenhaRetangulo());
		
		System.out.println(y.imprimeForma());

	}

}
