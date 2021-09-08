package Atividade05_T1_Exerc2;

public class MaeFilhoMain {

	public static void main(String[] args) {
		
		Mae mae1 = new Mae("Claudia Silva");
		
		Filho filho1 = new Filho("Marcos");
		Filho filho2 = new Filho("Fernanda");
		
		mae1.setFilho1(filho1);
		mae1.setFilho2(filho2);
		
		System.out.println(mae1.getNomeMae());
		System.out.println("É mãe de: " + mae1.getFilho1().getNome() + " e " + mae1.getFilho2().getNome());
		
	}

}
