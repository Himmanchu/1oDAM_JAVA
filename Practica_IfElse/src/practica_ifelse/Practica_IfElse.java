/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_ifelse;

/**
 *
 * @author javierjimenezsanz
 */
public class Practica_IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int horas= 44; //cantidad horas
        int extra= horas -40;  //cantidad horas extra
        int sueldoHora=16; //sueldo por hora normal
        int sueldoExtra=20;   //sueldo por hora extra
        int sueldoFinal=(horas*sueldoHora) + (extra*sueldoExtra);  //sueldo total
        
        if (horas <=40) {
        System.out.println("El sueldo por " + horas + " horas es: " + sueldoFinal + " €");
    }
        else{
            System.out.println("El sueldo por "+ (horas-extra) + " horas y " + extra + " horas extra es: " + sueldoFinal + " €");
        }
        
    }
    
}
