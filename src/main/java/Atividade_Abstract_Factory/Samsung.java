package Atividade_Abstract_Factory;

public class Samsung implements iFabricaEletronic{

	

	public iProdutoEletronic fabricarNotebook() {
		return new NotebookSamsung() ;
	}

	public iProdutoEletronic fabricarSmartphone() {
		
		return new SmartphoneSamsung();
	}

	public iInventario manager() {
		
		return  new inventarioEletronic();
	}

	

}
