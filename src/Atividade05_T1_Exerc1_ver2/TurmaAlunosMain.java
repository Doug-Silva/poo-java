package Atividade05_T1_Exerc1_ver2;

public class TurmaAlunosMain {

public static void main(String[] args) {
		
		Aluno alun1 = new Aluno("Pedro", 8);
		Aluno alun2 = new Aluno("Aline", 10);
		
		Turma turma1 = new Turma("8° Serie B08", alun1, alun2);
		
		System.out.println("Turma: " + turma1.getNomeTurma());
		System.out.println("Aluno1: " + turma1.getAluno1().getNome() + "\n"+"Nota: " + turma1.getAluno1().getNota());
		System.out.println("\n");
		System.out.println("Aluno2: " + turma1.getAluno2().getNome() + "\n"+"Nota: " + turma1.getAluno2().getNota());
		
	}
	
}
