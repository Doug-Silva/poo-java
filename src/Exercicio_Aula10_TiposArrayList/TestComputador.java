package Exercicio_Aula10_TiposArrayList;

import java.util.ArrayList;

public class TestComputador {
	
	public static void main(String[] args) {
		
		ArrayList<Computador> lista;
		lista = new ArrayList<Computador>();		
		
//		Computador c1 = new Computador("HPE", 16, new Cpu(2, "Intel"));
		lista.add(new Computador("HPE", 16, new Cpu(2, "Intel")));
		lista.add(new Computador("Dell", 8, new Cpu(3, "AMD")));
		lista.add(new Computador("HP", 4, new Cpu(1, "Intel")));
		
		System.out.println(lista);
		Computador c1 = lista.get(1);
		System.out.println(c1);
		System.out.println();
		System.out.println("Itens na lista: " + lista.size());
		
		lista.remove(0);
		System.out.println("Itens na lista após remocao: " + lista.size());		
		System.out.println(lista);
	}
	
}