/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradasalida;
import java.util.Scanner;
/**
 *
 * @author javierjimenezsanz
 */
public class EntradaSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     /*   Scanner entrada= new Scanner (System.in);
        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();
        
        System.out.println("El número que has puesto es: " +numero);
        
        /*System.out.print("Dime tu nombre: ");
        String nombre = entrada.next();
        System.out.println("Te llamas " + nombre);*/
        
        /*System.out.print("Dime tu altura: ");
        float altura = entrada.nextFloat();
        System.out.println("Tu altura por dos: " + 2* altura);
        
        System.out.print("Dime tu nombre completo: ");
        entrada.nextLine();
        String nombreCompleto = entrada.nextLine();
        System.out.println("Tu nombre completo es: " +nombreCompleto);*/
        
        
        
        int month= 6;
        String season="";
        
        switch(month){
            case 1: case 2: case 12:
                season = "Invierno";
                break;
            case 3: case 4: case 5:
                season = "Primavera";
                break;
            case 6: case 7: case 8:
                season = "Verano";
                break;
            case 9: case 10: case 11:
                season = "Otoño";
                break;
            default:
                season = "MES INCORRECTO";
      }
        
        System.out.println("El mes "+month + " corresponde a la temporada de " + season);
        
    }
    
}
