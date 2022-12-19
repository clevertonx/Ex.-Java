/*Crie uma pessoa. Coloque o nome e a idade inicial dela, faça alguns aniversários (aumentando a idade) e imprima o seu nome e a idade.*/
public class Pessoa {
    String nome;
	int idade;
	int aniver;

	public int FazAniversario() {
		aniver = idade++;
		return aniver;
	}

	void mostra() {
		System.out.println("Nome:" + this.nome);
		System.out.println("Idade antes do Aniversário:" + this.idade);
	}
}

class AplicPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Tom";
		p1.idade = 25;
		p1.mostra();
		p1.FazAniversario();
		p1.mostra();

		
		// p1.aniver = p1.idade++;
		
       
		
	}

    

    

    
}