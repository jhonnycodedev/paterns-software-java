package Avaliacao_Exercicio1;

import java.util.Scanner;

public class consumidor {

	public static void main(String[] args) {
		
		
		
		//CRIANDO NOVA FABRICA DE ESTUDO
		
		iFabricaCurso cursotipo = new UniversidadePositivo();
		
		
		//CRIANDO TURMA PARA MESTRADO
		Turma turma1 = new Turma(cursotipo.Mestrado());
		
		
		
		//ADICIONANDO ESTUDANTE
		
		Scanner teclado =  new Scanner(System.in);
		
		for(int x = 0; x <=0;  x++) {//AUMENTAR A VARIAVEL X SE QUISER MAIS ALUNOS;
			
			
			Estudante l = new Estudante();//CRIANDO OBJETO DO TIPO ESTUDANTE
			Mestrado Odontologia = new Mestrado();//CRIANDO OBJETO DA CLASSE MESTRADO
			Odontologia.nome_curso = "Odontologia";
			
			
			System.out.println("Curso de " + Odontologia.nome_curso);
			System.out.println("Aluno N°"+ x+1);
			System.out.print("Digite seu Nome: ");
			l.nome = teclado.nextLine();
			
			System.out.print("Digite seu CPF: ");
			l.cpf = teclado.nextLine();
			
			System.out.print("Digite seu eMAIL: ");
			l.email = teclado.nextLine();
		
			System.out.print("Digite sua Matricula: ");
			l.matricula = teclado.nextLine();
			
			System.out.print("informe a materia: ");
			Odontologia.Materia = teclado.nextLine();
			
			System.out.print("Digite sua Nota: ");
			Odontologia.Nota = teclado.nextLine();
			
			
			turma1.addTurma(Odontologia, l);//ADICIONANDO CURSO JUNTO AO ESTUDANTE
			System.out.println();
		}
		
		
		
		
		
		//------------------------------------------------------------------------//
		
		//CRIANDO TURMA PARA BACHARELADO
		
		Turma turma2 = new Turma(cursotipo.Bacharelado());
				
				
		
		//ADICIONANDO ESTUDANTE
				
		
				
		for(int x = 0; x <=0;  x++) { //AUMENTAR A VARIAVEL X SE QUISER MAIS ALUNOS;
					
					
			Estudante l = new Estudante();//CRIANDO OBJETO DO TIPO ESTUDANTE
			Bacharelado BSI = new Bacharelado();//CRIANDO OBJETO DA CLASSE BACHARELADO
			BSI.nome_curso = "Sistemas de Informação";
					
					
			System.out.println("Curso de " + BSI.nome_curso);		
			System.out.println("Aluno N°"+ x+1);
			System.out.print("Digite seu Nome: ");
			l.nome = teclado.nextLine();
					
			System.out.print("Digite seu CPF: ");
			l.cpf = teclado.nextLine();
					
			System.out.print("Digite seu eMAIL: ");
			l.email = teclado.nextLine();
				
			System.out.print("Digite sua Matricula: ");
			l.matricula = teclado.nextLine();
			
			System.out.print("informe a materia: ");
			BSI.Materia = teclado.nextLine();
			
			System.out.print("Digite sua Nota: ");
			BSI.Nota = teclado.nextLine();
					
					
			turma2.addTurma(BSI, l);//ADICIONANDO CURSO JUNTO AO ESTUDANTE
			System.out.println();
			}
				
				
			
			
		
			//------------------------------------------------------------------------//
			//CRIANDO NOVA FABRICA DE ESTUDO
			
			iFabricaCurso cursotipo1 = new C_E_do_Parana();
			
			
			//CRIANDO TURMA PARA O CURSO
			Turma turma3 = new Turma(cursotipo.EnsinoMedio());
			
			
			
			//ADICIONANDO ESTUDANTE
			
			
			
			for(int x = 0; x <=0;  x++) {//AUMENTAR A VARIAVEL X SE QUISER MAIS ALUNOS;
				
				
				Estudante l = new Estudante();//CRIANDO OBJETO DO TIPO ESTUDANTE
				EnsinoMedio ensino = new EnsinoMedio();//CRIANDO OBJETO DA CLASSE ENSINOMEDIO
				ensino.nome_curso = "Ensino Médio";
				
				
				System.out.println("Curso de " + ensino.nome_curso);
				System.out.println("Aluno N°"+ x+1);
				System.out.print("Digite seu Nome: ");
				l.nome = teclado.nextLine();
				
				System.out.print("Digite seu CPF: ");
				l.cpf = teclado.nextLine();
				
				System.out.print("Digite seu eMAIL: ");
				l.email = teclado.nextLine();
			
				System.out.print("Digite sua Matricula: ");
				l.matricula = teclado.nextLine();
				
				System.out.print("informe a materia: ");
				ensino.Materia = teclado.nextLine();
				
				System.out.print("Digite sua Nota: ");
				ensino.Nota = teclado.nextLine();
				
				
				turma3.addTurma(ensino, l);//ADICIONANDO CURSO JUNTO AO ESTUDANTE
				System.out.println();
			}
			
			
			//------------------------------------------------------------------------//
			//IMPRIMINDO TURMAS;
			turma1.findTurma();
			turma2.findTurma();
			turma3.findTurma();
			
		
	}

}
