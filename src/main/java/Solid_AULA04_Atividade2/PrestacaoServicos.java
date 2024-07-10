package Solid_AULA04_Atividade2;

public class PrestacaoServicos extends Contexto{
	
	
	protected int taxaServico;
	
	
	public double calcularCustoTotal() {
		
		return this.custoDireto + taxaServico;
	}

}
