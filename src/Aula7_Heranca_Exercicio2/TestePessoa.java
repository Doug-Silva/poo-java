package Aula7_Heranca_Exercicio2;

public class TestePessoa {

	public static void main(String[] args) {
		
		PessoaFisica pf;
		pf = new PessoaFisica("Joao" , "Rua Abc 88", 44556688, 
							  "111.111.666-55", "111111111");
		
		PessoaJuridica pj;
		pj = new PessoaJuridica("Maria", "Rua Xyz 77", 55447788, 
								"114455666/0001-22", "557788899");
		
		System.out.println(pf);
		System.out.println();
		System.out.println(pj);

	}

}
