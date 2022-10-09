package exercises.IPVA;

import java.util.Scanner;

public class Carro {
  double valorCarro;
  int mesCompra;
  double IPVA;

  static void calcIPVA() {
    Scanner scann = new Scanner(System.in);

    System.out.print("Valor do carro: ");
    double valorCarro = scann.nextDouble();

    System.out.print("Mês de compra(INT): ");
    int mesCompra = scann.nextInt();
    
    double IPVA = (valorCarro*0.04);

    int tempoUsoCarro = 12 - mesCompra + 1;
    
    double valorTotal = IPVA/12 * tempoUsoCarro;

    System.out.printf("total do IPVA: %s %n", IPVA);
    System.out.printf("Tempo de uso: %s meses %n", tempoUsoCarro);
    System.out.printf("Valor a ser pago = %.2f %n", valorTotal);
  }
  
  public static void main(String[] args) {
    calcIPVA();
    
  }
}