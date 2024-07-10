package Avaliacao_Exercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Turma {
	private iFabricaCurso curso;
	private intercurso bacharelado;
	private intercurso mestrado;
	private intercurso ensinomedio;
	
	
	private HashMap<intercurso, Estudante> turma = new HashMap<>();
	
	//-----------------------------------------------------------------------------------//
	
	Turma(intercurso tipo){
		
		this.bacharelado  = tipo;
		this.mestrado = tipo;
		this.ensinomedio = tipo;
		
		
	}
	
	//-----------------------------------------------------------------------------------//
	
	
	public void addTurma(intercurso tipo, Estudante newaluno) {
		turma.put(tipo, newaluno);
	}
	

	public void findTurma() {
		
		for (Entry<intercurso, Estudante> entry : turma.entrySet()) {
			
			Estudante aluno = entry.getValue();
			intercurso curso = entry.getKey();
			
			System.out.println(
					"Curso: " + curso.getNome()+
					"\nAluno: " + aluno.nome + 
					"\nMatricula: " + aluno.matricula+
					"\nMateria: " + curso.getMateria()+
					"\nStatus: " + curso.StatusAluno()+
					"\n");
		}

	}

	
}
