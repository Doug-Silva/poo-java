package Atividade02_T2;

public class TestModems {
	
	public static void mostraModem(Modem modem) {
		
		System.out.println(modem);		
	}

	public static void main(String[] args) {
			
			Modem_ABC modem1 = new Modem_ABC ("TP-link", "Cr700", 500, 1, "10base2");
			Modem_XYZ modem2 = new Modem_XYZ ("Archer", "XR500v", 1100, 1);
			
			mostraModem(modem1);
			System.out.println("Tipo de cabo: " + modem1.caboGrossoOuFino());
			
			System.out.println();
			
			mostraModem(modem2);
			System.out.println("Velocidade de operacao: " + modem2.altaOuBaixaVelocidade());
			
		}

}
