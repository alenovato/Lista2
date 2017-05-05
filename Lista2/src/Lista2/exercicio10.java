/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import javax.swing.JOptionPane;

/**
 *
 * @author alexandre
 */
public class exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] cityObject = new Object[5];
        String userCity;

	int count = 0;

	do {
            userCity = JOptionPane.showInputDialog(null, "Digite a cidade");
            
            if (!userCity.equals("")) {
            cityObject[count] = userCity;
            System.out.println(cityObject[count]);
            count++;
            }
	} while (count < 5);

        JOptionPane.showInputDialog(null, "Escolha uma cidade", "Cidades", JOptionPane.INFORMATION_MESSAGE, null,
        cityObject, cityObject[0]);
    }
    
}
