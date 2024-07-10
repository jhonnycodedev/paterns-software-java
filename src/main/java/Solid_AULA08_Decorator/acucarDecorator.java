package Solid_AULA08_Decorator;

public class acucarDecorator extends ABSDecorator{

	public acucarDecorator(iBebida bebida) {
		super(bebida);
		
	}

	@Override
	public String Descricao() {
		
		return bebida.Descricao() + "com açucar";
	}

	@Override
	public double Preco() {
		
		return bebida.Preco() + 0.1;
	}

}
