package Avaliacao_Exercicio2;



public interface iObservable {
	
	
	void addObserver(ProntoAtendimento observer);
    void removeObserver(ProntoAtendimento observer);
    public void updateStatus(ProntoAtendimento observer);
    void notifyObservers();
    
	
}
