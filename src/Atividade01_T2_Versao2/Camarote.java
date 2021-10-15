package Atividade01_T2_Versao2;

public class Camarote extends Ingressos {
	
	private int codigoPorta;
	
	public Camarote(float valor, String descricao, int codigoPorta) {
		super(valor, descricao);
		this.codigoPorta = codigoPorta;
	}

	public int getCodigoPorta() {
		return codigoPorta;
	}

	public void setCodigoPorta(int codigoPorta) {
		this.codigoPorta = codigoPorta;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + 
		       "Código da Porta: " + codigoPorta;
	}

}
