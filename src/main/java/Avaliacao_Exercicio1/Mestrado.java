package Avaliacao_Exercicio1;

public class Mestrado extends Curso implements intercurso{
	
	
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

		if (this.Nota.equals("a") || this.Nota.equals("A")) {
			return "Aprovado";
		}
		if (this.Nota.equals("b") || this.Nota.equals("B")) {
			return "Aprovado";
		}
		if (this.Nota.equals("c") || this.Nota.equals("C")) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	
	}


	
	
}
