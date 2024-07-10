package Avaliacao_Semestral_Ecomeerce;

public class Mastercard implements iBandeiraCartao{
		
	 
	 @Override
	    public String Pagar(Double valor) {
	        
	        return "Pagamento de R$" + valor + " com Mastercard aprovado.";
	    }

	 	
}
