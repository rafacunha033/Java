package exercises.variables;
/*
Dados:
Nome do aluno: Ian
Primeira nota: 9,5
Peso: 4
Segunda nota: 9,0
Peso: 6
Faça um programa que exiba o nome do aluno e a sua média ponderada.
*/


class Variaveis {
    public static void main(String[] args) {
      String nomeAluno = "Ian";
      
      double nota1 = 9.5;
      int peso1 = 4;
      
      double nota2 = 9.0;
      int peso2 = 6;
  
      double media;
  
      media = ((nota1*peso1)+(nota2*peso2))/10;
      System.out.println(media);
    }
}