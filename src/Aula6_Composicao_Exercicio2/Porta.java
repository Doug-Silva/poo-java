package Aula6_Composicao_Exercicio2;

public class Porta {

    //Atributos
	
	private String cor;
	private int tamanho;
	
	//Construtor
	
	public Porta(String cor, int tamanho) {
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	//Getters and Setters
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}