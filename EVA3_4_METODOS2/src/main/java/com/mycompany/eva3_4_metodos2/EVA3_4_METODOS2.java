/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_metodos2;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA3_4_METODOS2 {

    public static void main(String[] args) {
       System.out.println("MAYOR DE 18 Y 90"+ buscarMayor(18, 0));
        System.out.println(buscarDiaSemana(6));
    }
     public static int buscarMayor(int num1, int num2){
        int resu;
        
        if(num1>num2){
            return num1; 
        }else{
            return num2;
           
        }
        }
     public static String buscarDiaSemana(int dia){
        
       switch(dia){
           case 1 :
                return "lunes"; 
                
                case 2 :
                return "martes"; 
               
                case 3 :
                return "miercoles"; 
          
                case 4 :
                 return "jueves"; 
                
                case 5 :
                return "viernes"; 
              
                case 6 :
                return "sabado"; 
                
                case 7 :
                return "domingo"; 
                
                default:
                    return "dia no valido";
                   
               
       }
       
}
}
