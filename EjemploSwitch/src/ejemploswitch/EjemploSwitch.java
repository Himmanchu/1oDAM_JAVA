/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploswitch;

/**
 *
 * @author javierjimenezsanz
 */
public class EjemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* int month=10;
        String season = "";
        
        if (month ==1 || month == 2 || month == 3){
            season = "Invierno";
        }else if (month == 4 || month == 5 || month == 6){
            season = "Primavera";
        }else if (month == 7 || month == 8 || month == 9){
            season = "Verano";
        }else if (month == 10 || month == 11 || month == 12){
            season = "Otoño";
        }
        
        System.out.println("La estación para el mes : " + month + " es: " + season);*/
       
       String name="Paco";
       int age=30;
       
       if(name=="Paco"){
           if(age<=30){
               if(age==30){
                   System.out.println("Es Paco y tiene 30 años");
               }else {
                   System.out.println("Es Paco y es menor de 30 años");
               }
              
           }else {
               System.out.println("Es paco, pero es mayor de 30 años");
           }
       }else {
           System.out.println("NO es Paco");
       }
    }
  
}
