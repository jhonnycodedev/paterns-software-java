package Avaliacao_Exercicio2;



public class ProntoAtendimento implements iHospital{

	public Paciente paciente;
	
	
	@Override
	public iObserver UTI() {
		
		return new UTI();
	}

	@Override
	public iObserver Enfermaria() {
		
		return new Enfermaria();
	}

	@Override
	public iObserver Triagem() {
		
		return new Triagem();
	}


	@Override
	public iObservable subject() {
		
		return new Subject();
	}

	
	

	
	
}






