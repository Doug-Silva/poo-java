package Aula4;

public class CalculadoraEncapsulada {

    private int valor; // Vai armazenar o resultado da ultima operação
    private String operacao; // Vai armazenar o tipo da ultima operação
    
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public String getOperacao() {
        return operacao;
    }
    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public int somar(int a, int b) {
        valor = (a + b);
        operacao = "Soma";
        return valor;
    };
    
    public int subtrair(int a, int b) {        
        valor = (a - b);
        operacao = "Subtração";
        return valor;
    };
    
    public int ultimoResultado() {
        return valor;
    };
    
    public String ultimaOperacao() {
        return operacao;
    };
    
    public static void main(String[] args) {
        CalculadoraEncapsulada calc1 = new CalculadoraEncapsulada();
//        int res;
        calc1.somar(5, 6);
        System.out.println("Resultado da operacao: " +
                            calc1.ultimoResultado());
        System.out.println("Tipo da operacao: " +
                calc1.ultimaOperacao());

        calc1.subtrair(10, 4);
        System.out.println("Resultado da operacao: " +
                calc1.ultimoResultado());
        System.out.println("Tipo da operacao: " +
                calc1.ultimaOperacao());
    }
}

