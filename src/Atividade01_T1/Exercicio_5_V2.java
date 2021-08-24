package Atividade01_T1;

import java.util.Scanner;

public class Exercicio_5_V2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota 1: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Digite a nota 2: ");
		float nota2 = entrada.nextFloat();
		System.out.print("Digite a nota 3: ");
		float nota3 = entrada.nextFloat();
		
		String statusAluno = calculoMedia(nota1, nota2, nota3);
		System.out.println("O estudante " + statusAluno);
		
	}
		
	public static String calculoMedia (float n1, float n2, float n3) {
		float mediaAprovacao = 7;
		float mediaRecuperacao = 5;
		
		float media = (n1 + n2 + n3)/3;
		String statusAluno;
		
		if (media >= mediaAprovacao) {
			statusAluno = "foi aprovado.";			
		} else if (media >= mediaRecuperacao) {
			statusAluno = "está em recuperação.";
		} else {
			statusAluno = "foi reprovado.";	
		}
		
		return statusAluno;
		
	}
}