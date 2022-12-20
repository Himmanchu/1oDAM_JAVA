/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplowhilei;
import java.util.Scanner;

/**
 *
 * @author javierjimenezsanz
 */
public class EjemploWhileI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* int counter =0;
        int limit =10;
        
        while(counter < limit){
            System.out.println("Counter es: "+ counter);
            counter ++;*/
       
       System.out.println("Introduce un número: ");
       int maxElements;
       Scanner entrada= new Scanner (System.in);
       maxElements = entrada.nextInt();
       int counter=0;
       
       while (counter < maxElements){
           System.out.println("Counter: "+counter);
           counter++;
       
        }
    }
    
}
