package Atividade03_T1;

public class Produto {
	
//  Atributos:
	
	String nome;
	float preco;
	String descricao;

//  Metodos:
//  + String mostraNomeProduto() �mostra o nome do produto� 
//	+ String mostraPreco(); �mostra o preco do produto� 
//	+ void mostradescricaoProduto() �mostra a descricao do produto�
	
	String mostraNomeProduto() {
	      return nome;   
	  }
	
	String mostraPreco() {
	      return Float.toString(preco);  
	  }
	
	void mostradescricaoProduto() {
	      System.out.println(descricao);  
	  }
	
	public static void main(String[] args) {
		
		Produto produt1 = new Produto();
		produt1.nome = "Sabao em p�";
		produt1.preco = 10.2f;
		produt1.descricao = "Descricao do produto: \r\n\n"
							+ "Remove as manchas na primeira lavagem\r\n"
							+ "Rende 630 kg de roupas limpas e sem res�duos\r\n"
							+ "P� ultrafino que dissolve rapidamente\r\n"
							+ "Remove as manchas na primeira lavagem\r\n"
							+ "� um produto mais sustent�vel\r\n"
							+ "Cuida das cores das roupas";
		
		Produto produt2 = new Produto();
		produt2.nome = "Chocolate";
		produt2.preco = 5.2f;
		produt2.descricao = "Descricao do produto: \r\n\n"
							+ "Este produto cont�m 90g\r\n"
							+ "Este produto cont�m gl�ten\r\n"
							+ "Sabor chocolate ao leite";
				
		System.out.println("Nome: " + produt1.mostraNomeProduto());
		System.out.println("Pre�o: " + produt1.mostraPreco());
		produt1.mostradescricaoProduto();
		
		System.out.println("\n");
		
		System.out.println("Nome: " + produt2.mostraNomeProduto());
		System.out.println("Pre�o: " + produt2.mostraPreco());
		produt2.mostradescricaoProduto();
		
	}

}
