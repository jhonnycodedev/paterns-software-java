package Avaliacao_Exercicio1;

public class C_E_do_Parana implements iFabricaCurso{

	@Override
	public intercurso EnsinoMedio() {
		
		return new EnsinoMedio();
	}

	@Override
	public intercurso Bacharelado() {
		
		return null;
	}

	@Override
	public intercurso Mestrado() {
		
		return null;
	}

}
