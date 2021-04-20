/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaswitch;

/**
 *
 * @author Diego
 */
public class EstruturaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1;
        
        switch(a) {
            case 1 :
                System.out.println("Ouro");
            break;
            case 2 :
                System.out.println("Prata");
            break;
            case 3 :
                System.out.println("Bronze");
            break;
            default: 
                System.out.println("Não foi agora");
        }
    }
    
}
