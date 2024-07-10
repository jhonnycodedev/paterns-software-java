package Solid_AULA04_Atividade1;

public class PrestacaoServicos extends Transacao{
	
	private int _taxaServico;
	
	
	
	public double calculaImposto() {
		
		return (this._taxaServico / 100) * this.getValorbruto();
		
	}
	
	
	
	public double calcularvalorliquido() {
		
		return this.getValorbruto() - this.calculaImposto();
		
	}
	

}
