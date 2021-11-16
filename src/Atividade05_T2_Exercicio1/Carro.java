package Atividade05_T2_Exercicio1;

public class Carro {
	
	private String nome, cor;
    private float peso;
    
	public Carro(String nome, String cor, float peso) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", cor=" + cor + ", peso=" + peso + "]";
	}
	 
}
