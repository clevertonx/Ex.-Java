/*Imprima todos os múltiplos de 3, entre 1 e 100.*/
public class praticando_sintaxe3 {
    public static void main(String[] args) {

        int a = 0;
        for (a = 0; a <= 100; a++) {
            if ((a % 3) == 0) {
                System.out.println(a);
            }
        }
    }
}