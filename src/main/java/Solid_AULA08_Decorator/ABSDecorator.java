package Solid_AULA08_Decorator;

public abstract class ABSDecorator implements iBebida{
	
	protected  iBebida bebida;
	
	public ABSDecorator(iBebida bebida) {
		this.bebida = bebida;
	}

}
