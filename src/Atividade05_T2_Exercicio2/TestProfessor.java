package Atividade05_T2_Exercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class TestProfessor {
	
	public static void main(String[] args) {
		
		ArrayList<Professor> docentes = new ArrayList<Professor>();
		
		docentes.add(new Professor("Gustavo", 30,  "M"));
		docentes.add(new Professor("Jair", 35,  "M"));
		docentes.add(new Professor("Maria", 36,  "F"));
		docentes.add(new Professor("Estela", 50,  "F"));
		docentes.add(new Professor("Joao", 29,  "M"));		
		
		System.out.println("Professores acima de 35 anos: ");
		
		for (Professor professor : docentes) {			
			if (professor.getIdade() >= 35) {
				System.out.println(professor);
			}
		}
		
		Iterator<Professor> it = docentes.iterator();
		Professor p;
		while (it.hasNext()) {
			p = it.next();
			if (p.getSexo().equals("M")) {
				it.remove();
			}
		}
		
		System.out.println();
		System.out.println("Remocao de professores do sexo masculino: ");
		
		for (Professor professor : docentes) {
			System.out.println(professor);
		}
	
	}
	
}