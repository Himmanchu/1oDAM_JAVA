/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_bucles;
import java.util.Scanner;

/**
 *
 * @author javierjimenezsanz
 */
public class Practica_Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dia;
        int mes;
        String mesTexto="";
        int año;
        
        Scanner entradaDia = new Scanner (System.in);
        System.out.print("Introduce un día del mes: ");
        dia = entradaDia.nextInt();
        
        
        
        Scanner entradaMes = new Scanner (System.in);
        System.out.print("Introduce mes: ");
        mes = entradaMes.nextInt();
        
         while(mes>12 || mes<1){
                      System.out.print("NO EXISTE ESTE MES. Introdúcelo otra vez.");
        mes = entradaMes.nextInt();
            }
            switch(mes){
                case 1 : 
                    mesTexto= "Enero";
                    break;
                case 2 : 
                    mesTexto= "Febrero";
                    break;    
                case 3 : 
                    mesTexto= "Marzo";
                    break;
                case 4 : 
                    mesTexto= "Abril";
                    break; 
                case 5 : 
                    mesTexto= "Mayo";
                    break;
                case 6 : 
                    mesTexto= "Junio";
                    break;    
                case 7 : 
                    mesTexto= "Julio";
                    break;
                case 8 : 
                    mesTexto= "Agosto";
                    break;
                case 9 : 
                    mesTexto= "Septiembre";
                    break; 
                case 10 : 
                    mesTexto= "Octubre";
                    break;
                case 11 : 
                    mesTexto= "Noviembre";
                    break;    
                case 12 : 
                    mesTexto= "Diciembre";
                    break;
                    
          //AL PONER EL WHILE ANTES DEL SWITCH, EL DEFAULT NO ME HARÍA FALTA PORQUE YA COMPLETA LAS OPCIONES DE MESES      
               // default : 
                 //   mesTexto= "NO EXISTE ESTE MES";

    }
           System.out.print(mesTexto);
        
    
    }
}

