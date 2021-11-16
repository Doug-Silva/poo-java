package Atividade05_T2_Exercicio2;

import java.util.ArrayList;

public class TestProfessor {
	
	public static void main(String[] args) {
		
		ArrayList<Professor> lista;
		lista = new ArrayList<Professor>();		
		
		lista.add(new Professor("Aline", "Feminino",20));
		lista.add(new Professor("João", "Masculino",19));
		lista.add(new Professor("Laura", "Feminino",48));
		lista.add(new Professor("Camila", "Feminino",50));
		lista.add(new Professor("Marcelo", "Masculino",55));
		
		System.out.println("Total de Professores na lista: " + lista.size() + "\n");
		
		System.out.println("Professores com idade acima de 35:");
		Professor p1 = lista.get(2);
		Professor p2 = lista.get(3);
		Professor p3 = lista.get(4);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println();
		
		System.out.println("Removendo..... professores com sexo masculino" + "\n");
		lista.remove(1);
		lista.remove(3);
		System.out.println("professores na lista após remocao: " + lista.size() + "\n");
		System.out.println("professores que restaram na lista:");
		System.out.println(lista);
	}
	
}