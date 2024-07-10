package Solid_AULA06_AVALIACAO;



public class Carro extends Veiculo implements Iveiculos{
	
	int _nroPortas;
	String motor;
	
	
	public String salvar() {
		
		//envia os dados recebidos do app para salvar em algum lugar que queira;
		
		String sql = String.format("%s,%s,%s,%s,%s,%s,%s",
				this._marca, this._modelo, this._anoFabricacao, 
				this._preco,this.motor, "Carro", this._nroPortas);  
			
		
		return sql;
	}

	
	
	public void atualizar() {
		// TODO Stub de método gerado automaticamente
		
	}

	public void deletar(int id) {
		// TODO Stub de método gerado automaticamente
		
	}

	
	
	


	}
	
	
	
	
	
	
	
