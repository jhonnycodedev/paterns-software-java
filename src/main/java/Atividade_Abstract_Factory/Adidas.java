package Atividade_Abstract_Factory;

public class Adidas implements iFabricaVestuario{

	
	public iProdutoVestuario faricaTenis() {
		
		return new TenisAdidas();
	}

	public iProdutoVestuario faricaCamisa() {
		
		return new CamisaAdidas();
	}

	public iInventario manager() {
		
		return new inventarioVestuario();
	}
	
	
}
