package Atividade04_T1;


public class NotaAluno {
	
	//Atributos:
	
	String nomeAluno; 
	float nota1; 
	float nota2;
	
	//Construtores:
	  
	public NotaAluno() {}
	  
	public NotaAluno(String nAluno, float not1, float not2) {
	      this.nomeAluno = nAluno;
	      this.nota1 = not1;
	      this.nota2 = not2;
	          
	}
	
	// Métodos:
	
	//String mostraNomeAluno() “mostra o nome do aluno” 
	//void statusAluno() “mostra se aluno está aprovado. Se for media for maior que 7, jogar na tela, “aprovado”, senão “reprovado”” 
	//float mediaDoAluno() “calcula a media do aluno através da formula (nota1+nota2)/2 e retorna o resultado”
	
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
	
}