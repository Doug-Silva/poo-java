package Atividade04_T1;

public class ProdutoComConstrutor {

public static void main(String[] args) {
	
		Produto produt1;
		produt1 = new Produto("Sabao em p�", 10.2f);
		
		Produto produt2;
		produt2 = new Produto("Chocolate", 5.2f, "Descricao do produto: \r\n\n"
															  +"Este produto cont�m 90g\r\n"
															  +"Sabor chocolate ao leite\r\n"
															  +"Este produto cont�m gl�ten");
		
		// Execu��o:
		
		System.out.println("Nome: " + produt1.mostraNomeProduto());
		System.out.println("Pre�o: " + produt1.mostraPreco());
		
		System.out.println("\n");
		
		System.out.println("Nome: " + produt2.mostraNomeProduto());
		System.out.println("Pre�o: " + produt2.mostraPreco());
		produt2.mostradescricaoProduto();
		
	}

}
