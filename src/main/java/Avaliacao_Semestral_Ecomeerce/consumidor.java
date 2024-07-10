package Avaliacao_Semestral_Ecomeerce;


public class consumidor {

	public static void main(String[] args) {
		
		iFabricaCartao cartaoItaucard = new Itaucard();
        ProcessaPagamento pagamento1 = new ProcessaPagamento(cartaoItaucard.Mastercard());
        pagamento1.valor = 100.0;
        System.out.println(pagamento1.processarPagamento());

        iFabricaCartao cartaoSantander = new Santander();
        ProcessaPagamento pagamento2 = new ProcessaPagamento(cartaoSantander.Visa());
        pagamento2.valor = 50.0;
        System.out.println(pagamento2.processarPagamento());
        
        iFabricaCartao cartaoAndaraki = new Andaraki();
        ProcessaPagamento pagamento3 = new ProcessaPagamento(cartaoAndaraki.Senff());
        pagamento3.valor = 200.0;
        System.out.println(pagamento3.processarPagamento());
    }
	
}