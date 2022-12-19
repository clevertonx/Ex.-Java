/*No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos até 20, 30 e 40.
Em um determinado momento, além de esse cálculo demorar, começará a mostrar respostas completamente erradas. Por quê?
Mude de int para long a fim de ver alguma mudança. */
public class praticando_sintaxe5 {
    public static void main(String[] args) {
       
      long fatorial = 1;
        for (long n = 1; n <= 40; n++){
            fatorial = n*fatorial;
            System.out.println(fatorial);
        }
    }
}

