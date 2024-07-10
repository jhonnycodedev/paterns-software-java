package Avaliacao_Exercicio1;

public class UniversidadePositivo implements iFabricaCurso{
	

	@Override
	public intercurso EnsinoMedio() {
		
		return null;
	}

	@Override
	public intercurso Bacharelado() {
		
		return new Bacharelado();
	}

	@Override
	public intercurso Mestrado() {
		
		return new Mestrado();
	}

	
	
	
	
}
