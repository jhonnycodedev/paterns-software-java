package Solid_AULA06_AVALIACAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;


import javax.swing.JOptionPane;

public class ArquivoArmazenamento implements Iarmazenamento {

	//caminho do arquivo
	static String nomearquivo = "C:/Users/guima/Downloads/arquivoVeiculos.txt";
	
	
	public void adicionarVeiculo(Iveiculos veiculo) {
		
		
		
		try {
			
			File file = new File(nomearquivo);
			
			
			
			if (file.exists()){
				
				//O parâmetro true indica que reescrevemos no arquivo
		        // sem apagar o que já existe.
		        // O false apagaria o conteúdo do arquivo e escreveria
		        // o novo conteúdo.
		        // Se não usar o 2° parâmetro, ele por padrão será false.
		        //O mais importante, essa linha abre o fluxo do arquivo 
					
					FileWriter fileWriter = new FileWriter(nomearquivo, true);
					
					
					//Agora vamos usar a classe PrintWriter para escrever
		            //fisicamente no arquivo.
					
					PrintWriter printWriter = new PrintWriter(fileWriter);
					
					//Agora vamos escrever no arquivo com o método  println(),
		            // que nos permite escrever linha a linha no arquivo
		           
					printWriter.println(veiculo.salvar());
					
					//o método flush libera a escrita no arquivo
		            printWriter.flush();

		            //No final precisamos fechar o arquivo
		            printWriter.close();
					
				}
			
			
				
			if (file.exists() == false) {
				//System.out.println("Diretório criado!");
				
				FileWriter fileWriter = new FileWriter(nomearquivo, false);
				
				
				//Agora vamos usar a classe PrintWriter para escrever
	            //fisicamente no arquivo.
				
				PrintWriter printWriter = new PrintWriter(fileWriter);
				
				//Agora vamos escrever no arquivo com o método  println(),
	            // que nos permite escrever linha a linha no arquivo
	           
				printWriter.println(veiculo.salvar());
				
				//o método flush libera a escrita no arquivo
	            printWriter.flush();

	            //No final precisamos fechar o arquivo
	            printWriter.close();
				
			}
			
			
			
			
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "Ocorreu um erro de gravação doarquivo! \n" +erro.getMessage());
			}
			
	}


	public Object imprimirEstoque() {
		
		

	    try {
	        //Indicamos o arquivo que será lido
	        FileReader fileReader = new FileReader(nomearquivo);

	        //Criamos o objeto bufferReader que nos
	        // oferece o método de leitura readLine()
	        
	        BufferedReader bufferedReader = new BufferedReader(fileReader);

	        //String que irá receber cada linha do arquivo
	        String linha = "";

	        //Fazemos um loop linha a linha no arquivo,
	        // enquanto ele seja diferente de null.
	        //O método readLine() devolve a linha na
	        // posicao do loop para a variavel linha.
	        
	        while ( ( linha = bufferedReader.readLine() ) != null) {
	        //Aqui imprimimos a linha
	        	System.out.println(linha);
	    }
			//liberamos o fluxo dos objetos ou fechamos o arquivo
	        
	        fileReader.close();
	        bufferedReader.close();
		} catch (IOException e) {
	    	e.printStackTrace();
	    }
		return "";
	}


	
	
	
	
	
}