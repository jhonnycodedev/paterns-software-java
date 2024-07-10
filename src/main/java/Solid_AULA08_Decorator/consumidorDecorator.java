package Solid_AULA08_Decorator;

public class consumidorDecorator {

	public static void main(String[] args) {
		
		iBebida cafe = new Cafe();
		System.out.println("Pedido1: " + cafe.Descricao() + " " + cafe.Preco());
		
		cafe = new acucarDecorator(cafe);
		System.out.println("Pedido2: " + cafe.Descricao() + " " + cafe.Preco());
		
		cafe = new leiteDecorator(cafe);
		System.out.println("Pedido2: " + cafe.Descricao() + " " + cafe.Preco());
		
		
	}

}
