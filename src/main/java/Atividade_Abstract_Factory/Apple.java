package Atividade_Abstract_Factory;

public class Apple implements iFabricaEletronic{
	
	
	
	
	
	public iProdutoEletronic fabricarNotebook() {
		return new NotebookApple() ;
	}

	public iProdutoEletronic fabricarSmartphone() {
		
		return new SmartphoneIphone();
	}

	public iInventario manager() {
		
		return  new inventarioEletronic();
	}



	

	

}
