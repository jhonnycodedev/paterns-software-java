package Avaliacao_Exercicio2;


	
public class Enfermaria implements iObserver{

	@Override
	public void update(Paciente paciente) {
		System.out.println("ENFERMARIA: Paciente " + paciente.CustomerName +" admitido.");
	}
	
}
