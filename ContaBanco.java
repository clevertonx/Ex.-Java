/*Modele uma conta. A ideia aqui é apenas modelar, isto é, identificar quais informações são importantes. Desenhe no papel tudo o que uma Conta tem e tudo o que ela faz. Ela deve ter o nome do titular (String), o número (int), a agência (String), o saldo (double) e uma data de abertura (String). Além disso, a conta deve fazer as seguintes ações: sacar para retirar um valor do saldo; depositar a fim de adicionar um valor ao saldo; calculaRendimento para devolver o seu ganho mensal.

Transforme o modelo acima em uma classe Java. Teste-a usando uma outra classe que tenha o main. Você deve criar a classe da conta com o nome Conta, mas pode nomear como quiser a classe de testes, por exemplo, pode chamá-la TestaConta. Contudo, ela deve necessariamente ter o método main.

A classe Conta deve conter, além dos atributos mencionados anteriormente, pelo menos os seguintes métodos:

saca que recebe um valor como parâmetro e o retira do saldo da conta;
deposita que recebe um valor como parâmetro e o adiciona ao saldo da conta;
calculaRendimento que não recebe parâmetro algum e devolve o valor do saldo multiplicado por 0.1.
Lembre-se de seguir a convenção Java, isso é importantíssimo. Preste atenção nas maiúsculas e minúsculas, seguindo o seguinte exemplo: nomeDeAtributo, nomeDeMetodo, nomeDeVariavel, NomeDeClasse, etc.
Na classe Conta, crie um método recuperaDadosParaImpressao() que não recebe parâmetro, mas devolve o texto com todas as informações da nossa conta para efetuarmos a impressão.
Na classe de teste dentro do bloco main, construa duas contas com o new e compare-as com o ==. E se eles tiverem os mesmos atributos? Para isso, você precisará criar outra referência: */
public class ContaBanco {
   String titular;
   String dataAbertura;
   String agencia;
   int conta;
   double saldo;

   void Sacar(double valor) {
      this.saldo -= valor;
   }

   void Deposita(double valor) {
      this.saldo += valor;
   }

   double calculaRendimento() {
      return this.saldo * 0.1;
   }

   String recuperaDadosParaImpressao() {
      String dados = "Titular: " + this.titular;
      dados += "\nConta: " + this.conta;
      dados += "\nAgencia: " + this.agencia;
      dados += "\nData de abertura: " + this.dataAbertura;
      dados += "\nSaldo: " + this.saldo;
      return dados;
   }

   class TesteContaBanco {
      public static void main(String[] args) {
         ContaBanco cb = new ContaBanco();
         cb.titular = "tom";
         cb.saldo = 1000;
         cb.dataAbertura = "21/06/1997";
         cb.agencia = "tururu";
         cb.conta = 582482;
         cb.Sacar(500);
         cb.Deposita(200);
         cb.calculaRendimento();
         cb.recuperaDadosParaImpressao();

         System.out.println(cb.recuperaDadosParaImpressao());

         System.out.println("saldo atual:" + cb.saldo);
         System.out.println("rendimento mensal:" + cb.calculaRendimento());

         ContaBanco cb2 = new ContaBanco();
         cb2.titular = "leh";
         cb2.saldo = 500;
         cb2.dataAbertura = "08/11/1996";
         cb2.agencia = "tananam";
         cb2.conta = 335522;

         if (cb == cb2) {
            System.out.println("São contas iguais");
         } else {
            System.out.println("São contas diferentes");
         }
      }
   }

}
