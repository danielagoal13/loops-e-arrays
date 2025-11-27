package Loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int resultado = 1;
        
      
        System.out.print("Digite o número do fatorial que deseja calcular: ");
            fatorial = scan.nextInt();

        for (int i = fatorial; i >= 1; i-- ){
            resultado= resultado * i;
        }
         System.out.print("\n"  + fatorial + "! : " + resultado);
    }
}