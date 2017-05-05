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
public class exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota ;
	float total = 0;
	int quantidade = 0;
        
        
        do{
            System.out.println("DIGITE A NOTA (DIGITE -1 PARA SAIR)= ");
            
            nota = sc.nextFloat();
        
            if (nota != -1) {
		total += nota;
		quantidade++;
            }
            
        } while(nota != -1);
        
        float media = (total/quantidade);
        System.out.println("MEDIA =  " + media );

    }
    
}
