package Aula3;

public class Calculadora {

    int valor; // Vai armazenar o resultado da ultima operação
    String operacao; // Vai armazenar o tipo da ultima operação
    
    int somar(int a, int b) {
        valor = (a + b);
        operacao = "Soma";
        return valor;
    };
    
    int subtrair(int a, int b) {        
        valor = (a - b);
        operacao = "Subtração";
        return valor;
    };
    
    int ultimoResultado() {
        return valor;
    };
    
    String ultimaOperacao() {
        return operacao;
    };
    
    public static void main(String[] args) {
        Calculadora calc1 = new Calculadora();
        
        calc1.somar(5, 6);
        System.out.println("Resultado da operacao: " + calc1.ultimoResultado());
        System.out.println("Tipo da operacao: " + calc1.ultimaOperacao());

        calc1.subtrair(10, 4);
        System.out.println("Resultado da operacao: " + calc1.ultimoResultado());
        System.out.println("Tipo da operacao: " + calc1.ultimaOperacao());
    }
}