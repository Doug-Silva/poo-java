package Exercicio_Aula11_Maps;

import java.util.HashMap;

public class TestMap {

	public static void main(String[] args) {

		HashMap<String, InfoAluno> alunos;
		alunos = new HashMap<String, InfoAluno>();

		InfoAluno aluno1 = new InfoAluno("Joao", 30, "6655447788");
		InfoAluno aluno2 = new InfoAluno("Maria", 35, "654878777");
		InfoAluno aluno3 = new InfoAluno("Gilmar", 25, "336955");
		InfoAluno aluno4 = new InfoAluno("Tereza", 20, "322567987");
		InfoAluno aluno5 = new InfoAluno("Cintia", 40, "13249878967");
		
		alunos.put("6655447788", aluno1);
		alunos.put(aluno2.getCpf(), aluno2);
		alunos.put(aluno3.getCpf(), aluno3);
		alunos.put(aluno4.getCpf(), aluno4);
		alunos.put(aluno5.getCpf(), aluno5);
		
		System.out.println("Buscando aluno pelo CPF 654878777");
		System.out.println(alunos.get("654878777"));
				
	}

}