package Atividade03_T2_Exercicio2;

public class TestBDs{

	public static void main(String[] args) {
		
		BancoDadosMySql bd1 = new BancoDadosMySql("João");
		BancoDadosOracle bd2 = new BancoDadosOracle("Aline");
		
		System.out.println("Usuario cadastrado: " + bd1);
		System.out.println("Usuario cadastrado: " + bd2);

	}

}
