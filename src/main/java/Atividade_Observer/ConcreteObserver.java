package Atividade_Observer;



class ConcreteObserver implements Observer {
	
	protected iObservable pedido;
	
	
	
    public ConcreteObserver(orderTracker order) {
    	this.pedido = order;
        this.pedido.addObserver(this);
        
        
    }

	@Override
	public void update() {
		System.out.print("\nNotificação para " + pedido.retornaOrder());
				
		
	}

   

	
	
}






