package teste;

import java.util.ArrayList;
import java.util.List;

public class EmergenciaHospital implements iObservable {
	
private List<Observer> observadores = new ArrayList<Observer>();
	 
	private Paciente paciente = new Paciente();	
	
	public EmergenciaHospital(String cpf, String  customerName) {
	    this.paciente.setCpf(cpf); 
	    this.paciente.setStatus(0);
	    this.paciente.setCustomerName(customerName);
	}
	
	
		
	//---------------------------------------------------------------------------------//
	
	public void adicionarObservador(Observer observador) {
        observadores.add(observador);
        this.notificarObservadores();
        
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }
	
	
    public void updatePaciente(int status){
    	this.paciente.setStatus(status);
        this.notificarObservadores();
    }
    
    public void notificarObservadores() {
        for (Observer x : observadores) {
            x.update();
        }
    }

}
