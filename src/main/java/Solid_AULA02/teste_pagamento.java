package Solid_AULA02;

public class teste_pagamento {
	
	public static void main(String[] args) {
		
		cartao_de_credito cc = new cartao_de_credito();
		
		venda v;
		v = new venda();
		
		cc.Nome = "Pedro de Lara";
		cc.Numero = "1234";
		cc.Data_Validade = "08/2030";
		cc.valor_pagar = 10.100;
		
		
		if(v.ProcessarPagamento(cc) == true) {
			System.out.println("Compra cc confirmada");
		}
		
		if(v.ProcessarPagamento(cc) == false) {
			System.out.println("Compra cc confirmada");
		}
		
		 
		
		
		//=========================================================//
		venda f;
		f = new venda();
		
		cartao_senff cs = new cartao_senff();
		
		
		
		
		cs.Data_Validade = "2011";
		cs.valor_pagar = 0.0;
		
		if(f.ProcessarPagamento(cs) == true) {
			System.out.println("Compra cs confirmada");
		}
		
		if(f.ProcessarPagamento(cs) == false) {
			System.out.println("Compra cs confirmada");
		}
		
	}
}


