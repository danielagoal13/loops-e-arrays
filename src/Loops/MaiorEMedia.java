package Loops;

import java.util.Scanner;

public class MaiorEMedia {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

    double[] number = new double[5];
    double bigger = number[0];
    double average = number[0];
    double sum = number[0];
    int i = 0;


    do{
        System.out.print("Digite um numero "  + (i + 1) + ": ");
            number[i] = scan.nextDouble();
        
        if(number[i] > bigger){
            bigger = number[i];
        }
        
        if(i < 5){
            sum += number[i];
            average = sum / 5;
        }
         i++;
    }
    while(i < 5);

    System.out.println("\nO maior numero é: " + bigger);
    System.out.println("\nA media dos numeros é: " + average);

    }
}
