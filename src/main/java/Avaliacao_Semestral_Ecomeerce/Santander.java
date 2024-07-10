package Avaliacao_Semestral_Ecomeerce;

public class Santander implements iFabricaCartao{

	protected Double Limite;
	protected Cartao cartao;
	
	@Override
	public iBandeiraCartao Mastercard() {
		return new Mastercard();
	}

	@Override
	public iBandeiraCartao Visa() {
		return new Visa();
	}

	@Override
	public iBandeiraCartao Elo() {
		return null;
	}

	@Override
	public iBandeiraCartao Senff() {
		return null;
	}

}
