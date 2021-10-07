package Aula7_Heranca_Exercicio2;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private String inscricaoEstadual;
	
	public PessoaJuridica(String nome, String endereco, int telefone, String cnpj, String inscricaoEstadual) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	@Override
	public String toString() {
		return "CNPJ: " + cnpj + "\n " +
		       "Insc. Est.: " + inscricaoEstadual + "\n " + 
			    super.toString();
	}
	
	
}