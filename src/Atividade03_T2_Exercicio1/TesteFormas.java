package Atividade03_T2_Exercicio1;

public class TesteFormas {
	
	public static void showTotalArea(FormaGeometrica forma) {
		
		System.out.println("Total Area " + forma.totalArea());		
	}

	public static void main(String[] args) {

		Triangulo forma1 = new Triangulo("Triangulo", 5);
		Quadrado  forma2 = new Quadrado("Quadrado", 10);
		Retangulo forma3 = new Retangulo("Retangulo", 15);
		
		showTotalArea(forma1);
		System.out.println();
		showTotalArea(forma2);
		System.out.println();
		showTotalArea(forma3);

	}

}