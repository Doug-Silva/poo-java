package Atividade04_T2_Padaria;

public class Salame extends Produto {

	public enum TiposDeSalame {
		Copa,
		ComPimenta,
		SemPimenta;		
	}
	
	private TiposDeSalame tipoSalame;
	
	public Salame(String nome, float preco, String marca, TiposDeSalame ts) {
		super(nome, preco, marca);
		tipoSalame = ts;
	}	
	
	@Override
	public String descricao() {
		StringBuffer sb = new StringBuffer();
		sb.append("Nome: " + nome);
		sb.append(", Preço: R$" + preco);
		sb.append(", Marca: " + marca);
		sb.append(", Tipo de Salame: " + tipoSalame.toString());
		return sb.toString();		
	}
	
}
