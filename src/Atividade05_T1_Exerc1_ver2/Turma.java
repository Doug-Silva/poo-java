package Atividade05_T1_Exerc1_ver2;

public class Turma {

	//Atributos

	private String nomeTurma;
	private Aluno aluno1;
	private Aluno aluno2;

	//Construtores

	public Turma(String nameturm, Aluno alun1, Aluno alun2) {
		this.nomeTurma = nameturm;
		this.aluno1 = alun1;
		this.aluno2 = alun2;
		      
	}
	
	//Getters and Setters

	public String getNomeTurma() {
		return nomeTurma;
	}
	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	public Aluno getAluno1() {
		return aluno1;
	}
	public void setAluno1(Aluno aluno1) {
		this.aluno1 = aluno1;
	}
	public Aluno getAluno2() {
		return aluno2;
	}
	public void setAluno2(Aluno aluno2) {
		this.aluno2 = aluno2;
	}

}