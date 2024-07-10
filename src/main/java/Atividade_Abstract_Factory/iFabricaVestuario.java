package Atividade_Abstract_Factory;

public abstract interface iFabricaVestuario {
	
	
	iProdutoVestuario faricaTenis();
	iProdutoVestuario faricaCamisa();
	iInventario manager();
}
