/*Crie uma casa e pinte-a. Faça três portas e coloque-as na casa; 
abra-as e feche-as como desejar. Utilize o método quantasPortasEstaoAbertas
para imprimir o número de portas abertas. */
public class Casa {
    String corA, corB, corC;
    boolean aberta;
    String porta1, porta2, porta3;

    void pintar(String corA){
        String corDaPorta1 = this.corA = corA;
        System.out.println("A cor da porta1 é:" +corDaPorta1);
    }

    void pintar(String corB){
        String corDaPorta2 = this.corB = corB;
        System.out.println("A cor da porta1 é:" +corDaPorta2);
    }

    void pintar(String corC){
        String corDaPorta3 = this.corC = corC;
        System.out.println("A cor da porta1 é:" +corDaPorta3);
    }
    
}
