package Atividade05_T2_Exercicio2;

public class Professor {
	
	private String nome, sexo;
    private int idade;
    
	public Professor(String nome, String sexo, int idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "]";
	}
	 
}
