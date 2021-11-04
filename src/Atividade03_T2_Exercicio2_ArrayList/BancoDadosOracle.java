package Atividade03_T2_Exercicio2_ArrayList;

import java.util.ArrayList;

public class BancoDadosOracle implements Usuario {
	
	public ArrayList<String> usuarios;
	
	public BancoDadosOracle(ArrayList<String> usuarios) {
		super();
		this.usuarios = usuarios;
	}

	public BancoDadosOracle() {
		super();
		this.usuarios = new ArrayList<String>();
	}

	public BancoDadosOracle(String... nomes) {
		super();
		this.usuarios = new ArrayList<String>();
		for (String n : nomes) {
			this.usuarios.add(n);
		}
	}

	public void salvarUsuario(String nome) {
		this.usuarios.add(nome);
	}
	
	public void listarUsuario() {
		System.out.println("Usuarios cadastrados no BD Oracle: ");
		for (String n : this.usuarios) {
			System.out.println(" " + n);
		}
	}

	@Override
	public String toString() {
		return "BancoDadosOracle [usuarios=" + usuarios + "]";
	}

}