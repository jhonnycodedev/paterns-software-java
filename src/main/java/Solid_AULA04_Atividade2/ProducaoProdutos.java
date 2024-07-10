package Solid_AULA04_Atividade2;

public class ProducaoProdutos extends Contexto {
	
	protected double custoIndireto;
	
	
	public double calcularCustoTotal() {
		
		return this.custoDireto + custoIndireto;
	}

}
