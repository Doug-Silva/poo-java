package Atividade05_T2_Exercicio2;

public class Professor {
	
    private String nome;
    private int idade;
    private String sexo;
    
	public Professor(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	} 
	
}