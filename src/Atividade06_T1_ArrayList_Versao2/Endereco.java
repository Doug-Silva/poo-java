package Atividade06_T1_ArrayList_Versao2;

public class Endereco {

	private String rua;
	private int numero;
	private String complemento;
	private String CEP;
	private String estado;
	private String pais;
	
	public Endereco(String rua, int numero, String complemento, String cEP, String estado, String pais) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		CEP = cEP;
		this.estado = estado;
		this.pais = pais;
	}

	public Endereco(String rua, int numero, String cEP, String estado, String pais) {
		this.rua = rua;
		this.numero = numero;
		// this.complemento = "";
		CEP = cEP;
		this.estado = estado;
		this.pais = pais;
	}

	@Override
	public String toString() {
		if (complemento != null) {
			return "Endereco: \n" + 
			   rua + ", " + numero + " " + complemento + 
			   "\nCEP " + CEP + 
			   "\n" + estado + ", " + pais;
		}
		return "Endereco: \n" + 
		   rua + ", " + numero +  
		   "\nCEP " + CEP + 
		   "\n" + estado + ", " + pais;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
}