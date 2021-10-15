package Atividade01_T2;

public class Tv extends Produtos {
	
	private int tamanho;
	private String tipoTela;
	
	public Tv(String nome, String marca, float preco, int tamanho, String tipoTela) {
		super(nome, marca, preco);
		this.tamanho = tamanho;
		this.tipoTela = tipoTela;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getTipoTela() {
		return tipoTela;
	}

	public void setTipoTela(String tipoTela) {
		this.tipoTela = tipoTela;
	}

	@Override
	public String toString() {
		return super.toString() + 
			   "Tamanho da tela: " + tamanho + "'" +"\n" +
	           "Tipo de tela (LCD ou Plasma): " + tipoTela + "\n";
				
	}	
	
}
