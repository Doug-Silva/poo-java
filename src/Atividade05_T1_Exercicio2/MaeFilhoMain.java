package Atividade05_T1_Exercicio2;

public class MaeFilhoMain {

	public static void main(String[] args) {
		
		Filho filho1 = new Filho("Marcos");
		Filho filho2 = new Filho("Fernanda");
		
		Mae mae1 = new Mae("Claudia Silva", filho1, filho2);
		
		System.out.println(mae1.getNomeMae());
		System.out.println("É mãe de: " + mae1.getFilho1().getNome() + " e " + mae1.getFilho2().getNome());
		
	}

}
