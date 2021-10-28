package Aula9_Interface;

public class ContaComLimite extends ContaBancaria {
	
	private float juros;
	
	public ContaComLimite(int num, int ag) {
		super(num, ag, 0, 1000);
		juros = 0.02f; //2% a.m.		
	}
	
	public String ImprimirSaldo() {
		return "Valor disponível para saque: R$" + (saldo + limite) + 
				".\nEm caso de saque maior que R$" + saldo + " incidem \n" +
				"juros de " + (juros*100) + "% a.m.";		
	}
	
	// Acesso aos atributos da superclasse via o toString da mesma.
	@Override
	public String toString() {
		return "Juros=" + juros*100 + "% a.m.\n " + 
				super.toString();
	}
	
}
