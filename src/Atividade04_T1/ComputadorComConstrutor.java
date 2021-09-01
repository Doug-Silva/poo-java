package Atividade04_T1;

public class ComputadorComConstrutor {

public static void main(String[] args) {
		
		Computador pc1;
		pc1 = new Computador("Macbook", 4);
		
		// Execução:
		
		System.out.println("Nome do Computador: " + pc1.mostraNomeComputador());
		System.out.println("Clock do Computador: " + pc1.mostraClock() + "GHz");
	}

}