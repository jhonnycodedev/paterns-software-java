package Atividade_Abstract_Factory;

public class TenisNike extends Produto implements iProdutoVestuario{

	public Produto Selecionar() {
		
		Produto novo = new Produto();
		
		novo.Nome = "Tenis Nike Air Force 1";
		novo.Preco = 789.00;
		novo.SKU = "26294949649489";
		
		
		return novo;
	}
	
}
