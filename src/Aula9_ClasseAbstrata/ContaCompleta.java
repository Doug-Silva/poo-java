package Aula9_ClasseAbstrata;

public class ContaCompleta extends ContaBancaria {
	
	private float juros;
	private String cartaoCredito; 
	
	public ContaCompleta(int num, int ag, String cartao) {
		super(num, ag, 0, 2000);
		juros = 0.01f; //1% a.m.
		cartaoCredito = cartao;
	}

	public String imprimirSaldo() {
		return "Valor disponível para saque: R$" + (saldo + limite) + 
				".\nEm caso de saque maior que R$" + saldo + " voce \n" +
				"tem 10 dias sem juros. \n" + 
				"Após juros de " + (juros*100) + "% a.m.";		
	}

	// Acesso aos atributos da superclasse via o toString da mesma.
	@Override
	public String toString() {
		return "Juros=" + juros*100 + "% a.m.\n " + 
				"CartaoCredito=" + cartaoCredito + "\n " +
				super.toString();
	}

}
