/* Ex.1-Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro,
foram gastos 15 mil reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos. */

public class variaveis1 {
    
public static void main(String[]args) throws Exception {
    int jan = 15000;
    int fev = 23000;
    int mar = 17000;
    int total = jan+fev+mar;
    int media = (total)/3;
    
    System.out.println(total);
    System.out.println("a despesa total é de:"  +total);
    System.out.println("A média de gastos é de:" +media);
      
}
}
