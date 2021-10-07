package Aula7_Heranca_Exercicio2;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, String endereco, int telefone, String cpf, String rg) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	@Override
	public String toString() {
		return "CPF: " + cpf + "\n " +
	           "RG: " + rg + "\n " + 
				super.toString();
	}	
	
}
