package Atividade01_T1;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		       
			// Impress�o ocorre em 5 colunas
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
}