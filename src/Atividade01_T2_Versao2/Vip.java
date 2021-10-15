package Atividade01_T2_Versao2;

public class Vip extends Ingressos {
	
	private String hora;

	public Vip(float valor, String descricao, String hora) {
		super(valor, descricao);
		this.hora = hora;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + 
			   "Hora máxima de chegada: " + hora;
	}
	
	

}
