package Avaliacao_Semestral_Ecomeerce;

public class Visa implements iBandeiraCartao{
	
	 
	 
	 @Override
	    public String Pagar(Double valor) {
	       
	        return "Pagamento de R$" + valor + " com Visa aprovado.";
	    }
	
	 
}