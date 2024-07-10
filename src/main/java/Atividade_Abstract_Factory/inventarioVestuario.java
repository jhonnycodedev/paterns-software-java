package Atividade_Abstract_Factory;



public class inventarioVestuario extends Estoque implements iInventario {
	
	
	
	public boolean adicionar(Produto tipo) {
		if(tipo != null) {
			this.Vestuario.add(tipo);
			return true;
		}
		return false;
	}

	
	public boolean remover(Produto tipo) {
		for(Produto x : this.Vestuario) {
			if(x.SKU.equals(tipo.SKU)) {
				this.Vestuario.remove(x);
				return true;
			}
		}
		return false;
		
	
	}	
	


	public void findAllCliente() {
		
		
		for (Produto x : this.Vestuario) {
			
			x.displayinfo();
					 
			
		}
		
	
	
	}


	
}
