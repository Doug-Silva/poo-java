package Atividade04_T2_Padaria;

public class Pao extends Produto {

	public enum TiposDePao {
		PaoFrances, 
		Italino, 
		Baguete;
	}
	
	private TiposDePao tipoPao;
	
	public Pao(String nome, float preco, String marca, TiposDePao tp) {
		super(nome, preco, marca);
		tipoPao = tp;
	}	
	
	@Override
	public String descricao() {
		StringBuffer sb = new StringBuffer();
		sb.append("Nome: " + nome);
		sb.append(", Preço: R$" + preco);
		sb.append(", Marca: " + marca);
		sb.append(", Tipo de Pão: " + tipoPao.toString());
		return sb.toString();		
	}
	
}