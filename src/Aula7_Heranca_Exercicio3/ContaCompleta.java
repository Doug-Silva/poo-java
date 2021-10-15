package Aula7_Heranca_Exercicio3;

public class ContaCompleta extends ContaComJuros {

	private String cartaoCredito; 
	
	public ContaCompleta(int num, int ag, String cartao) {
		super(num, ag, 2000, 0.01f);
		cartaoCredito = cartao;
	}

	// Acesso aos atributos da superclasse via o toString da mesma.
	@Override
	public String toString() {
		return "CartaoCredito=" + cartaoCredito + "\n " +
		super.toString();
	}
	
}
