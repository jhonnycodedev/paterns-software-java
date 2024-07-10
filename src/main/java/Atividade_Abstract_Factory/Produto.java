package Atividade_Abstract_Factory;

public class Produto {
	
	protected String Nome;
	protected String SKU;
	protected double Preco;
	
	public Produto() {}
	
	
	
	public void displayinfo() {
		
		System.out.printf("\nPRODUTO: %s \nPRECO: %.2f \nSKU: %s\n", Nome, Preco, SKU);
		
		
	}



	
	
		
	
}
