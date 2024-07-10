package Solid_AULA08_Decorator;

public class leiteDecorator extends ABSDecorator {

	public leiteDecorator(iBebida bebida) {
		super(bebida);
		
	}

	@Override
	public String Descricao() {
		
		return bebida.Descricao() + "com leite";
	}

	@Override
	public double Preco() {
		
		return bebida.Preco() + 0.5;
	}

}
