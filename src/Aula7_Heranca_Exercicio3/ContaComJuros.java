package Aula7_Heranca_Exercicio3;

public class ContaComJuros extends ContaBancaria {

	private float juros;
	
	public ContaComJuros(int num, int ag, float limite, float juros) {
		super(num, ag, 0, limite);
		this.juros = juros;		
	}
	
	// Acesso aos atributos da superclasse via o toString da mesma.
	@Override
	public String toString() {
		return "Juros=" + juros*100 + "% a.m.\n " + 
		super.toString();
	}

}
