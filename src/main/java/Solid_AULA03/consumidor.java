package Solid_AULA03;

public class consumidor {

	public static void main(String[] args) {
		
		Estudante aluno = new Estudante();
		aluno.cpf = "123";
		aluno.id = 32;
		aluno.nome = "pedrão";
		
		
		
		Graduacao novo = new Graduacao();
		novo.nome = "BSI";
		novo.nota = "7.0";
		
		System.out.println(novo.resultado());
		
		//-------------------------------------------
		
		
		Especializacao esp = new Especializacao();
		
		esp.nome = "BSI";
		esp.nota = "A";
		
		System.out.println(esp.resultado());
	}

}
