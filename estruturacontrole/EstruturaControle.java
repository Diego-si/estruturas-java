/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacontrole;

/**
 *
 * @author Diego
 */
public class EstruturaControle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1 = 5;
        int valor2 = 10;
        
        if (valor1 > valor2) {
            System.out.println("Valor 1 é maior que valor 2");
        }
        System.out.println("Soma dos valores: " + (valor1 + valor2));
        System.out.printf("Soma  é %d ", valor1 + valor2);
    }
    
}
