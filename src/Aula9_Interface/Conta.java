package Aula9_Interface;

public interface Conta {

	public void MostrarSaldo();
	public String ImprimirSaldo();
	
	// Permite o saque verificando o limite da conta
	public boolean Sacar(float valor);
	
	public void Depositar(float valor);
	
	public boolean Transferir(float valor);
	
	public boolean Pagar(float valor);

}