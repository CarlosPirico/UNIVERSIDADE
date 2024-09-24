package app;
import models.Aluno;
public class Main {

	public static void main(String[] args) {
		// Aluno EAD
		Aluno aluno1 = new Aluno("Carlos", 123456, Aluno.TipoAula.EAD);
		// lançando 2 notas.
		aluno1.setNota(7.0, 6.5);
		System.out.println(aluno1.toString() + "\n");
		// relançando 3 nota.
		aluno1.setNota(7.0, 4.5, 3.2);
		System.out.println(aluno1.toString() + "\n");
		// relançando 4 nota.
		aluno1.setNota(7.0, 6.5, 7.9, 9);
		System.out.println(aluno1.toString() + "\n");
		
		// Alunos PRESENCIAL
		Aluno aluno2 = new Aluno("Zeca", 654321, Aluno.TipoAula.PRESENCIAL, 74);
		// testando nota maxima com pouca frequencia.
		aluno2.setNota(10, 10, 10, 10);
		System.out.println(aluno2.toString() + "\n");
		
		Aluno aluno3 = new Aluno("Pedro", 456123, Aluno.TipoAula.PRESENCIAL, 76);
		// testando com frequencia e com 4 notas.
		aluno3.setNota(10, 10, 10, 10);
		System.out.println(aluno3.toString() + "\n");
		// relançando 3 nota.
		aluno3.setNota(7.0, 6.5, 5);
		System.out.println(aluno3.toString() + "\n");
		// relançando 2 nota.
		aluno3.setNota(7.0, 2);
		System.out.println(aluno3.toString() + "\n");

	}

}
