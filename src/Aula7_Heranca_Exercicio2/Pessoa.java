package Aula7_Heranca_Exercicio2;

public class Pessoa {
	
	private String nome, endereco;
	private int telefone;
	
	public Pessoa(String nome, String endereco, int telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\n " +
			   "Endereco: " + endereco + "\n " + 
			   "Telefone: " + telefone;
	}
	
	
}
