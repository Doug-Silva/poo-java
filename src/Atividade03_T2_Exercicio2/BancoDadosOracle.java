package Atividade03_T2_Exercicio2;

public class BancoDadosOracle implements Usuario {
	
	public String user1;
	

	public BancoDadosOracle(String user1) {
		super();
		this.user1 = user1;
	}

	@Override
	public void salvarUsuario(String nome) {
		user1 = nome;

	}

	@Override
	public void listarUsuario() {
		System.out.println("Usuario cadastrado: " + user1);

	}

	@Override
	public String toString() {
		return "BancoDadosOracle [user1=" + user1 + "]";
	}
	

}
