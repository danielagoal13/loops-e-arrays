package Loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
    double nota;

    do{
         System.out.print("Nota: ");
            nota = scan.nextDouble();
    }
    while(nota < 0 || nota > 10);

    System.out.println("Sua nota é: " + nota);
    }
    
    }
