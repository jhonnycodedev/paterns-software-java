package Avaliacao_Exercicio1;

public class Bacharelado extends Curso implements intercurso{
	
	
	
	@Override
	public String getNome() {
		return this.nome_curso;
	}
	
	@Override
	public String getMateria() {
		
		return this.Materia;
	}
	
	@Override
	public String getNota() {
		
		return this.Nota;
	}

	@Override
	public String StatusAluno() {
		
		float nota = Float.parseFloat(this.Nota);
		
		if(nota >= 6.0) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
		
	}

	

	

	


	
	//-----------------------------------------------------------------------------//
	
	
}
