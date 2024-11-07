/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA3_3_CAPTURA {

    public static void main(String[] args) {
        String nombre= capturarTexto("INTRODUCE TU NOMBRE");
        String apellido= capturarTexto("INTRODUCE TU NOMBRE");
        String edadd = imprimirEdad("ITRODUCE TU EDAD :");
        System.out.println("NOMBRE:"+""+nombre);
        System.out.println("APELLIDO:"+""+apellido);
        System.out.println("TU EDAD ES:"+ edadd);
        
    }
    public static String capturarTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        String texto;
        System.out.println(mensaje);
        texto=captu.nextLine();
        return texto;
       
}
     public static String imprimirEdad(String eda){
         Scanner captu = new Scanner(System.in);
         String edad;
         System.out.println("SU EDAD ES "+ eda);
         edad=captu.nextLine();
        return edad;
         
     }
      public static double capturarDouble(String mensaje){
         Scanner captu = new Scanner(System.in);
         double num;
         System.out.println("SU EDAD ES "+ eda);
         edad=captu.nextLine();
        return edad;
}
