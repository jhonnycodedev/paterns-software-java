package Solid_AULA08_Decorator;

public class Cafe implements iBebida{

	@Override
	public String Descricao() {
		
		return "Café";
	}

	@Override
	public double Preco() {
		
		return 3.0;
	}

}
