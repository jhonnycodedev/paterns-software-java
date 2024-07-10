package Solid_AULA07_FactoryMethod;

public class fabricaCassandra implements iFabrica{

	public iProduto fabricarProdutoA() {
		
		return new produtoACassandra();
	}

	public iProduto fabricarProdutoB() {
		
		return new produtoBCassandra();
	}

}
