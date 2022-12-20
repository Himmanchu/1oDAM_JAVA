/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplodowhile;

/**
 *
 * @author javierjimenezsanz
 */
public class EjemploDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int counter =0;
        int limit =10;
        
        do{
            System.out.println("Counter: " + counter);
            counter ++;
        }while(counter < limit);
    }
    
}
