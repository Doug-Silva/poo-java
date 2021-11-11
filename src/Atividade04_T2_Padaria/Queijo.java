package Atividade04_T2_Padaria;

public class Queijo extends Produto {

	public enum TiposDeQueijo {
		Colonial, 
		Lanche, 
		Cheddar,
		Grueyere,
		Emmental,
		Brie;		
	}
	
	private TiposDeQueijo tipoQueijo;
	
	public Queijo(String nome, float preco, String marca, TiposDeQueijo tq) {
		super(nome, preco, marca);
		tipoQueijo = tq;
	}	
	
	@Override
	public String descricao() {
		StringBuffer sb = new StringBuffer();
		sb.append("Nome: " + nome);
		sb.append(", Preço: R$" + preco);
		sb.append(", Marca: " + marca);
		sb.append(", Tipo de Queijo: " + tipoQueijo.toString());
		return sb.toString();		
	}
	
}