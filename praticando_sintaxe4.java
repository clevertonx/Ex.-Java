/*Imprima os fatoriais de 1 a 10.*/
public class praticando_sintaxe4 {
    public static void main(String[] args) {
       
      int fatorial = 1;
        for (int n = 1; n <= 10; n++){
            fatorial = n*fatorial;
            System.out.println(fatorial);
        }
    }
}