package teste;

public class app {

	public static void main(String[] args) {
		EmergenciaHospital observado = new EmergenciaHospital("123.45.789-60","joão");
		
		Observer ob1 = new ProntoAtendimento(observado);
		// 5 -EMERGENCIA
		// 4 -MUITO URGENTE
		// 3 -URGENTE
		// 2 -POUCO URGENTE
		// 1- NÃO URGENTE
		
		
		//observado.updatePaciente(5);
        

	}

}
