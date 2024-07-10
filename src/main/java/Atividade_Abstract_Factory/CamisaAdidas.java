package Atividade_Abstract_Factory;

public class CamisaAdidas extends Produto implements iProdutoVestuario {

	
	
	public Produto Selecionar() {
		
		Produto novo = new Produto();
		
		novo.Nome = "Camisa Italia";
		novo.Preco = 359.58;
		novo.SKU = "056431646846654";
		
		
		return novo;
	}


}
