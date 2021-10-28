package Atividade02_T2;

public class Modem_ABC extends Modem {
	
	private String tipoCabo;

	public Modem_ABC(String nome, String modelo, int velocidadeUP, int quantPortas, String tipoCabo) {
		super(nome, modelo, velocidadeUP, quantPortas);
		this.tipoCabo = tipoCabo;
	}

	public String caboGrossoOuFino () {
		if (tipoCabo.toLowerCase().equals("10base2")) {
			return "fino";
			
		} else if (tipoCabo.toLowerCase().equals("10base5")) {
			return "grosso";
			
		} else {
			return "Indefinido";
		}		
	}
	
	public int getQuantPortas() {
		return 2;
	}
	
}
