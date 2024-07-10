package Avaliacao_Semestral_Ecomeerce;



public class ProcessaPagamento {
	
	private iBandeiraCartao Mastercard;
	private iBandeiraCartao Visa;
	private iBandeiraCartao Senff;
	private iBandeiraCartao Elo;
	
	public Double valor;
	
	ProcessaPagamento(iBandeiraCartao Cartao){
		
		this.Elo = Cartao;
		this.Mastercard = Cartao;
		this.Visa= Cartao;
		this.Senff = Cartao;
		
	}
	
	
	public String processarPagamento() {
        if (Elo != null && valor != null && valor > 0) {
            if (Elo instanceof Mastercard) {
                return "Pagamento processado:\n" +
                        "Mastercard: " + ((Mastercard) Elo).Pagar(valor);
            } else if (Elo instanceof Visa) {
                return "Pagamento processado:\n" +
                        "Visa: " + ((Visa) Elo).Pagar(valor);
            } else if (Elo instanceof Senff) {
                return "Pagamento processado:\n" +
                        "Senff: " + ((Senff) Elo).Pagar(valor);
            } else {
                return "Pagamento não processado. Tipo de cartão não suportado.";
            }
        }
        return "Dados de pagamento inválidos.";
    }

}
