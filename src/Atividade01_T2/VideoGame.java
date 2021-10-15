package Atividade01_T2;

public class VideoGame extends Produtos {
	
	private int quantControles;

	public VideoGame(String nome, String marca, float preco, int quantControles) {
		super(nome, marca, preco);
		this.quantControles = quantControles;
	}

	public int getQuantControles() {
		return quantControles;
	}

	public void setQuantControles(int quantControles) {
		this.quantControles = quantControles;
	}

	@Override
	public String toString() {
		return super.toString() + 
				   "Quantidade de controles: " + quantControles;
	}
	
	
	
	

}
