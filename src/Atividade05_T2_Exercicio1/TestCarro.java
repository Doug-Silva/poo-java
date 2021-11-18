package Atividade05_T2_Exercicio1;

import java.util.ArrayList;

public class TestCarro {
	
	public static void main(String[] args) {
		
		ArrayList<Carro> carros = new ArrayList<Carro>();
		
		carros.add(new Carro("Uno", "Branco", 1000));
		carros.add(new Carro("Gol", "Vermelho", 1200));
		
		for (Carro carro : carros) {
			System.out.println(carro);
		}
		
	}
	
}