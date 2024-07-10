package Solid_AULA02;

public class cartao_de_credito extends cartao_base {
	
	
	
	
	public boolean Pagar() {
		
		if(this.valor_pagar.equals(10.100)) {
			this.resultado = true;
		}
		else {
			this.resultado =false;
		}
		return this.resultado;
	}
	
	
	
	public boolean ValidarNome() {
		
		
		//invocar o endpoint da API da operadora de cartão de crédito
		
		if(this.Nome.equalsIgnoreCase("Pedro de Lara")){
			this.resultado = true;
		}
		else {
			this.resultado = false;
		}
		return this.resultado;
	}
	
	
	 public boolean ValidarData() {
		
		
		//invocar o endpoint da API da operadora de cartão de crédito
		
		if(this.Data_Validade.equalsIgnoreCase("08/2030")){
			this.resultado = true;
		}
		else {
			this.resultado = false;
		}
		return this.resultado;
	}
	
	
	 public boolean ValidarNumero() {
		
		
		//invocar o endpoint da API da operadora de cartão de crédito
		
		if(this.Numero.equalsIgnoreCase("1234")){
			this.resultado = true;
		}
		else {
			this.resultado = false;
		}
		return this.resultado;
	}
	
	
	 public boolean Validar() {
		
		
		
		if(this.ValidarData()
				&&this.ValidarNome()
				&&this.ValidarNumero()) {
			
			return true;
			
		}
		else {
			this.resultado = false;
		}
		return this.resultado;
	}
}
