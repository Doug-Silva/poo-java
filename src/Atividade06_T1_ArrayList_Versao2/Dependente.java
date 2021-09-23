package Atividade06_T1_ArrayList_Versao2;

public class Dependente {
	
	private String nome;
	private String CPF;
	private String tipoDeRelacao; // pai, mae, filho, outra coisa
	
	public Dependente(String nome, String cPF, String tipoDeRelacao) {
		this.nome = nome;
		CPF = cPF;
		this.tipoDeRelacao = tipoDeRelacao;
	}

	@Override
	public String toString() {
		return "Dependente [nome=" + nome + ", CPF=" + CPF + ", tipoDeRelacao=" + tipoDeRelacao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getTipoDeRelacao() {
		return tipoDeRelacao;
	}

	public void setTipoDeRelacao(String tipoDeRelacao) {
		this.tipoDeRelacao = tipoDeRelacao;
	}
	
}