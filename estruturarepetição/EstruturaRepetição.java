/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturarepetição;

/**
 *
 * @author Diego
 */
public class EstruturaRepetição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*for (int i = 0; i < 10; i++) {
           System.out.print(i);
        }
        */
        //int i = 1;
        
        /*while(i<=10) {
           System.out.println(i);
           i++;
        }
        */
        
        /*do {
           System.out.print(i);
           i++;
        } while (i<=10);
        */
        
        /*for (int i=1; i<=8; i++) {
            if (i == 3) {
                continue;
            } else if (i == 5) {
                continue;
            } else if (i == 7) {
                break;
            }         
            System.out.println(i);
        } 
        */
        int soma = 0;
        int impar = 0;
        int somapa = (( 0 + 7 ) * 3 )/2;
        
        for (int i = 0; i <= 7; i++) {
            if ( i % 2 == 0 ){
                soma += i;
            } else if ( i % 2 == 1) {
                impar = impar + i; 
            }
        }
        System.out.printf("A soma dos pares e %d \n" , soma);
        System.out.printf("Soma dos impares e %d \n", impar);
        System.out.println("A soma da P.A é " + somapa);
    }
    
}
