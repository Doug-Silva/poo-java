package Atividade04_T1;

public class NotaAlunoComConstrutor {

public static void main(String[] args) {
	
		NotaAluno aluno1;
		aluno1 = new NotaAluno();        
		aluno1.nomeAluno = "Vanessa";
		aluno1.nota1 = 5;
		aluno1.nota2 = 6;
		
		NotaAluno aluno2;
		aluno2 = new NotaAluno("Pedro", 7, 9);
		
		// Execução:		
		
		System.out.println("Nome: " + aluno1.mostraNomeAluno());
		aluno1.statusAluno();
		System.out.println("Media: " + aluno1.mediaDoAluno());
		
		System.out.println("\n");
		
		System.out.println("Nome: " + aluno2.mostraNomeAluno());
		aluno2.statusAluno();
		System.out.println("Media: " + aluno2.mediaDoAluno());
		
	}
}
