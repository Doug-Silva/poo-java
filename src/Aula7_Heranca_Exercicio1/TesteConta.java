package Aula7_Heranca_Exercicio1;

public class TesteConta {

public static void main(String[] args) {
		
		ContaBasica conta1;
		ContaComLimite conta2;
		ContaCompleta conta3;
		
		conta1 = new ContaBasica(5454, 445);
		conta2 = new ContaComLimite(4477, 122);
		conta3 = new ContaCompleta(7788, 996, "4444-6666-9999-7777");
		
		System.out.println("Conta 1 (basica): \n " + conta1);
		System.out.println("Conta 2 (limite): \n " + conta2);
		System.out.println("Conta 3 (completa): \n " + conta3);

	}

}