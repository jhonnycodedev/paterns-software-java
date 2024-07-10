package Avaliacao_Exercicio2;


public class main {

	public static void main(String[] args) {
		
		
		//atendendo 1° paciente;
		
		Paciente observado =  new Paciente();
		observado.Cpf = "123.456.789";
		observado.CustomerName = "João" ;
		observado.Status = 0;
		
		
		EmergenciaHospital atendimento1 = new EmergenciaHospital(observado);
		
		
		// 5 -EMERGENCIA
		// 4 -MUITO URGENTE
		// 3 -URGENTE
		// 2 -POUCO URGENTE
		// 1- NÃO URGENTE
		
		
		
		atendimento1.UpdateStatus(5);
		
		
		//---------------------------------------------------------------------------//
		//atendendo 2° paciente;
	
	
		Paciente observado1 =  new Paciente();
		observado1.Cpf = "456.789.123";
		observado1.CustomerName = "Pedro" ;
		observado1.Status = 0;
	
	
		EmergenciaHospital atendimento2 = new EmergenciaHospital(observado1);
	
	
		// 5 -EMERGENCIA
		// 4 -MUITO URGENTE
		// 3 -URGENTE
		// 2 -POUCO URGENTE
		// 1- NÃO URGENTE
	
	
	
		atendimento2.UpdateStatus(3);
	

	}
}
