package Solid_AULA01;

import java.util.ArrayList;

public class Venda {
	
	ArrayList<Produto> produtosvendidos = new ArrayList<Produto>();
	
	
	public void addprodutovendido(Produto novo) {
		this.produtosvendidos.add(novo);
		
	}
	
	
	public Produto imprimirDetalhesVenda() {
		
		Produto objeto = null;
		
		for(Produto x : produtosvendidos) {
			
				objeto = x;
			}
		
		
		return objeto;
	}
}


