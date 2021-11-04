package Atividade03_T2_Exercicio1;

public class Quadrado extends FormaGeometrica {

	public Quadrado(String nome, float area) {
		super(nome, area);
	}

	@Override
	public float totalArea() {
		return area;
	}

}