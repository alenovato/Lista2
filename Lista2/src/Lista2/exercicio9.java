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
public class exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o numero da matriz = ");
        int matriz = sc.nextInt();
        
        for (int i = 0; i < matriz + 1 ; i++) {
            
            for (int x = 0; x < matriz; x++) {
            System.out.println("|" + x + "|" + i + "|");
            }
        }
    }
    
}
