package Atividade06_T1_ArrayList;

import java.util.ArrayList;

public class FamiliaLista {
	private String pai, mae;	
	private ArrayList<String> filhos = new ArrayList<String>(); 
	
	// Método genérico que permite receber N parâmetros de filhos
	public FamiliaLista(String pai, String mae, String... filhosRecebidos) {
		this.pai = pai;
		this.mae = mae;
		
		for (String filho : filhosRecebidos) {
			this.filhos.add(filho);
		}
	}
	
	public int numeroDeFilhos() {
		return filhos.size();		
	}

	@Override
	public String toString() {
		return "Nome do pai: " + pai + 
			   "\nNome da mae: " + mae + 
			   "\nFilhos: " + filhos;
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
	
}