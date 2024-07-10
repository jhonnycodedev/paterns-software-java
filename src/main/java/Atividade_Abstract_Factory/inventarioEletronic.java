package Atividade_Abstract_Factory;



public  class inventarioEletronic extends Estoque implements iInventario{
	
	
	
	public boolean adicionar(Produto tipo) {
		if(tipo != null) {
			this.Eletronicos.add(tipo);
			return true;
		}
		return false;
		
	}

	
	public boolean remover(Produto tipo) {
		for(Produto x : this.Eletronicos) {
			if(x.equals(tipo)) {
				this.Eletronicos.remove(x);
				return true;
			}
		}
		return false;
		
	
	}	
	
	


	public void findAllCliente() {
		
	
		for (Produto x : this.Eletronicos) {
			x.displayinfo();
			
			
		}
		
	
	
	}

	
}
