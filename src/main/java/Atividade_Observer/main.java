package Atividade_Observer;



public class main {

	public static void main(String[] args) {
		 	//(String Status, String Location, String  customerName)
		
		orderTracker observado = new orderTracker("joão");
		
		ConcreteObserver ob1 = new ConcreteObserver(observado);
		observado.updateStatus("Saida para entrega ontem");
		
		
	}

}
