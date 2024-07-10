package Solid_AULA06_AVALIACAO;

public class Motocicleta extends Veiculo implements Iveiculos{
	
	String _cilindrada;
	
	
	public String salvar() {
		
		//envia os dados recebidos do app para salvar em algum lugar que queira;
		
		String sql = String.format("%s,%s,%s,%s,%s,%s,%s",
				this._marca, this._modelo, this._anoFabricacao, 
				this._preco,this._cilindrada, "Motocicleta", 0);  
		  
			
		
		return sql;
	}

	public void atualizar() {
		// TODO Stub de método gerado automaticamente
		
	}

	public void deletar(int id) {
		// TODO Stub de método gerado automaticamente
		
	}

	
	
	
	
	
}