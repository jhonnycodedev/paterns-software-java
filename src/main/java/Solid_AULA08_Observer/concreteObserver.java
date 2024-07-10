package Solid_AULA08_Observer;

public class concreteObserver extends ABSObserver{

	public concreteObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	
	
	@Override
	public void Update() {
		System.out.println("O observador foi notificado. Novo estado do objeto " 
	+ this.subject.getState());
		
	}

}
