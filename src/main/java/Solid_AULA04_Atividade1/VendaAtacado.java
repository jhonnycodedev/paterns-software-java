package Solid_AULA04_Atividade1;

public class VendaAtacado extends Transacao{
	
	private double _desconto;
	
	
	public double calcularvalorliquido() {
		
		return this.getValorbruto() - this._desconto;
		
	}
}
