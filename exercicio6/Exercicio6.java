package exercicio6;

import java.util.Scanner;

/* @author Vinicius */

public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media ;
        
        System.out.println("Informe a primeira nota: ");
        float pnota = sc.nextFloat();
        
        System.out.println("Informe a segunda nota ");
        float snota = sc.nextFloat();
        
        media = ((pnota+snota)/2);
        
        if (media >= 6){
            System.out.println("Aluno aprovado !!!");
        }
        else{
            System.out.println("Aluno reprovado !!!");
        }
        System.out.println("Sua média é : " + media);
    }
    
}
