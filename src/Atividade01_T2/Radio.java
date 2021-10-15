package Atividade01_T2;

public class Radio extends Produtos {
	
	private int potencia;

	public Radio(String nome, String marca, float preco, int potencia) {
		super(nome, marca, preco);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return super.toString() + 
				   "Potência: " + potencia + " Watts RMS" +"\n";
		           			
	}
	
}
