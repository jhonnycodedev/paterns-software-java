package Atividade_Abstract_Factory;



public class ConsumidorEletronico {
	
	
	private iFabricaEletronic fabrica;
	public iProdutoEletronic notebook;
	public iProdutoEletronic celular;
	public  iInventario estoque;
	
	

	
	ConsumidorEletronico(iFabricaEletronic fabrica){
		
		this.fabrica = fabrica;
		this.notebook = fabrica.fabricarNotebook();
		this.celular = fabrica.fabricarSmartphone();
		this.estoque = fabrica.manager();
		
	}

	












	
	
	//---------------------------------------------------------------------//
	







	

}
