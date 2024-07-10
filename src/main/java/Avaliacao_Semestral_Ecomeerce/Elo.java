package Avaliacao_Semestral_Ecomeerce;

public class Elo implements iBandeiraCartao {
	
	
	 
	@Override
    public String Pagar(Double valor) {
        
        return "Pagamento de R$" + valor + " com Elo aprovado.";
    }

	
}
