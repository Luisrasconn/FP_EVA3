/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_metodos;

/**
 *
 * @author fdo_g
 */
public class EVA3_1_METODOS {

    public static void main(String[] args) {
       //INVOCAR EL METODO,LLAMAR EL METODO---> USARLO
       imprimirmensaje("HOLA MUNDO!!!!");
    }
    //declaracion del metodo
    //public static (modificadores,opcionales)
    //void valor de retorno
    //imprimirmensaje es el nombre
    //string mensaje parametros
    //son utilies para reutilizar codigo
    public static void imprimirmensaje(String mensaje){ 
        //cuerpo del metodo
        System.out.println("Tu mensaje:"+ mensaje);
        
    }
    
}
