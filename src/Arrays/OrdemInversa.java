package Arrays;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

    int i = 0;
    int[] number = new int[5];
    String inversa = "";

    do{
        System.out.print("Digite um numero "  + (i + 1) + ": ");
            number[i] = scan.nextInt();
            i++;
    }
    while(i < 5);

    for (i = 4; i >= 0; i--){
        inversa += number[i] + " ";         
    }

     System.out.print("A ordem inversa do vetor é: " + inversa);
       
    }
}
