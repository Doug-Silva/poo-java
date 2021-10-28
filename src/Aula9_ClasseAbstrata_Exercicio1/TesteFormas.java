package Aula9_ClasseAbstrata_Exercicio1;

public class TesteFormas {

	public static void main(String[] args) {

		Triangulo forma1 = new Triangulo("Triangulo", 5);
		Quadrado  forma2 = new Quadrado("Quadrado", 10);
		Retangulo forma3 = new Retangulo("Retangulo", 15);
		
		System.out.println(forma1.getNome() + ", area: " + forma1.totalArea());
		System.out.println(forma2.getNome() + ", area: " + forma2.totalArea());
		System.out.println(forma3.getNome() + ", area: " + forma3.totalArea());

	}

}