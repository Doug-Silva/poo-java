package Aula8_Polimorfismo_Exercicio2;

import java.util.ArrayList;

public class TesteShow2_ArrayList {
	
private ArrayList<Ingresso> tickets;	
	
	public TesteShow2_ArrayList() {
		this.tickets = new ArrayList<Ingresso>();
	}
	
	public void adicionarIngresso(Ingresso ticket) {
		this.tickets.add(ticket);
	}
	
	public void mostraIngressos() {		
		for (Ingresso ticket : tickets) {
			System.out.println(ticket);
		}		
	}
	
	public static void main(String[] args) {
		
//		Pista ingressoPista = new Pista();
//		Vip ingressoVIP = new Vip("17:00");
//		Camarote ingressoCamarote = new Camarote(5566);

		TesteShow2_ArrayList carteiraIngressos = new TesteShow2_ArrayList();
		
//		carteiraIngressos.adicionarIngresso(ingressoPista);
//		carteiraIngressos.adicionarIngresso(ingressoVIP);
//		carteiraIngressos.adicionarIngresso(ingressoCamarote);
		
		carteiraIngressos.adicionarIngresso(new Pista());
		carteiraIngressos.adicionarIngresso(new Vip("17:00"));
		carteiraIngressos.adicionarIngresso(new Camarote(5566));
		
		carteiraIngressos.mostraIngressos();
		
	}

}