package Atividade_Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import Solid_AULA08_Observer.ABSObserver;

public class orderTracker extends Order implements iObservable{
	

	
	
	private List<Observer> observers = new ArrayList<>();
	 
	

	public orderTracker(String  customerName) {
	    this.orderId =UUID.randomUUID(); // Gera um identificador único para o pedido
	    this.status = "Pendente";
	    this.location = "Armazém";
	    this.customerName = customerName;
	}
		
		
	//---------------------------------------------------------------------------------//
	
	
	public Object retornaOrder() {
		
		return this.orderId;
	}
	
		
		
	public void updateStatus(String newStatus) {
		  this.status = newStatus;
		  this.notifyObservers();
		  
		  System.out.println("\nStatus mudou para '" + status + "'");
	}

	public void updateLocation(String newLocation) {
		  this.location = newLocation;
		  System.out.println("Localização do Pedido mudou para '" + location +"'");
	}
		

	 
	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for (Observer x : observers) {
            x.update();
        }
		
	}
	
}
	
	
	