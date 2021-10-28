package Atividade02_T2;

public class Modem {
	
	private String nome, modelo;
	private int velocidadeUP, quantPortas;
	
	public Modem(String nome, String modelo, int velocidadeUP, int quantPortas) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.velocidadeUP = velocidadeUP;
		this.quantPortas = quantPortas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeUP() {
		return velocidadeUP;
	}

	public void setVelocidadeUP(int velocidadeUP) {
		this.velocidadeUP = velocidadeUP;
	}

	public int getQuantPortas() {
		return quantPortas;
	}

	public void setQuantPortas(int quantPortas) {
		this.quantPortas = quantPortas;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n" +
			   "Modelo: " + modelo + "\n" +
			   "Velocidade UP/Down: " + velocidadeUP + "\n" +
			   "Quant.Portas Ethernet: " + getQuantPortas();
		
	}
	
	
	
	

}
