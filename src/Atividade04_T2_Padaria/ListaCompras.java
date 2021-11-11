package Atividade04_T2_Padaria;

public interface ListaCompras {
	
		// Carrega os produtos do ArrayList e contabiliza o valor
		// total dos produtos
		public float valorTotalProdutos();
		
		// Carrega os produtos do ArrayList e imprimi na tela
		public void ListaProdutos();
		
		public void AdicionarItem(Produto prod);
		
}
