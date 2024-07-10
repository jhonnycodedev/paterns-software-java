package Solid_AULA07_FactoryMethod;

public class FabricaMySQL implements iFabrica {

	public iProduto fabricarProdutoA() {
		return new produtoAMysql();
	}

	public iProduto fabricarProdutoB() {
		return new ProdutoBMysql();
	}

}
