package Atividade01_T1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		float mediaAprovacao = 7;
		float mediaRecuperacao = 5;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota 1: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Digite a nota 2: ");
		float nota2 = entrada.nextFloat();
		System.out.print("Digite a nota 3: ");
		float nota3 = entrada.nextFloat();
		
		float media = (nota1 + nota2 + nota3)/3;
		String statusAluno;
		
		if (media >= mediaAprovacao) {
			statusAluno = "foi aprovado.";			
		} else if (media >= mediaRecuperacao) {
			statusAluno = "está em recuperação.";
		} else {
			statusAluno = "foi reprovado.";	
		}
		
		System.out.println("O estudante " + statusAluno);
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println("Media obtida: " + df.format(media));
		
	}
}