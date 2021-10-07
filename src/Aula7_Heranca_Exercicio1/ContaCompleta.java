package Aula7_Heranca_Exercicio1;

public class ContaCompleta extends ContaBancaria {
	
	private float juros;
	private String cartaoCredito; 
	
	public ContaCompleta(int num, int ag, String cartao) {
		super(num, ag, 0, 2000);
		juros = 0.01f; //1% a.m.
		cartaoCredito = cartao;
	}

	// Acesso aos atributos da superclasse via o toString da mesma.
	@Override
	public String toString() {
		return "Juros=" + juros*100 + "% a.m.\n " + 
				"CartaoCredito=" + cartaoCredito + "\n " +
				super.toString();
	}
		
//	// Acesso aos atributos da superclasse via os métodos get().
//	@Override
//	public String toString() {
//		return "Juros=" + juros + "% a.m.\n" + 
//				" CartaoCredito=" + cartaoCredito + "\n " +
//				" Agencia: " + getAgencia() + "\n " +
//				" Numero da Conta: " + getNumero() + "\n " +
//				" Saldo: " + getSaldo() + "\n " +
//				" Limite: " + getLimite() + "\n ";
//	}
//
//	// Acesso direto ao atributos da superclasse. Necessita deles como protected.
//	@Override
//	public String toString() {
//		return "Juros=" + juros + "% a.m.\n" + 
//				" CartaoCredito=" + cartaoCredito + "\n " +
//				" Agencia: " + agencia + "\n " +
//				" Numero da Conta: " + numero + "\n " +
//				" Saldo: " + saldo + "\n " +
//				" Limite: " + limite + "\n ";
//	}	
	
}