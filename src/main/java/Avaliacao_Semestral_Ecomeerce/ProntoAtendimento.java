package teste;

class ProntoAtendimento implements Observer{
	
	protected iObservable atendimento;
	public ERP atende;
	
	
    public ProntoAtendimento(iObservable  paciente) {
    	this.atendimento = paciente;
        this.atendimento.adicionarObservador(this);
        this.atende.Enfermaria().update();
        this.atende.UTI().update();
        this.atende.Triagem().update();
        
    }


	@Override
	public void update() {
		// TODO Stub de método gerado automaticamente
		
	}
    
}