package Atividade03_T2_Exercicio2_ArrayList;

import java.util.ArrayList;

public class BancoDadosMySql implements Usuario {

	public ArrayList<String> usuarios;
	
	public BancoDadosMySql() {
		super();
		this.usuarios = new ArrayList<String>();
	}

	public BancoDadosMySql(ArrayList<String> usuarios) {
		super();
		this.usuarios = usuarios;
	}

	public BancoDadosMySql(String... nomes) {
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
		System.out.println("Usuarios cadastrados no BD MySQL: ");
		for (String n : this.usuarios) {
			System.out.println(" " + n);
		}
	}

	@Override
	public String toString() {
		return "BancoDadosMySql [usuarios=" + usuarios + "]";
	}
	
}