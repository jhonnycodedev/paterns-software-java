package Avaliacao_Exercicio2;

public class Triagem implements iObserver{

	@Override
	public void update(Paciente paciente) {
		System.out.println("TRIAGEM: Paciente "+ paciente.CustomerName + " em avaliação...!!!");
		
	}

}
