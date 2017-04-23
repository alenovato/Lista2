package exercicio4;

import java.util.Scanner;

/* @author Vinicius */
public class Exercicio4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        double numero = sc.nextDouble();
        
        if (numero % 2 == 0){
            System.out.println("Seu número é par !!!");
        }
        
        else {
            System.out.println("Seu número é impar !!!");
        }
    }
    
}
