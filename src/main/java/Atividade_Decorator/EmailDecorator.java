package Atividade_Decorator;

public abstract class EmailDecorator implements Email {
	
	protected Email mail;
	
	
	public EmailDecorator(Email decoratedEmail) {
        this.mail = decoratedEmail;
    }

	
    public String getContents() {
        return mail.getContents();
    }

    
   
    public void sendEmail() {
        mail.sendEmail();
    
    }

}