package Aula4;

public class ContaBancariaEncapsulada2 {

public static void main(String[] args) {
        
        ContaBancariaEncapsulada conta1 = new ContaBancariaEncapsulada();
        conta1.setAgencia(0133);
        conta1.setNumero(223344);
        conta1.setSaldo(0);
        conta1.setLimite(500);
        conta1.setNome("Gustavo");
        boolean resultado;
        
        //conta1.getSaldo();        
        conta1.depositar(100);        
        conta1.imprimirExtrato();
        
        resultado = conta1.sacar(400);
        conta1.verificaOperacao(resultado);
        conta1.imprimirExtrato();
        
        resultado = conta1.transferir(100);
        conta1.verificaOperacao(resultado);
        conta1.imprimirExtrato();        
        
        resultado = conta1.pagar(100);
        conta1.verificaOperacao(resultado);
        conta1.imprimirExtrato();
                
        resultado = conta1.sacar(100);
        conta1.verificaOperacao(resultado);
        conta1.imprimirExtrato();    
    }
}