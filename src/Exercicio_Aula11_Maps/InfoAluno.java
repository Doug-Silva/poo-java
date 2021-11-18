package Exercicio_Aula11_Maps;

public class InfoAluno {
	
	private String nome;
	private int idade;
	private String cpf;
	
	public InfoAluno(String nome, int idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "InfoAluno [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + "]";
	}
	
}
