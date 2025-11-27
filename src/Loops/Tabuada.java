package Loops;

 import java.util.Scanner;

public class Tabuada {
      public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

    int multiplicador;
    int resultado;
      
        System.out.print("Digite o número do multiplicador da tabuada desejada: ");
                multiplicador = scan.nextInt();
        System.out.print("Tabuada do "  + multiplicador + ": ");
        
        for ( int i = 0;i <= 10; i++){
            resultado = i * multiplicador;
            System.out.print("\n- "  + multiplicador + " x "+ i + " = " + resultado);
        }
        

    }
}