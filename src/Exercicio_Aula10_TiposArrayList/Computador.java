package Exercicio_Aula10_TiposArrayList;

public class Computador {

    private String marca;
    private int totalMemoria;
    private Cpu cpu;
    
	public Computador(String marca, int totalMemoria, Cpu cpu) {
		super();
		this.marca = marca;
		this.totalMemoria = totalMemoria;
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Computador [marca=" + marca + ", totalMemoria=" + totalMemoria + ", cpu=" + cpu + "]";
	}
    
}