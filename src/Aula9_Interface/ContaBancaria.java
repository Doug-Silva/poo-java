package Aula9_Interface;

public abstract class ContaBancaria implements Conta {

    // Atributos
	protected float saldo, limite;
	protected int numero, agencia;	
	
	public ContaBancaria(int num, int ag, float saldo, float lim) {
		this.numero = num;
		this.agencia = ag;
		this.saldo = saldo;
		this.limite = lim;		
	}
	
	//	Metodos
	public void MostrarSaldo() {
		System.out.println("Valor disponível para saque: R$" + saldo);
	}
	
	public String ImprimirSaldo() {
		return "Valor disponível para saque: R$" + saldo;		
	}
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float valor) {
		if (valor >= -limite) {
			saldo = valor;
		}
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public boolean Sacar(float valor) {
		if (valor <= (saldo + limite)) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}
	
	public void Depositar(float valor) {
		saldo = saldo + valor;		
	}
	
	public boolean Transferir(float valor) {
		return Sacar(valor);
	}
	
	public boolean Pagar(float valor) {
		return Sacar(valor);
	}
	
	public void imprimirExtrato() {		
		System.out.println("Ag: " + agencia + " Conta: " + numero);
		System.out.println("Saldo: R$" + saldo + " Limite: " + limite);
	}
	
	public void verificaOperacao(boolean result) {
		if (result == true)
			System.out.println("Operacao realizada com sucesso");
		else 
			System.out.println("Operacao falhou");		
	}

	@Override
	public String toString() {
		return "Saldo=" + saldo + 
				",\n limite=" + limite + 
				",\n numero=" + numero + 
				",\n agencia=" + agencia;
	}
	
}
