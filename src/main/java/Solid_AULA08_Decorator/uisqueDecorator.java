package Solid_AULA08_Decorator;

public class uisqueDecorator extends ABSDecorator{

	public uisqueDecorator(iBebida bebida) {
		super(bebida);
		
	}

	@Override
	public String Descricao() {
		
		return bebida.Descricao() + "com uisque";
	}

	@Override
	public double Preco() {
		
		return bebida.Preco() + 30;
	}

}
