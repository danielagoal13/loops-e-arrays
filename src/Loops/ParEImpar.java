package Loops;

import java.util.Scanner;

public class ParEImpar {
      public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

    int amount;

    System.out.print("Digite a quantidade de numeros: ");
            amount = scan.nextInt();

    double[] number = new double[amount];
    String pair = "";
    String odd = "";
    int amountPair = 0, amountOdd = 0;
    int i = 0;

    do{
        System.out.print("Digite um numero "  + (i + 1) + ": ");
            number[i] = scan.nextDouble();
        
        if(number[i] % 2 == 0){
            pair += number[i] + "-";
            amountPair++;
         }
         else{
            odd += number[i] + "-";
            amountOdd++;
         }

         i++;
    }
    while(i < amount);

    System.out.println("\nOs números pares são: " + pair);
    System.out.println("\nA quantidade de números pares são: " + amountPair);
    System.out.println("\nOs números impares são: " + odd);
    System.out.println("\nA quantidade de números impares são: " + amountOdd);

    }
}
