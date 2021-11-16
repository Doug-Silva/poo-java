package Exercicio_Aula10_TiposArrayList;

public class Cpu {
	
	private int clock;                                   
	private String modelo;
	
	public Cpu(int clock, String modelo) {
		super();
		this.clock = clock;
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Cpu [clock=" + clock + ", modelo=" + modelo + "]";
	}
	
	
}