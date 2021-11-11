package Atividade04_T2_Padaria;

public abstract class Produto {
	
	protected String nome;
	protected float  preco;
	protected String marca;
	
	public abstract String descricao();

	public float getPreco() {
		return preco;
	}

	public Produto(String nome, float preco, String marca) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return descricao();
	}
	
}