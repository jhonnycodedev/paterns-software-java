package Avaliacao_Semestral_Ecomeerce;

public interface iFabricaCartao {
	
	iBandeiraCartao Mastercard();
	iBandeiraCartao Visa();
	iBandeiraCartao Elo();
	iBandeiraCartao Senff();
}
