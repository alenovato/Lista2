
package exercicio12;

import java.util.Scanner;

/* @author Vinicius */

public class Exercicio12 {

    public static void main(String[] args) {
        float hipotenusa ;
        float rhipotenusa ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro cateto: ");
        float pcat = sc.nextFloat();
        
        System.out.println("Informe o primeiro cateto: ");
        float scat = sc.nextFloat();
        
        hipotenusa =  ((float) Math.pow(pcat, 2) + (float) Math.pow(scat, 2)) ;
        rhipotenusa = (float)Math.pow(hipotenusa, (1.0/2));
        
        System.out.println("O valor da hipotenusa é :" + rhipotenusa);
    }
    
}
