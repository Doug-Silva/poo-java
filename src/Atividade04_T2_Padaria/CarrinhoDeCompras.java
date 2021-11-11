package Atividade04_T2_Padaria;

import java.util.ArrayList;

public class CarrinhoDeCompras implements ListaCompras {
	
	private ArrayList<Produto> listaProdutos;
	
	public CarrinhoDeCompras() {
		super();
		this.listaProdutos = new ArrayList<Produto>();
	}
	
	// TODO:
	// Implementar os métodos da interface ListaDeCompras
	
	@Override
	public float valorTotalProdutos() {
		float valorTotal = 0;
		for (Produto produto : listaProdutos) {
			valorTotal = valorTotal + produto.getPreco();
			
		}
		return valorTotal;
	}

	@Override
	public void ListaProdutos() {

		for (Produto produto : listaProdutos) {
			System.out.println(produto);
		}
	}

	@Override
	public void AdicionarItem(Produto prod) {
		this.listaProdutos.add(prod);		
	}	
	
}