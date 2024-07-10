package Solid_AULA04_Atividade2;

public class VendaProdutos extends Contexto {
	
	protected double margemLucro;
	
	
	
	public double calcularCustoTotal() {
		
		return this.custoDireto * margemLucro;
	}

}
