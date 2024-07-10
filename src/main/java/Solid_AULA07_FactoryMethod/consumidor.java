package Solid_AULA07_FactoryMethod;

public class consumidor {
	private iFabrica Fabrica;
	public iProduto produtoA;
	public iProduto produtoB;
	
	consumidor(iFabrica fabrica){
		this.Fabrica = fabrica;
		this.produtoA = fabrica.fabricarProdutoA();
		this.produtoB = fabrica.fabricarProdutoB();
	}
}
