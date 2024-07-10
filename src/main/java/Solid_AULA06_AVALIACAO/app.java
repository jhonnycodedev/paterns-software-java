package Solid_AULA06_AVALIACAO;

public class app {

	public static void main(String[] args) {
		
		// Escolha entre BancoDeDadosArmazenamento ou ArquivoArmazenamento
		Iarmazenamento armazenamento = new ArquivoArmazenamento(); // ou new ArquivoArmazenamento()
		
		/*
		Carro carro1 = new  Carro();
		carro1._marca = "Volkswagem";
		carro1._modelo= "Jetta";
		carro1._anoFabricacao = 2022;
		carro1._nroPortas = 5;
		carro1._preco = 84000.0;
		carro1.motor = "2.0 Highline";
		*/
		
		Motocicleta moto = new Motocicleta();
		moto._marca = "Honda";
		moto._modelo = "CBX";
		moto._cilindrada = "500cc";
		moto._anoFabricacao = 2019;
		moto._preco = 35000.00;
		
		
		
		
		
		
		// Escolha entre BancoDeDadosArmazenamento ou ArquivoArmazenamento
		Concessionaria concessionaria = new Concessionaria(armazenamento);
		
		concessionaria.veiculosConcessionariaAdd(moto);
		
        System.out.println(concessionaria.veiculosConcessionariaView());

}
}
