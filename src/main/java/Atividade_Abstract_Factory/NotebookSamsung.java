package Atividade_Abstract_Factory;

public class NotebookSamsung extends Produto implements iProdutoEletronic{

	public Produto Selecionar() {
		
		Produto novo = new Produto();
		
		novo.Nome = "Notebook Galaxy Book3 360";
		novo.SKU = "651649464184";
		novo.Preco = 6500.00;
		
		return novo;
	}


}
