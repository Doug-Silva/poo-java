package Atividade03_T1_Exerc1;

public class NotaAluno {
	
//  Atributos:
	
	String nomeAluno; 
	float nota1; 
	float nota2;
	
//  Metodos:
//	String mostraNomeAluno() “mostra o nome do aluno” 
//	void statusAluno() “mostra se aluno está aprovado. Se for media for maior que 7, jogar na tela, “aprovado”, senão “reprovado”” 
//	float mediaDoAluno() “calcula a media do aluno através da formula (nota1+nota2)/2 e retorna o resultado”
	
	String mostraNomeAluno() {
	      return nomeAluno;    
	}
	
	void statusAluno() {
	    if (mediaDoAluno() >= 7) {
	    	System.out.println("Aprovado");
	    } else {
	    	System.out.println("Reprovado");
	    }
	}
	
	float mediaDoAluno() {
		return (nota1+nota2)/2;
	}
	
	public static void main(String[] args) {
		
		NotaAluno aluno1 = new NotaAluno();
		aluno1.nomeAluno = "João";
		aluno1.nota1 = 5;
		aluno1.nota2 = 6;
		
		System.out.println("Nome: " + aluno1.mostraNomeAluno());
		aluno1.statusAluno();
		System.out.println("Media: " + aluno1.mediaDoAluno());
		
		NotaAluno aluno2 = new NotaAluno();
		aluno2.nomeAluno = "Aline";
		aluno2.nota1 = 6;
		aluno2.nota2 = 8;
		
		System.out.println("Nome: " + aluno2.mostraNomeAluno());
		aluno2.statusAluno();
		System.out.println("Media: " + aluno2.mediaDoAluno());
		
		NotaAluno aluno3 = new NotaAluno();
		aluno3.nomeAluno = "Flavio";
		aluno3.nota1 = 7;
		aluno3.nota2 = 9;
		
		System.out.println("Nome: " + aluno3.mostraNomeAluno());
		aluno3.statusAluno();
		System.out.println("Media: " + aluno3.mediaDoAluno());
		
	}
}
