package Atividade_Abstract_Factory;

public class SmartphoneSamsung extends Produto  implements iProdutoEletronic{

	public Produto Selecionar() {
		
		Produto novo = new Produto();
		novo.Nome = "Samsung S23";
		novo.SKU = "123644789623";
		novo.Preco = 3700.00;
		
		return novo;
	}
	

}
