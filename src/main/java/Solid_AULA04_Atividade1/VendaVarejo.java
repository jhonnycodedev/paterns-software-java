package Solid_AULA04_Atividade1;

public class VendaVarejo extends Transacao {
	
	private int _taxaimposto;
	
	
	
	
	public double calculaImposto() {
		
		return (this._taxaimposto / 100) * this.getValorbruto();
		
	}
	
	
	public double calcularvalorliquido() {
		
		return this.getValorbruto() - this.calculaImposto();
		
	}

}
