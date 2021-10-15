package Atividade01_T2_Versao2;

public class Ingressos {
	
	private float valor;
	private String descricao;
	
	public Ingressos(float valor, String descricao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Valor: R$" + valor + "\n" +
			   "Descrição: " + descricao;		   
	}
	
}
