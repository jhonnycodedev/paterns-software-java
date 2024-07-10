package Avaliacao_Semestral_Ecomeerce;

public class Senff implements iBandeiraCartao{
	
	 
	 
	@Override
    public String Pagar(Double valor) {
        
        return "Pagamento de R$" + valor + " com Senff aprovado.";
    }

}
