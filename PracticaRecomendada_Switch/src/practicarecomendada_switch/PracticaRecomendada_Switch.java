/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicarecomendada_switch;
import java.util.Scanner;
/**
 *
 * @author javierjimenezsanz
 */
public class PracticaRecomendada_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //A través de un Scanner vamos a introducir un dato en la consola
        Scanner entrada=new Scanner (System.in);
        
        System.out.print("Introduce tu nota: ");
        int nota = entrada.nextInt();
        String calificacion="";
        
        switch(nota){
            case 0: case 1: case 2: case 3: case 4: 
                calificacion = "Suspenso";
                break;
            case 5: case 6:
                calificacion = "Aprobado";
                break;
            case 7: case 8:
                calificacion = "Notable";
                break;
            case 9: case 10:
                calificacion = "Sobresaliente";
                break;
            default:
                calificacion = "NOTA NO VÁLIDA";
    }
        
        System.out.println("Tu calificación es de: "+ calificacion);
        
        
    }
    
}
