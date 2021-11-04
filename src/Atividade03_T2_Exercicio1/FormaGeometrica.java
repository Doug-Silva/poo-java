package Atividade03_T2_Exercicio1;

public abstract class FormaGeometrica {
	
	protected String nome;
	protected float area;
		
	public String getNome() {
		return nome;
	}

	public abstract float totalArea();

	public FormaGeometrica(String nome, float area) {
		super();
		this.nome = nome;
		this.area = area;
	}

	@Override
	public String toString() {
		return "FormaGeometrica [nome=" + nome + ", area=" + area + "]";
	}
	
}
