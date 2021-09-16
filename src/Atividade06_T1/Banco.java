package Atividade06_T1;

public class Banco {

	private String banco;
	private int agencia;
	private int conta;
	private String CPF;
	private String chavePIX;
		
	public Banco(String banco, int agencia, int conta, String cPF, String chavePIX) {
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		CPF = cPF;
		this.chavePIX = chavePIX;
	}
	
	public Banco(String banco, int agencia, int conta, String cPF) {
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		CPF = cPF;		
	}

	@Override
	public String toString() {
		if (chavePIX != null) {
			return "Banco: " + banco + ", Ag:" + agencia + ", CC:" + conta + 
				"\nCPF: " + CPF + ", PIX: " + chavePIX;
		}
			return "Banco: " + banco + ", Ag:" + agencia + ", CC:" + conta + 
				"\nCPF: " + CPF + ", PIX: não cadastrada";
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getChavePIX() {
		return chavePIX;
	}

	public void setChavePIX(String chavePIX) {
		this.chavePIX = chavePIX;
	}
	
}