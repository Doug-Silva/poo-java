package Atividade02_T2;

public class Modem_XYZ extends Modem {
	
	public Modem_XYZ(String nome, String modelo, int velocidadeUP, int quantPortas) {
		super(nome, modelo, velocidadeUP, quantPortas);
		
	}
	
	public String altaOuBaixaVelocidade() {
		if (getVelocidadeUP() > 1000) {
			return "alta velocidade";			
		} else {
			return "baixa velocidade";
		}
	}
	
	public int getQuantPortas() {
		return 4;
	}
	
}
