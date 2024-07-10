package Solid_AULA05;



public class FabricaFormas {
	
		
	private Iforma forma;
		
		
		
	//-----------------------------------------------------//
	
	//injeção de dependencia;
		
		
	public FabricaFormas(Iforma tipo) {
		this.forma = tipo;
			
			
	}
		
	//-----------------------------------------------------//
		
		
	public String imprimeForma() {
		return this.forma.getNomeFigura();
	}
		
	//-----------------------------------------------------//
		

		
	
}
