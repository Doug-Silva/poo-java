package Atividade03_T1_Versao2;

public class Tempo {
	
//  Atributos:
	
	float temperatura;
	
//  Métodos:
	
//  + setTemperatura (float t)
//  + String statusTempo() o qual retorna o status do tempo, baseado nas seguintes condições;
//    a.    Temperatura abaixo de 10: retornar muito frio
//    b.    Temperatura abaixo de 18: retornar frio
//    c.    Temperatura acima de 18: retornar quente
//    d.    Temperatura acima de 30: retornar muito quente
	
	public float setTemperatura(float t) {
		
		temperatura = (t);
		return temperatura;
	}
	
	public String statusTempo() {
		
		if (temperatura <= 10) {
			System.out.println("Muito Frio");
		} else if (temperatura <= 18) {
			System.out.println("Frio");
		} else if (temperatura >= 30) {
			System.out.println("Muito Quente");
		} else if (temperatura > 18) {
			System.out.println("Quente");
		}
		
		return Float.toString(temperatura);
	}
	
	public static void main(String[] args) {
		
		Tempo temperaturaRS = new Tempo();
		temperaturaRS.setTemperatura(9.5f);
		
        System.out.println("A temperatura no RS está: " + temperaturaRS.statusTempo());
        System.out.println("\n");
        
        Tempo temperaturaBahia = new Tempo();
        temperaturaBahia.setTemperatura(29.7f);
        
        System.out.println("A temperatura na Bahia está: " + temperaturaBahia.statusTempo());
        System.out.println("\n");
        
	}

}
