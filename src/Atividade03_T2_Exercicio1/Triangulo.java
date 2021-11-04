package Atividade03_T2_Exercicio1;

public class Triangulo extends FormaGeometrica {
	
	public Triangulo(String nome, float area) {
		super(nome, area);
	}

	@Override
	public float totalArea() {
		return area;
	}

}