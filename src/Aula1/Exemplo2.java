package Aula1;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite medida do lado A:");
		float ladoA = entrada.nextFloat();
		System.out.print("Digite medida do lado B:");
		float ladoB = entrada.nextFloat();
		
		float result = ladoA * ladoB;
		System.out.println("area do quadrado =" + result + "m2");
		
	}

}
