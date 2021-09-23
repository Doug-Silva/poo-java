package Atividade06_T1_ArrayList_Versao2;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
		dependentes.add(new Dependente("Joao", "1111111", "pai"));
		dependentes.add(new Dependente("Maria", "2222222", "mae"));
		dependentes.add(new Dependente("Cesar", "3333333", "filho"));
		dependentes.add(new Dependente("Douglas", "4444444", "filho"));
		
		Endereco endereco = new Endereco("Av Borges de Medeiros", 1001, 
				"Apto 33", "90003-122", "RS", "Brasil");
		
		Endereco endereco2 = new Endereco("Av Borges de Medeiros", 1001, 
				"90003-122", "RS", "Brasil");
		
		Banco contaBanco = new Banco("Banco do Brasil", 0001, 112233, 
				"333.111.222-44", "51 993442211");
		
		Banco contaBanco2 = new Banco("Banco do Brasil", 0001, 112233, 
				"333.111.222-44");

		Funcionario funcionario1 = new Funcionario(endereco, contaBanco,
				 dependentes, 400, "Contabilidade", "Joao da Silva", "01/01/1990");
		
//		Funcionario funcionario1 = new Funcionario(endereco, contaBanco, 
//				 400, "Contabilidade", "Joao da Silva", "01/01/1990");
//		funcionario1.getDependentes().add(
//				new Dependente("Joao", "1111111", "pai"));
//		funcionario1.getDependentes().add(
//				new Dependente("Maria", "2222222", "mae"));
//		funcionario1.getDependentes().add(
//				new Dependente("Cesar", "3333333", "filho"));
//		funcionario1.getDependentes().add(
//				new Dependente("Douglas", "4444444", "filho"));		
		
		System.out.println(funcionario1);		
		System.out.println("Funcionario possui filhos? " + 
				(funcionario1.possuiFilhos() ? "sim":"nao"));		
		System.out.println("Funcionario possui um salário " +
				funcionario1.statusSalario());

		

	}

}