package Solid_AULA01;

import java.util.ArrayList;

public class GerenciadorVendas {
	
	ArrayList<Venda> listavendas = new ArrayList<Venda>();
	
	public void addvenda(Venda nova) {
		this.listavendas.add(nova);
		
	}
}
