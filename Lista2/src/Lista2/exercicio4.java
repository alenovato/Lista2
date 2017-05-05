/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author alexa_bul66n2
 */
public class exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = sc.nextDouble();
        
        if (num % 2 == 0){
            System.out.println("Esse númeiro é par");
        }
        
        else {
            System.out.println("Esse número é ímpar");
        }
    }
    
}
