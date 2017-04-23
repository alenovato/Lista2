package exercicio8;

import java.util.Scanner;

/* @author Vinicius */

public class Exercicio8 {

    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
        
       System.out.println("Informe o numero : ");
       int numero = sc.nextInt(); 
       
       String bin = Integer.toString(numero, 2);
       
       System.out.println("Seu numero em binario é : " + bin);
        
    }
}
