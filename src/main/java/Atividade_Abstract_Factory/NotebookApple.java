package Atividade_Abstract_Factory;



public class NotebookApple extends Produto implements iProdutoEletronic{
	
	
	public Produto Selecionar() {
		
		Produto novo = new Produto();
		
		novo.Nome = "MacBook Air";
		novo.SKU = "16519849819641";
		novo.Preco = 7600.00;
		
		return novo;
	}
	
}
