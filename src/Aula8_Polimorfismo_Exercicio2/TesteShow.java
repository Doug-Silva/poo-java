package Aula8_Polimorfismo_Exercicio2;

public class TesteShow {
	
	public static void mostraIngressos(Ingresso ingresso) {
		// Isso só funciona pois o toString esta sobrecarregado 
		// em cada subclasse
		System.out.println(ingresso);		
	}
	
	public static void main(String[] args) {
	
		Pista ingressoPista;
		Vip ingressoVIP;
		Camarote ingressoCamarote;
		
//		ingressoPista = new Pista(40, "Ingresso na Pista");
//		ingressoVIP = new Vip(70, "Ingresso VIP perto do palco", "19:00");
//		ingressoCamarote = new Camarote(100, "Ingresso Camarote", 4587);
		
		ingressoPista = new Pista();
		ingressoVIP = new Vip("18:00");
		ingressoCamarote = new Camarote(5544);
				
//		System.out.println(ingressoPista);
//		System.out.println();
//		System.out.println(ingressoVIP);
//		System.out.println();
//		System.out.println(ingressoCamarote);
		
		mostraIngressos(ingressoPista);
		System.out.println();
		mostraIngressos(ingressoVIP);
		System.out.println();
		mostraIngressos(ingressoCamarote);
		
	}
}