package Avaliacao_Exercicio2;

import java.util.ArrayList;

import java.util.List;



public class Subject  implements iObservable{
	
	
	
	
	private List<ProntoAtendimento> observers = new ArrayList<>();
	

		
		
	//---------------------------------------------------------------------------------//
	
		
	public void updateStatus(ProntoAtendimento observer) {
			
			this.addObserver(observer);
		
	}
		

	 
	@Override
	public void addObserver(ProntoAtendimento observer) {
		this.observers.add(observer);
		this.notifyObservers();
		
	}

	@Override
	public void removeObserver(ProntoAtendimento observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for (ProntoAtendimento x : observers) {
			if(x.paciente.Status == 5) {
				x.UTI().update(x.paciente);
			}
			if(x.paciente.Status == 3 || x.paciente.Status == 4) {
				x.Enfermaria().update(x.paciente);
			}
			if(x.paciente.Status == 2) {
				x.Triagem().update(x.paciente);
			}
			if(x.paciente.Status == 0 || x.paciente.Status == 1) {
				System.out.println("Pronto Atendimento: Paciente " + x.paciente.CustomerName + " aguardando Triagem.");
			}
			
			}
            
           
        
	}
	
}
	