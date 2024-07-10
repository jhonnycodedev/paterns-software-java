package Atividade_Decorator;

public class SignatureDecorator extends EmailDecorator{
	
	
	
	public SignatureDecorator(Email decoratedEmail) {
		super(decoratedEmail);
		
	}
	
	public String getContents() {
        return this.mail.getContents() + "\n    -- att, João canabrava...!!!" ;
    }
	
	
}
