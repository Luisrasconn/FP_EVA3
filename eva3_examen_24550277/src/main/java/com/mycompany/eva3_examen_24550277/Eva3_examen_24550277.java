/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_examen_24550277;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class Eva3_examen_24550277 {
          public static int califa;
    public static double sumacal = 0, prom;
    public static int calimay = 0, acum = 0, calibaja=0;

    public static void main(String[] args) {
        System.out.println(calcularpromedio());
        System.out.println("Sumatoria de calificaciones: " + sumacal);
        System.out.println("El Promedio es: " + prom);
        System.out.println("La calificación mayor es: " + califamayor());
        System.out.println("La calificacion mas baja es:" + calibaja());
        
    }

    public static int calcularpromedio() {
        Scanner captu = new Scanner(System.in);

        System.out.println("Cuantos estudiantes hay");
        double numest = captu.nextInt();

        for (int i = 1; i <= numest; i++) {
            System.out.println("ESTUDIANTE # " + i);
            System.out.println("CUAL ES TU CALIFICACION");
            califa = captu.nextInt();
            sumacal += califa;

            
        } 

        prom = sumacal / numest;

        return califa;
    }

    public static int califamayor() {
        if (califa > calimay) {
                calimay = califa;
        }
        return calimay;
    }
     public static int calibaja() {
        if (califa < calibaja) {
             calibaja = califa;
        }
        return calibaja;
}
     }
     

   
   
   
    
