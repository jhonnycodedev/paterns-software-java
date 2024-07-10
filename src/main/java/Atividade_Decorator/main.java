package Atividade_Decorator;

public class main {

	public static void main(String[] args) {
		
		Email basicEmail = new BasicEmail("Oh zé paga meu dinehiro..!!!");

        
		basicEmail = new TextFormattingDecorator(basicEmail);
		
		basicEmail = new AttachmentDecorator(basicEmail);
		
		basicEmail = new SignatureDecorator(basicEmail);
		
        
        //basicEmail.sendEmail();
        System.out.println("Conteúdo: \n" +"    " +basicEmail.getContents());
	}
}


		
