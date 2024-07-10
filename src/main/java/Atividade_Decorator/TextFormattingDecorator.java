package Atividade_Decorator;

public class TextFormattingDecorator extends EmailDecorator{
	
	
	
	public TextFormattingDecorator(Email decoratedEmail) {
		super(decoratedEmail);
		
		
	}

	public String getContents() {
		return this.mail.getContents() + "\n    [Texto em Negrito e Itálico]";
	}

}
