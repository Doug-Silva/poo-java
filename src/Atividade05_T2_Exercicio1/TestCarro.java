package Atividade05_T2_Exercicio1;

import java.util.ArrayList;

public class TestCarro {
	
	public static void main(String[] args) {
		
		ArrayList<Carro> lista;
		lista = new ArrayList<Carro>();		
	
		lista.add(new Carro("Celta", "Vermelho", 890f));
		lista.add(new Carro("Gol", "Branco", 976f));
		
		System.out.println(lista);
		System.out.println("Itens na lista: " + lista.size());
		
	}
	
}