package Atividade06_T2;

import java.util.HashMap;

public class TestComputadorMap {

	public static void main(String[] args) {

		HashMap<String, Computador> sistema = new HashMap<String, Computador>();

		Computador cpu1 = new Computador("192.149.1.18","Windows");
		Computador cpu2 = new Computador("182.128.1.28","Linux");
		Computador cpu3 = new Computador("122.258.1.54","Mac");
		
		sistema.put(cpu1.getIp(), cpu1);
		sistema.put(cpu2.getIp(), cpu2);
		sistema.put(cpu3.getIp(), cpu3);
		
		sistema.remove(cpu2.getIp(), cpu2);
		
		System.out.println("Computadores Cadastrados:");
		System.out.println(sistema.get("192.149.1.18"));
		System.out.println(sistema.get("122.258.1.54"));
		
	}
	
}