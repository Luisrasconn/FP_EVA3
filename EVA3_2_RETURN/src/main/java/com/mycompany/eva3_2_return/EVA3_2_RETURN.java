/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_return;

/**
 *
 * @author fdo_g
 */
public class EVA3_2_RETURN {

    public static void main(String[] args) {
      //invocar 
      // SI REGRESA EL RESULTADO TENEMOS DOS OPCIONES
      //HACER ALGO CON EL VALOR
             // GUARDARLO Y USARLO VARIAS VECES
             int valor;
             valor= sumarDosEnteros(200, 40);
             System.out.println("RESULTADO ="+ "" + valor);
             //USARLO UNA SOLA VEZ
             System.out.println("RESULTADO = " + ""+ sumarDosEnteros(200, 40));
      //IGNORAR EL VALOR
        sumarDosEnteros(200, 40);
      
      
    }
    
    //SUMAR DOS ENTEROS
    public static int sumarDosEnteros(int num1 , int num2){
        int resu;
        resu = num1 + num2;
        return resu;
    }
}
