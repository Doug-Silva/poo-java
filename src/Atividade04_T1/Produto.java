package Atividade04_T1;


public class Produto {
	
	//Atributos:
	
	String nome;
	float preco;
	String descricao;
	
	//Construtores:
	
	public Produto(String name, float precProdut) {
	      this.nome = name;
	      this.preco = precProdut;
	           
	}
	
	public Produto(String name, float precProdut, String descricaoProdut) {
		  this.nome = name;
		  this.preco = precProdut;
		  this.descricao = descricaoProdut;        
	}

	//Métodos:
		
	//+ String mostraNomeProduto() “mostra o nome do produto” 
	//+ String mostraPreco(); “mostra o preço do produto” 
	//+ void mostradescricaoProduto() “mostra a descrição do produto”
	
	String mostraNomeProduto() {
	      return nome;   
	  }
	
	String mostraPreco() {
	      return Float.toString(preco);  
	  }
	
	void mostradescricaoProduto() {
	      System.out.println(descricao);  
	  }
	
}