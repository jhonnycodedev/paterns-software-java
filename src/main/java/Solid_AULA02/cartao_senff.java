package Solid_AULA02;

public class cartao_senff extends cartao_base{
	
	
	
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
	
	
}
