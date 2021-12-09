package Atividade04_T2_Padaria;

import Atividade04_T2_Padaria.Leite.ClassificacaoDoLeite;
import Atividade04_T2_Padaria.Leite.TiposDeLeite;
import Atividade04_T2_Padaria.Pao.TiposDePao;
import Atividade04_T2_Padaria.Queijo.TiposDeQueijo;
import Atividade04_T2_Padaria.Salame.TiposDeSalame;

public class TestePadaria {
	public static void main(String[] args) {
		
		Produto p1, p2, p3, p4;
		 CarrinhoDeCompras minhasCompras = new CarrinhoDeCompras();
		
		p1 = new Pao("Pao teste", 1, "indefinida", TiposDePao.Baguete);

		
		p2 = new Leite("Leite teste", 3, "indefinida", 
				        TiposDeLeite.Integral, ClassificacaoDoLeite.C);

		
		p3 = new Queijo("Queijo teste", (float)9.50, "indefinida", TiposDeQueijo.Cheddar);

		
		p4 = new Salame("Salame teste", 12.50f, "indefinida", TiposDeSalame.Copa);

		
		System.out.println();
		
		minhasCompras.AdicionarItem(p1);
		minhasCompras.AdicionarItem(p2);
		minhasCompras.AdicionarItem(p3);
		minhasCompras.AdicionarItem(p4);
		
		minhasCompras.ListaProdutos();
		
		System.out.println("Valor total das compras: R$" + minhasCompras.valorTotalProdutos());
		
	}
}