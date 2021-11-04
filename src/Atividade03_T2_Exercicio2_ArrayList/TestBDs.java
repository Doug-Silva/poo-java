package Atividade03_T2_Exercicio2_ArrayList;

public class TestBDs {

	public static void main(String[] args) {

		BancoDadosMySql  bd1;
		BancoDadosOracle bd2;
		
		bd1 = new BancoDadosMySql("Joao");		
		bd2 = new BancoDadosOracle("Maria");
//		System.out.println(bd1);
//		System.out.println(bd2);
		bd1.listarUsuario();
		bd2.listarUsuario();
		
		bd1 = new BancoDadosMySql("Joao", "Maria", "Pedro");		
		bd2 = new BancoDadosOracle("Maria", "Pedro", "Joao");
//		System.out.println(bd1);
//		System.out.println(bd2);
		bd1.listarUsuario();
		bd2.listarUsuario();

		bd1 = new BancoDadosMySql();		
		bd1.salvarUsuario("Maria");
		bd1.salvarUsuario("Joao");
		bd1.salvarUsuario("Pedro");
		bd1.listarUsuario();
		
		bd2 = new BancoDadosOracle();		
		bd2.salvarUsuario("Maria");
		bd2.salvarUsuario("Joao");
		bd2.salvarUsuario("Pedro");
		bd2.listarUsuario();
		

	}

}