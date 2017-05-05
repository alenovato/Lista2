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
public class exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media ;
        
        System.out.println("Digite a primeira nota =  ");
        float nota1 = sc.nextFloat();
        
        System.out.println("Digite a segunda nota =  ");
        float nota2 = sc.nextFloat();
        
        media = ((nota1+nota2)/2);
        
        if (media >= 6){
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("Aluno reprovado");
        }
        System.out.println("Média final =  " + media);
    }
    
}
