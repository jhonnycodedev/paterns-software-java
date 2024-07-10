package Solid_AULA06_AVALIACAO;


public class Concessionaria {
	
	
	private Iarmazenamento estoqueVeiculo;
	
	
//---------------------------------------------------//
	//injeção de dependencia
	
	public Concessionaria(Iarmazenamento novo) {
		this.estoqueVeiculo = novo;
		 
	}

	
	//---------------------------------------------------//
	
	public Object veiculosConcessionariaView() {
		
		//retorna lista de veiculos do estoque com a 
		//função integrada nas classes de armazenmaneto;
		
		
		return this.estoqueVeiculo.imprimirEstoque();
		 
		
	}

	
	//---------------------------------------------------//
	

	public Object veiculosConcessionariaAdd(Object tipo) {
		
		//envia os dados do veiculo para a função integradora 
		//existente nas subclases  de veiculos;
		
		this.estoqueVeiculo.adicionarVeiculo((Iveiculos) tipo);
		
		return null;
		 
		
	}

	
		
	
	
}
