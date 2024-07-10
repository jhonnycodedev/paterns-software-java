package Solid_AULA02;

public abstract class cartao_base implements servico_financeiro{
	
		public String Nome="";
		public String Numero="";
		public String Data_Validade="";
		public Double valor_pagar = 0.0;
		public boolean resultado = false;
		
		public boolean Pagar() {
			return this.resultado;
		};
		
		public boolean ValidarNome() {
			return this.resultado;
		};
			
		
		public boolean ValidarData() {
			return this.resultado;
		};
			
		
		public boolean ValidarNumero() {
			return this.resultado;
		};
			
			
		public boolean Validar() {
			return this.resultado;
		};
			 	
		
}

