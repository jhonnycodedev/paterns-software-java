package Atividade_Abstract_Factory;

public class TenisAdidas extends Produto implements iProdutoVestuario{

	public Produto Selecionar() {
		
		Produto novo = new Produto();
		
		novo.Nome = "Tenis Adizero Pro3";
		novo.Preco = 2099.00;
		novo.SKU = "654659875665";
		
		
		return novo;
	}
	
	

}
