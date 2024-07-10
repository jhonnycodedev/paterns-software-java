package Atividade_Observer;



public interface iObservable {
	
	
	void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    Object retornaOrder();
}
