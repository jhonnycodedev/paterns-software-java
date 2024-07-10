package Atividade_Decorator;

public class AttachmentDecorator extends EmailDecorator{

	
	
	public AttachmentDecorator(Email decoratedEmail) {
		super(decoratedEmail);
		
	}
	
	
	public void sendEmail() {
        this.mail.sendEmail();
        System.out.println("Anexo: Boleto.pdf" );
    }

}
