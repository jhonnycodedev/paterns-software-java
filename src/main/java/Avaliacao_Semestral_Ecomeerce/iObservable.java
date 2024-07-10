package teste;

public interface iObservable {
	
	void adicionarObservador(Observer observer);
    void removerObservador(Observer observer);
    void notificarObservadores();
    
}
