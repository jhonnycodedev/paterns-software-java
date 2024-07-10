package Atividade_Abstract_Factory;

public class CamisaNike extends Produto implements iProdutoVestuario{

	public Produto Selecionar() {
		
		Produto novo = new Produto();
		
		novo.Nome = "Camisa Brasil";
		novo.Preco = 349.90;
		novo.SKU = "614313465654";
		
		return novo;
	}
	
	
}
