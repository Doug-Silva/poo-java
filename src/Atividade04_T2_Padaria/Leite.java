package Atividade04_T2_Padaria;

public class Leite extends Produto {

	public enum TiposDeLeite {
		Desnatado, 
		SemiDesnatado, 
		Integral;
	}
	
	public enum ClassificacaoDoLeite {
		A, 
		B, 
		C;
	}
	
	private TiposDeLeite tipoLeite;
	private ClassificacaoDoLeite classificacao;
	
	public Leite(String nome, float preco, String marca, 
				 TiposDeLeite tl, ClassificacaoDoLeite classe) {
		super(nome, preco, marca);
		tipoLeite = tl;
		classificacao = classe;		
	}	
	
	@Override
	public String descricao() {
		StringBuffer sb = new StringBuffer();
		sb.append("Nome: " + nome);
		sb.append(", Preço: R$" + preco);
		sb.append(", Marca: " + marca);
		sb.append(", Tipo de Leite: " + tipoLeite.toString());
		sb.append(", Classificação do Leite: " + classificacao.toString());
		return sb.toString();		
	}
	
}