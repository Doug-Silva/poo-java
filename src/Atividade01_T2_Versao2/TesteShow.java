package Atividade01_T2_Versao2;

public class TesteShow {

	public static void main(String[] args) {
		
		Camarote backStage = new Camarote (100.0f, "Ingresso Camarote", 25);
		
		Vip vip = new Vip (70.0f, "Ingresso Vip perto do palco", "17:50");
		
		Pista pista = new Pista (40.0f, "Ingresso na pista");
		
		System.out.println(backStage);
		System.out.println();
		System.out.println(vip);
		System.out.println();
		System.out.println(pista);
		

	}

}
