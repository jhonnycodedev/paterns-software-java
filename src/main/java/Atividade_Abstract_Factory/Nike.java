package Atividade_Abstract_Factory;

public class Nike implements iFabricaVestuario{
	
	

	public iProdutoVestuario faricaTenis() {
		
		return new TenisNike();
	}

	public iProdutoVestuario faricaCamisa() {
		
		return new CamisaNike();
	}

	public iInventario manager() {
		
		return new inventarioVestuario();
	}
	
	
	
}
