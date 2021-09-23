package Atividade06_T1_ArrayList_Versao2;

import java.util.ArrayList;

public class Funcionario {

	private Endereco endereco;
	private Banco dadosBancarios;
	private ArrayList<Dependente> dependentes;
	private float salario;
	private String setorDeTrabalho;
	private String nome;
	private String dataNascimento;
	
	public Funcionario(Endereco endereco, Banco dadosBancarios, 
			float salario, String setorDeTrabalho, 
			String nome, String dataNascimento) {
		this.endereco = endereco;
		this.dadosBancarios = dadosBancarios;
		this.dependentes = new ArrayList<Dependente>();
		this.salario = salario;
		this.setorDeTrabalho = setorDeTrabalho;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public Funcionario(Endereco endereco, Banco dadosBancarios, 
			ArrayList<Dependente> dep, float salario,
			String setorDeTrabalho, String nome, String dataNascimento) {
		this.endereco = endereco;
		this.dadosBancarios = dadosBancarios;
		this.dependentes = dep;
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
		for (Dependente dep : this.dependentes) {
			if (dep.getTipoDeRelacao().equals("filho")) {
				return true;
			} else if (dep.getTipoDeRelacao().equals("filha")) {
				return true;
			}
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
				"\n" + dependentes;
	}
	
	

	public ArrayList<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(ArrayList<Dependente> dependentes) {
		this.dependentes = dependentes;
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