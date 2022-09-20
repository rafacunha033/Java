package exercises.IPVA;

import java.util.Scanner;

public class Carro {
  
  public static void main(String[] args) {
     

    // Scanner scann -> declarou o tipo da variavel;
    // new Scanner -> criou um novo objeto;
    Scanner scann = new Scanner(System.in);

    System.out.print("Valor do carro: ");
    double valorCarro = scann.nextDouble();
    
    System.out.print("Mês de compra(INT): ");
    int mesCompra = scann.nextInt();
    
    // IPVA Total -> 4% do valor do carro
    // 4% é o mesmo que 4/100, logo 0.04
    double IPVA = (valorCarro*0.04);

    /** Para o tempo de uso subtrai-se 12 meses(1 ano) com o mes de compra e,
     *  soma-se mais 1 para que conte também o mês em que foi comprado.
    */ 
    int tempoUsoCarro = 12 - mesCompra + 1;
    
    /** O valor total a ser pago será o IPVA anual dividido por 12 para descobrir quanto se paga por mês. (IPVA/12)
     *  Ao descobrir o valor mensal, iremos multiplicar este valor pelo tempo de uso do carro.
     */
    double valorTotal = IPVA/12 * tempoUsoCarro;

    System.out.printf("total do IPVA: %s %n", IPVA);
    System.out.printf("Tempo de uso: %s meses %n", tempoUsoCarro);
    System.out.printf("Valor a ser pago = %.2f %n", valorTotal);
    
  }
}