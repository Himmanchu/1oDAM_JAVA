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
        int ano;
        
        Scanner entradaDia = new Scanner (System.in);
        System.out.print("Introduce un día: ");
        dia = entradaDia.nextInt();
        while(dia<1||dia>31){
            System.out.print("Este día no es válido. Introduce uno nuevo: ");
            dia = entradaDia.nextInt();
        }
   
        Scanner entradaMes = new Scanner (System.in);
        System.out.print("Introduce mes: ");
        mes = entradaMes.nextInt();
        
            while(((dia==31) && (mes==4 || mes==6 || mes==9 || mes==11)) || ((dia>28) && (mes==2))){
                switch(mes){
                    case 4, 6, 9, 11:
                        System.out.print("Este mes solo tiene 30 días. Introduce otro mes: ");
                        mes = entradaMes.nextInt();
                        break;
                    case 2:
                        System.out.print("Febrero tiene 28 días. Introduce otro mes: ");
                        mes = entradaMes.nextInt();
                        break;
                    default:
                        mes = entradaMes.nextInt();
                }
                
                   while(mes>12 || mes<1){
                      System.out.print("NO EXISTE ESTE MES. Introdúcelo otra vez: ");
                        mes = entradaMes.nextInt();
            }
                    }
              //AL PONER EL WHILE ANTES DEL SWITCH, EL DEFAULT NO ME HARÍA FALTA PORQUE YA COMPLETA LAS OPCIONES DE MESES      
            
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
                   
                    }
                      
            
            Scanner entradaAno = new Scanner (System.in);
            System.out.print("Introduce año: ");
            ano = entradaAno.nextInt();
                while(ano<0){
                    System.out.print("El año no puede ser inferior a 0. Introduce otro año: ");
                    ano = entradaAno.nextInt();
                }
                System.out.println("La fecha introducida es: "+ dia + " de " + mesTexto + " de " + ano +".");
         }

    }


