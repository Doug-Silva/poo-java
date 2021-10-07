package Aula6_Composicao_Exercicio1;

public class Endereco {
	
	//Atributos
	
	private String Rua, CEP, Complemento;
	private int Numero;
	
	//Construtor
	
	public Endereco(String rua, int numero) {		
		this.Rua = rua;
		this.Numero = numero;
	}

	public Endereco(String rua, int numero, 
			 String complemento, String CEP) {
		this.Rua = rua;
		this.CEP = CEP;
		this.Complemento = complemento;
		this.Numero = numero;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}	

}