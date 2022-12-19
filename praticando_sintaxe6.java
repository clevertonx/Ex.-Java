/*Imprima os primeiros números da série de Fibonacci até passar de 100. A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. 
Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, e daí por diante.
O n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3). */
public class praticando_sintaxe6 {
    public static void main(String[] args) {
        int a = 1, b = 1;
        while (b <= 100) {
            a = a + b;
            System.out.print(" " + b);
            b = a - b;
        }
    }
}