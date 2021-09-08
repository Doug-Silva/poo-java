package Atividade05_T1_Exerc1;

public class TurmaAlunosMain {

	public static void main(String[] args) {
		
		Turma turma1 = new Turma("8° Serie B08");
		
		Aluno alun1 = new Aluno("Pedro", 8);
		Aluno alun2 = new Aluno("Aline", 10);
		
		turma1.setAluno1(alun1);
		turma1.setAluno2(alun2);
		
		System.out.println("Turma: " + turma1.getNomeTurma());
		System.out.println("Aluno1: " + turma1.getAluno1().getNome() + "\n"+"Nota: " + turma1.getAluno1().getNota());
		System.out.println("\n");
		System.out.println("Aluno2: " + turma1.getAluno2().getNome() + "\n"+"Nota: " + turma1.getAluno2().getNota());
		
	}
	
}
