package Avaliacao_Exercicio2;


public class UTI implements iObserver{
	
	
	@Override
	public void update(Paciente paciente) {
		System.out.println("UTI: Paciente " + paciente.CustomerName + " admitido.");
	   
	}
	
}
	
	
	