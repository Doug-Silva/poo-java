package Atividade03_T1_Exerc1;

public class NotaFiscal {
	
//  Atributos:
	
	String nomeItem1; 
	String nomeItem2; 
	float precoItem1; 
	float precoItem2;
	
//  Métodos:
	
//	float calculaNotaFiscal(); “calcula o total da nota, baseado na fórmula (precoItem1 + precoItem2) e retorna o resultado” 
//	String mostraNomeItem1() “retorna o nome do item 1” 
//	String mostraNomeItem2() “retorna o nome do item 2”
	
	float calculaNotaFiscal() {
		return (precoItem1 + precoItem2);
	}
	
	String mostraNomeItem1() {
		return nomeItem1;
	}
	
	String mostraNomeItem2() {
		return nomeItem2;
	}

	public static void main(String[] args) {
		
		NotaFiscal nf1 = new NotaFiscal();
		NotaFiscal nf2 = new NotaFiscal();
		NotaFiscal nf3 = new NotaFiscal();
        
        nf1.nomeItem1 = "Chaveiro";
        nf1.nomeItem2 = "Controle remoto";
        nf1.precoItem1 = 10;
        nf1.precoItem2 = 40;
        
        nf2.nomeItem1 = "Teclado";
        nf2.nomeItem2 = "Mouse";
        nf2.precoItem1 = 50;
        nf2.precoItem2 = 30;
        
        nf3.nomeItem1 = "Monitor";
        nf3.nomeItem2 = "Notebook";
        nf3.precoItem1 = 1000;
        nf3.precoItem2 = 2000;
        
        System.out.println("Nota 1: R$" + nf1.calculaNotaFiscal());
        System.out.println("Nota 2: R$" + nf2.calculaNotaFiscal());
        System.out.println("Nota 3: R$" + nf3.calculaNotaFiscal());
    }

}
