package Aula7_Comp_Exercicio1;

public class Casa {
	
	//Atributos
	
	private float tamanhoEmMetros;
	private Porta porta1;
	private Porta porta2;
	private Janela janela1;
	private Janela janela2;
	
	//Construtor
	
	public Casa(float tamanhoEmMetros, Porta porta1, Porta porta2, Janela janela1, Janela janela2) {
		this.tamanhoEmMetros = tamanhoEmMetros;
		this.porta1 = porta1;
		this.porta2 = porta2;
		this.janela1 = janela1;
		this.janela2 = janela2;
	}
	
	//Getters and Setters
	
	public float getTamanhoEmMetros() {
		return tamanhoEmMetros;
	}
	
	public void setTamanhoEmMetros(float tamanhoEmMetros) {
		this.tamanhoEmMetros = tamanhoEmMetros;
	}
	public Porta getPorta1() {
		return porta1;
	}
	public void setPorta1(Porta porta1) {
		this.porta1 = porta1;
	}
	public Porta getPorta2() {
		return porta2;
	}
	public void setPorta2(Porta porta2) {
		this.porta2 = porta2;
	}
	public Janela getJanela1() {
		return janela1;
	}
	public void setJanela1(Janela janela1) {
		this.janela1 = janela1;
	}
	public Janela getJanela2() {
		return janela2;
	}
	public void setJanela2(Janela janela2) {
		this.janela2 = janela2;
	}

}