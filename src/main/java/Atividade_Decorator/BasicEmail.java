package Atividade_Decorator;

//Classe concreta BasicEmail
public class BasicEmail implements Email{

	String message;
	
	public BasicEmail(String newmessage) {
		this.message = newmessage;
	}
	
	
	@Override
	public String getContents() {
		
		return message;
	}

	@Override
	public void sendEmail() {
		System.out.println("Enviando e-mail....");
	}
		
	

}
