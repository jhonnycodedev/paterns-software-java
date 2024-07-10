package Solid_AULA01;
import java.util.ArrayList;

public class Estoque {

	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	
	public void addproduto(Produto novo) {
		this.produtos.add(novo);
		
	}
	
	
	public Produto buscarprodutoporcodigo(int cod) {
		
		Produto objeto = null;
		
		for(Produto x : produtos) {
			if(x.codigo==cod){
				objeto = x;
			}
		return objeto;
		}
		return null;
	}
}
