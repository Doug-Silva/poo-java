package Atividade05_T1_Exerc1_ver2;

public class Aluno {

	//Atributos

	private String nome;
	private int nota;

	//Construtores

	public Aluno(String name, int notaAluno) {
		this.nome = name;
		this.nota = notaAluno;

	}
	
	//Getters and Setters

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}

}