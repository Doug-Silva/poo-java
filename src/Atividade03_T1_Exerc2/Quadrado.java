package Atividade03_T1_Exerc2;

public class Quadrado {
	
//  Atributos:
	
	float lado;
	
//  Métodos:
	
//  + float calcular(float valor) "recebe um valor e realiza o cálculo baseado na fórmula (lado*lado), e retorna o resultado."
	
	public float calcular(float valor) {
		
		lado = (valor);
		lado = (lado*lado);
		return lado;
	}
	
	public static void main(String[] args) {
		
		Quadrado MeuQuadrado = new Quadrado();
		
		System.out.println("Resultado: " + MeuQuadrado.calcular(20.5f));
		
	}
	
}
