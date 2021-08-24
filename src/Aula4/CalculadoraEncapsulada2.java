package Aula4;

public class CalculadoraEncapsulada2 {

    public static void main(String[] args) {
        CalculadoraEncapsulada calc1 = new CalculadoraEncapsulada();
        
        calc1.somar(5, 6);
        System.out.println("Resultado da operacao: " + calc1.ultimoResultado());
        System.out.println("Tipo da operacao: " + calc1.ultimaOperacao());
        
        System.out.println("Operacao: " + calc1.getOperacao());
        System.out.println("Valor: " + calc1.getValor());

        calc1.subtrair(10, 4);
        System.out.println("Resultado da operacao: " + calc1.ultimoResultado());
        System.out.println("Tipo da operacao: " + calc1.ultimaOperacao());
    }
}


