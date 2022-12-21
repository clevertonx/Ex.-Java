/*Crie uma casa e pinte-a. Faça três portas e coloque-as na casa; 
abra-as e feche-as como desejar. Utilize o método quantasPortasEstaoAbertas
para imprimir o número de portas abertas. */
public class Casa {
    String cor;
    boolean porta1;
    boolean porta2;
    boolean porta3;

    void pinta(String cor) {
        System.out.println("A cor da casa é: " + cor);
    }

    void abre() {
        System.out.println("porta 1 aberta? " + this.porta1);
        System.out.println("porta 2 aberta? " + this.porta2);
        System.out.println("porta 3 aberta? " + this.porta3);
    }

    int quantasAbertas() {

        int portasAbertas = 0;

        if (this.porta1) {
            portasAbertas++;
        }
        if (this.porta2) {
            portasAbertas++;
        }
        if (this.porta3) {
            portasAbertas++;
        }
        return portasAbertas;
    }

    class TesteCasa {
        public static void main(String[] args) {
            Casa c1 = new Casa();
            c1.pinta("black");
            c1.porta1 = true;
            c1.porta2 = false;
            c1.porta3 = true;
            c1.abre();
            c1.quantasAbertas();

            System.out.println("numero de portas abertas sao: " + c1.quantasAbertas());

        }
    }
}
