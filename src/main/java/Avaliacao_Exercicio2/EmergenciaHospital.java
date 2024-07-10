package Avaliacao_Exercicio2;

;

public class EmergenciaHospital {
	
	
	
	private ProntoAtendimento setor;
	
	
	EmergenciaHospital(Paciente atende){
		
		setor = new ProntoAtendimento();
		
		this.setor.paciente = atende;
		this.setor.Enfermaria();
		this.setor.Triagem();
		this.setor.subject().addObserver(setor);
		
	}

  
	public void UpdateStatus(int status) {
		this.setor.paciente.Status = status;
		
		this.setor.subject().updateStatus(setor);
	}
	
	
	
}
