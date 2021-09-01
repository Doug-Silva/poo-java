package Atividade04_T1;

public class ComputadorComConstrutor {

public static void main(String[] args) {
		
		Computador pc1;
		pc1 = new Computador("Douglas", 1800);
		
		// Execução:
		
		System.out.println("Computador de: " + pc1.mostraNomeComputador());
		System.out.println("Clock do Computador: " + pc1.mostraClock());
	}

}