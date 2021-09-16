package Atividade06_T1;

public class Funcionario {

	private Endereco endereco;
	private Banco dadosBancarios;
	private Familia dadosFamilia;
	private float salario;
	private String setorDeTrabalho;
	private String nome;
	private String dataNascimento;
	
	public Funcionario(Endereco endereco, Banco dadosBancarios, Familia dadosFamilia, float salario,
						String setorDeTrabalho, String nome, String dataNascimento) {
		this.endereco = endereco;
		this.dadosBancarios = dadosBancarios;
		this.dadosFamilia = dadosFamilia;
		this.salario = salario;
		this.setorDeTrabalho = setorDeTrabalho;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String statusSalario() {
		if (salario > 500) {
			return "alto";
		} 
		return "baixo";				
	}
	
	public Boolean possuiFilhos() {
		if (dadosFamilia.numeroDeFilhos() > 0) {
			return true;
		}
		return false;	
	}	

	@Override
	public String toString() {
		return "Dados do Funcionario:" +
				"\nNome: " + nome +
				"\nSetor: " + setorDeTrabalho +
				"\nData de Nascimento: " + dataNascimento +				
				"\n" + endereco + 
				"\n" + dadosBancarios + 
				"\n" + dadosFamilia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Banco getDadosBancarios() {
		return dadosBancarios;
	}

	public void setDadosBancarios(Banco dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}

	public Familia getDadosFamilia() {
		return dadosFamilia;
	}

	public void setDadosFamilia(Familia dadosFamilia) {
		this.dadosFamilia = dadosFamilia;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getSetorDeTrabalho() {
		return setorDeTrabalho;
	}

	public void setSetorDeTrabalho(String setorDeTrabalho) {
		this.setorDeTrabalho = setorDeTrabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}