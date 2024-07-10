package Avaliacao_Semestral_Ecomeerce;

public class Andaraki implements iFabricaCartao{


	protected Double Limite;
	protected Cartao cartao;
	
	@Override
	public iBandeiraCartao Mastercard() {
		return null;
	}

	@Override
	public iBandeiraCartao Visa() {
		return null;
	}

	@Override
	public iBandeiraCartao Elo() {
		return null;
	}

	@Override
	public iBandeiraCartao Senff() {
		return new Senff();
		
		
	}

}
