package Aula6_Composicao_Exercicio1;

public class TesteClienteMain {

	public static void main(String[] args) {
		
		// Cliente cliente1 = new Cliente("Joao da Silva");
		// Cliente cliente1 = new Cliente("Joao da Silva", 123, 44335566);
		Cliente cliente1 = new Cliente("Joao da Silva", 123, 44335566,
				                       "Rua da Saudade", 2356);
		
		System.out.println("Nome do cliente: " + cliente1.getNome() + "\n");

		cliente1.getConta().depositar(100);
		cliente1.imprimirExtratoCompleto();
//		cliente1.getConta().imprimirExtrato();
		
		boolean resultado;
   		resultado = cliente1.getConta().sacar(400);
   		cliente1.getConta().verificaOperacao(resultado);
   		cliente1.imprimirExtrato();
//   	cliente1.getConta().imprimirExtrato();
   		
   		resultado = cliente1.getConta().transferir(100);
   		cliente1.getConta().verificaOperacao(resultado);
   		cliente1.imprimirExtrato();
   		// cliente1.getConta().imprimirExtrato();		
   		
   		resultado = cliente1.getConta().pagar(100);
   		cliente1.getConta().verificaOperacao(resultado);
   		cliente1.imprimirExtrato();
   		// cliente1.getConta().imprimirExtrato();
   				
   		resultado = cliente1.getConta().sacar(100);
   		cliente1.getConta().verificaOperacao(resultado);
   		cliente1.imprimirExtrato();
   		// cliente1.getConta().imprimirExtrato();

	}

}