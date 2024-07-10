package Atividade_Abstract_Factory;

public class ConsumidorVestuario {

	private iFabricaVestuario fabrica;
	public iProdutoVestuario camisa;
	public iProdutoVestuario tenis;
	public iInventario estoque;
	
	
	ConsumidorVestuario(iFabricaVestuario fabrica){
		
		this.fabrica = fabrica;
		this.camisa = fabrica.faricaCamisa();
		this.tenis = fabrica.faricaTenis();
		this.estoque = fabrica.manager();
	}

	
	
	
	
}