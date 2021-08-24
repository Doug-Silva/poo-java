package Atividade03_T1_Versao2;

public class Computador {
	
//  Atributos:
	
	String nome;
	int clock;
	
//  Métodos:
	
//  + String mostraNomeComputador() mostra o nome do computador
//  + int mostraClock() mostra o clock do computador
	
	public String mostraNomeComputador() {
		return nome;
	}
	
	public int mostraClock() {
		return clock;
	}

	public static void main(String[] args) {
		
		Computador pc1 = new Computador();
		pc1.nome = "Pedro";
		pc1.clock = 1200;
				
		System.out.println("Computador de: " + pc1.mostraNomeComputador());
		System.out.println("Clock do Computador: " + pc1.mostraClock());
	}

}
