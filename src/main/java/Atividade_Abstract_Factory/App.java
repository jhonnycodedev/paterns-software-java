package Atividade_Abstract_Factory;


public class App {

	public static void main(String[] args) {
		
		
		iFabricaVestuario fabrica = new Adidas(); //Esta parte se converterá em parâmetro de ambiente
		ConsumidorVestuario consumidor = new ConsumidorVestuario(fabrica);
		
		iFabricaVestuario fabrica1 = new Nike();
		ConsumidorVestuario consumidor1 = new ConsumidorVestuario(fabrica1);
		
		consumidor.estoque.adicionar(consumidor.camisa.Selecionar());
		consumidor.estoque.adicionar(consumidor.tenis.Selecionar());
		consumidor1.estoque.adicionar(consumidor1.camisa.Selecionar());
		consumidor1.estoque.adicionar(consumidor1.tenis.Selecionar());
		
		consumidor.estoque.findAllCliente();
		consumidor1.estoque.findAllCliente();

		
		iFabricaEletronic fabrica2 = new Samsung(); 
		ConsumidorEletronico consumidor2 = new ConsumidorEletronico(fabrica2);
	
		consumidor2.estoque.adicionar(consumidor2.notebook.Selecionar());
		consumidor2.estoque.adicionar(consumidor2.celular.Selecionar());
		
		
		iFabricaEletronic fabrica3 = new Apple(); 
		ConsumidorEletronico consumidor3 = new ConsumidorEletronico(fabrica3);
		consumidor3.estoque.adicionar(consumidor3.notebook.Selecionar());
		consumidor3.estoque.adicionar(consumidor3.celular.Selecionar());
		
		consumidor2.estoque.findAllCliente();
		consumidor3.estoque.findAllCliente();
		
		
	}

}
