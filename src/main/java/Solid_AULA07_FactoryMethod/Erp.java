package Solid_AULA07_FactoryMethod;

public class Erp {

	public static void main(String[] args) {
		iFabrica fabrica = new fabricaCassandra(); //Esta parte se converterá em parâmetro de ambiente
		consumidor consumidor = new consumidor(fabrica);
		System.out.println(consumidor.produtoA.Salvar());
		System.out.println(consumidor.produtoB.Salvar());
	}

}
