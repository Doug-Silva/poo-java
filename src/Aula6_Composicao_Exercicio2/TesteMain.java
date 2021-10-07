package Aula6_Composicao_Exercicio2;

public class TesteMain {

	public static void main(String[] args) {
		
		Porta porta1 = new Porta("Vermelha", 20);
		Porta porta2 = new Porta("Azul", 35);
		
		Janela janela1 = new Janela(8);
		Janela janela2 = new Janela(10);
		
		Casa casa1 = new Casa(50.2f, porta1, porta2, janela1, janela2);
		
		System.out.println("Area da casa: " + casa1.getTamanhoEmMetros() + "m²" + "\n");
		System.out.println("Porta1: " + "\n" + "Cor: " + porta1.getCor() + "\n" + "Tamanho: " + porta1.getTamanho() + "m²" + "\n");
		System.out.println("Porta2: " + "\n" + "Cor: " + porta2.getCor() + "\n" + "Tamanho: " + porta2.getTamanho() + "m²");
		
		System.out.println("\n");
		
		System.out.println("Janela1: " + "\n" + "Tamanho: " + janela1.getTamanho() + "m²" + "\n");
		System.out.println("Janela2: " + "\n" + "Tamanho: " + janela2.getTamanho() + "m²");	
		
	}
	
}		
		

