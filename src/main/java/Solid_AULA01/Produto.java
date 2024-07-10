package Solid_AULA01;

public class Produto {
	 int codigo;
	 String nome;
	 double preco;
	 int quantidade;
	 
	 
	 
	 public double calcularValorTotal() {
		 
		 return this.preco * this.quantidade;
	 }
}
