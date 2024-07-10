package teste;


public class ERP implements iHospital{

	@Override
	public Observer UTI() {
		
		return new UTI();
	}

	@Override
	public Observer Enfermaria() {
		
		return new Enfermaria();
	}

	@Override
	public Observer Triagem() {
		
		return new Triagem();
	}

}
