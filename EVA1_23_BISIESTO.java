/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_23_bisiesto;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA1_23_BISIESTO {

    public static void main(String[] args) {
       
        //SABER SI ES MULTIPLE DE 4
        //RESIDUO=0---> LA DIVISION ES EXACTA
        //MODULO---> CALCULA EL RESIDUO---->
        int year;
        Scanner captu=new Scanner(System.in);
        System.out.println("INTRODUCE TU ANIO");
         year=captu.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0 ){
           System.out.println("ANIO BISISESTO"); 
        }else{
             System.out.println("ANIO NO BISISESTO");
        }
    }
}
