/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author alexandre
 */
public class exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
       System.out.println("Digite um numero =  ");
       int numero = sc.nextInt(); 
       
       String bin = Integer.toString(numero, 2);
       
       System.out.println("O binário de " +numero);
       System.out.println("é =  " +bin);
    }
    
}
