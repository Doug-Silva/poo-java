package Aula9_ClasseAbstrata;

public class TesteConta {

		public static void mostrarSaldo(ContaBancaria cc) {
			// System.out.println("Valor disponível para saque: R$" + cc.getSaldo());
			System.out.println(cc.imprimirSaldo());
		}

		public static void main(String[] args) {
			
			ContaBasica conta1;
			ContaComLimite conta2;
			ContaCompleta conta3;
			ContaBancaria contaX;
			
			conta1 = new ContaBasica(5454, 445);
			conta2 = new ContaComLimite(4477, 122);
			conta3 = new ContaCompleta(7788, 996, "4444-6666-9999-7777");
			
			// Comportamento não permitido para uma Classe Abstrata
			// contaX = new ContaBancaria(6677, 441, 0, 0); 
			
		
			conta1.depositar(100);
			conta2.depositar(110);
			conta3.depositar(120);
			
//			conta1.mostrarSaldo();
//			conta2.mostrarSaldo();
//			conta3.mostrarSaldo();
			
			mostrarSaldo(conta1);
			System.out.println();
			mostrarSaldo(conta2);
			System.out.println();
			mostrarSaldo(conta3);

		}

}
