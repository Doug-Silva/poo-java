package Atividade01_T1;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor 1:");
		int valor1 = entrada.nextInt();
		System.out.print("Digite o valor 2:");
		int valor2 = entrada.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("Maior valor encontrado: " + valor1);
		} else if (valor2 > valor1) {
			System.out.println("Maior valor encontrado: " + valor2);
		} else {
			System.out.println("Ambos valores são iguais");
			
		}
	}
}