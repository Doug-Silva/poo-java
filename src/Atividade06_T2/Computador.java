package Atividade06_T2;

public class Computador {
	
	private String ip;
	private String sistemaOperacional;
	
	public Computador(String ip, String sistemaOperacional) {
		super();
		this.ip = ip;
		this.sistemaOperacional = sistemaOperacional;
	}

	public String getIp() {
		return ip;
	}

	@Override
	public String toString() {
		return "Computador [ip=" + ip + ", sistemaOperacional=" + sistemaOperacional + "]";
	}
	
}
