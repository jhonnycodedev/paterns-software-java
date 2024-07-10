package Atividade_Abstract_Factory;


public abstract interface iFabricaEletronic {
	
	iProdutoEletronic fabricarNotebook();
	iProdutoEletronic fabricarSmartphone();
	iInventario manager();
}
