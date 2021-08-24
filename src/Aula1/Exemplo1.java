package Aula1;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		System.out.println("Olá Mundo");
		System.out.printf("%s, %s\n", "Rua ABCD", "111");
		System.out.print("...");
		System.out.print("...");
		
		System.out.println();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva seu nome:");
		String nome = entrada.next();
		System.out.print("Escreva sua idade:");
		int idade = entrada.nextInt();
		
		System.out.println("Nome: " + nome);
		System.out.print("Idade: " + idade);

	}

}
