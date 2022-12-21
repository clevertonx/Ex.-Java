
/*Crie uma porta, abra-a e feche-a. Pinte-a de diversas cores, altere suas dimensões e use o método estaAberta para verificar se ela está aberta. */
public class Porta {
    String cor;
    boolean aberta;
    double dimensaox, dimensaoy, dimensaoz;

    void pintar(String cor) {
        String corDaPorta = this.cor = cor;
        System.out.println("A cor da porta é:" + corDaPorta);
    }

    void abre() {
        if (this.aberta == false) {
            this.aberta = true;
        }
    }

    void fecha() {
        if (this.aberta == true) {
            this.aberta = false;
        }
    }

    void estaAberta() {
        if (this.aberta == true)
            System.out.println("A porta está aberta.");
        if (this.aberta == false)
            System.out.println("A porta está fechada.");
    }

    public static void main(String args[]) {
        Porta porta = new Porta();
        porta.pintar("purple");
        porta.dimensaox = 1.20;
        porta.dimensaoy = 1.50;
        porta.dimensaoz = 0.50;
        porta.abre();
        porta.estaAberta();
        porta.fecha();
        porta.estaAberta();

        System.out.println("A cor da porta é: " + porta.cor);
        System.out.println("As dimensões da porta são:" + "\n" + "X: " + porta.dimensaox + "\n" + "Y: "
                + porta.dimensaoy + "\n" + "Z: " + porta.dimensaoz);
    }

    public void mostrar() {
    }

}
