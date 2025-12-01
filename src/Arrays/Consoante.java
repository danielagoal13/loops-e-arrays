package Arrays;

import java.util.Scanner;

public class Consoante {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

    int count = 0;
    int quantidadeConsoantes = 0;
    String[] consoantes = new String[6];
    

    do{
        System.out.print("Digite uma letra: ");
            String letra = scan.next();
        if (!(letra.equalsIgnoreCase("a") |
              letra.equalsIgnoreCase("e") |
              letra.equalsIgnoreCase("i") |
              letra.equalsIgnoreCase("o") |
              letra.equalsIgnoreCase("u"))) {

            consoantes[count] = letra;
            quantidadeConsoantes++;
            
        }

        count++;
            
    }
    while(count < consoantes.length);

    System.out.print("Consoantes: ");

    for (String consoante : consoantes) {
        if(consoante != null){

            System.out.print(consoante + " ");

        }      
    }
    }
}
