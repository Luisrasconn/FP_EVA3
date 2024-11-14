/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_examen_2da;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA3_5_EXAMEN_2DA {
    //CONSTANTE:VARIABLE QUE SE LE ASIGNA UNA SOLA VEZ EL VALOR
   public  static final int PIEDRA=1;
   public static final int PAPEL = 2;
   public static final int TIJERA=3;
   public  static final int EMPATE =0;
   public  static final int GANA = 1;
   public  static final int PIERDE = 2 ;

    public static void main(String[] args) {
        
        int resu;
        int jugada;
        int resujug;
        do{
            
         resu= pedirJuagada("INTRODUCE TU JUGADA (1-PIEDRA , 2-PAPEL , 3-TIJERAS,0-SALIR)");
         jugada =generarJugada();
         resujug=evaluarParitda(resu, jugada);
         System.out.println(resujug);
        }while(resu !=0);
         jugada = generarJugada();
        System.out.println(jugada);
        
    }
    //PEDIR DATOS AL USUARIO
    public static int pedirJuagada(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int seleccion = captu.nextInt();
        return seleccion;
    }
    
    //GENERAR LA JUGADA DE LA COMPUTADORA
    public static int generarJugada (){
        int jugada;
         double valor = Math.random();
        //¿COMO GENERAMOS LA JUGADA?
        if( valor>=0 && valor <1.0/3.0)
            jugada = PIEDRA;
        else if( valor>=0.3 && valor <2.0/3.0)
            jugada = PAPEL;
        else
            jugada=TIJERA;
        return jugada;
    }
    //evaluar la jugada
    public static int evaluarParitda(int jugadausu, int jugadacomp){
        int resu;
        if(jugadausu == PIEDRA && jugadacomp== PIEDRA)
            
            resu = EMPATE;
        else if((jugadausu == PIEDRA) && (jugadacomp== PAPEL))
            resu=PIERDE;
        else if(jugadausu == PIEDRA && jugadacomp== TIJERA)
            resu = GANA;
        else if(jugadausu == PAPEL && jugadacomp== PIEDRA)
            resu = GANA;
        else if(jugadausu == PAPEL && jugadacomp== PAPEL)
            resu=EMPATE;
        else if(jugadausu == PAPEL && jugadacomp== TIJERA)
            resu = PIERDE;
        else if(jugadausu == TIJERA && jugadacomp== PIEDRA)
            resu=PIERDE;
            else if(jugadausu == TIJERA && jugadacomp== PAPEL)
                resu = GANA;
              
            else
                resu = EMPATE;
        return resu;
    }
}
