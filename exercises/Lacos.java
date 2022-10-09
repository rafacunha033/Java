package exercises;

import java.util.Scanner;


public class Lacos {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        
        // for(int i=0; i<10; i++) {
        //     System.out.print(i+" ");
        // }
        // System.out.println("");

        // int i = 0;
        // while(i<10) {
        //     System.out.print(i+" ");
        //     i = i +1;
        // }

        for(int x=0; x<=10; x++) {
            if(x%2 == 0) {
                System.out.print(x + " ");
            }
        } 

        System.out.printf("%n");

        for(int x=11; x>=0; x--) {
            if(x%2 == 0) {
                System.out.print(x + " ");
            }
        } 

        System.out.printf("%n");
        System.out.print("Digite um numero: ");
        
        int number = scann.nextInt();
        for(int i=0; i<=number; i++) {
            System.out.print(i + " ");
        } 
    }
}
