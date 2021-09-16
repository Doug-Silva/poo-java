package Atividade06_T1;

public class Familia {
	private String pai, mae;
	private String filho1, filho2, filho3;	 
	
	public Familia(String pai, String mae, String filho1, String filho2, String filho3) {
		this.pai = pai;
		this.mae = mae;
		this.filho1 = filho1;
		this.filho2 = filho2;
		this.filho3 = filho3;
	}

	public Familia(String pai, String mae, String filho1, String filho2) {
		this.pai = pai;
		this.mae = mae;
		this.filho1 = filho1;
		this.filho2 = filho2;
		this.filho3 = new String();
	}

	public Familia(String pai, String mae, String filho1) {
		this.pai = pai;
		this.mae = mae;
		this.filho1 = filho1;
		this.filho2 = new String();
		this.filho3 = new String();
	}

	public Familia(String pai, String mae) {
		this.pai = pai;
		this.mae = mae;
		this.filho1 = new String();
		this.filho2 = new String();
		this.filho3 = new String();
	}

	public int numeroDeFilhos() {
		int nroFilhos = 0;
		if (!filho1.isEmpty()) {
			nroFilhos++;
		}
		if (!filho2.isEmpty()) {
			nroFilhos++;
		}
		if (!filho3.isEmpty()) {
			nroFilhos++;
		}
		return nroFilhos;		
	}

	@Override
	public String toString() {
		return "Nome do pai: " + pai + 
			   "\nNome da mae: " + mae + 
			   "\nNome do filho 1: " + filho1 + 
			   "\nNome do filho 2: " + filho2 + 
			   "\nNome do filho 3: " + filho3;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getFilho1() {
		return filho1;
	}

	public void setFilho1(String filho1) {
		this.filho1 = filho1;
	}

	public String getFilho2() {
		return filho2;
	}

	public void setFilho2(String filho2) {
		this.filho2 = filho2;
	}

	public String getFilho3() {
		return filho3;
	}

	public void setFilho3(String filho3) {
		this.filho3 = filho3;
	}
	
	
}