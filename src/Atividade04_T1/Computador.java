package Atividade04_T1;

public class Computador {
	
	//Atributos:
	
	String nome;
	int clock;
	
	//Construtores:
	
	public Computador(String name, int clocktime) {
	      this.nome = name;
	      this.clock = clocktime;
	             
	}
	
	//Métodos:
	
	//+ String mostraNomeComputador() mostra o nome do computador
	//+ int mostraClock() mostra o clock do computador
	
	public String mostraNomeComputador() {
		return nome;
	}
	
	public int mostraClock() {
		return clock;
	}
}
	
