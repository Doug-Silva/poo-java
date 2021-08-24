package Aula3;

public class ContaBancaria {

//  Atributos:

  float saldo, limite;
  int numero, agencia;
  String nome;

//  M�todos:
  
//  + sacar(valor: float): boolean
//  + depositar(valor: float): boolean
//  + transferir(valor: float): boolean
//  + pagar(valor: float): boolean
  
  public boolean sacar(float valor) {
      if (valor <= (saldo + limite)) {
          saldo = saldo - valor;
          return true;
      }
      return false;
  }
  
  public void depositar(float valor) {
      saldo = saldo + valor;        
  }
  
  public boolean transferir(float valor) {
      return sacar(valor);
  }
  
  public boolean pagar(float valor) {
      return sacar(valor);
  }
  
  public void imprimirExtrato() {
      System.out.println("Nome Cliente: " + nome);
      System.out.println("Ag: " + agencia + " Conta: " + numero);
      System.out.println("Saldo: R$" + saldo + " Limite: " + limite);
  }
  
  public void verificaOperacao(boolean result) {
      if (result == true)
          System.out.println("Operacao realizada com sucesso");
      else
          System.out.println("Operacao falhou");        
  }    
  
  public static void main(String[] args) {
      
      ContaBancaria conta1 = new ContaBancaria();
      conta1.agencia = 0133;
      conta1.numero = 223344;
      conta1.saldo = 0;
      conta1.limite = 500;
      conta1.nome = "Douglas";
      boolean resultado;
              
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