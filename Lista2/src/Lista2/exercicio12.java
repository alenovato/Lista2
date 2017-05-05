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
public class exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float hipotenusa ;
        float resultadohipotenusa ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro cateto: ");
        float cat1 = sc.nextFloat();
        
        System.out.println("Digite o primeiro cateto: ");
        float cat2 = sc.nextFloat();
        
        hipotenusa =  ((float) Math.pow(cat2, 2) + (float) Math.pow(cat2, 2)) ;
        resultadohipotenusa = (float)Math.pow(hipotenusa, (1.0/2));
        
        System.out.println("O valor da hipotenusa é :" + resultadohipotenusa);
    }
    
}
