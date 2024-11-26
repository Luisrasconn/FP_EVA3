/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tic_tac_toe_2;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class TIC_TAC_TOE_2 {
   public static final int Unouno = 11;
    public static final int unodos = 12;
    public static final int unotres = 13;
    public static final int dosuno = 21;
    public static final int dosdos = 22;
    public static final int dostres = 23;
    public static final int tresuno = 31;
    public static final int tresdos = 32;
    public static final int trestres = 33;

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int[][] tablero = new int[3][3];

        inicializarTablero(tablero);

        while (true) {
            
            System.out.println("TURNO DEL JUGADOR");
    int filaJugador = pedirFila("ELIGE UNA FILA (1-3): ");
    int columnaJugador = pedirColumna("ELIGE UNA COLUMNA (1-3): ");

    while (tablero[filaJugador - 1][columnaJugador - 1] != 0) {
        System.out.println("POSICION OCUPADA, INTENTA DE NUEVO");
        filaJugador = pedirFila("ELIGE UNA FILA (1-3): ");
        columnaJugador = pedirColumna("ELIGE UNA COLUMNA (1-3): ");
    }

    tablero[filaJugador - 1][columnaJugador - 1] = 1;
    imprimirTablero(tablero);

    int resultado = evaluarPartida(tablero);
    if (resultado == 1) {
        System.out.println("GANASTE");
        break;
    }

    // TURNO DE LA COMPUTADORA
    System.out.println("TURNO DE LA COMPUTADORA");
    int filaCompu, columnaCompu;
    do {
        filaCompu = (int) (Math.random() * 3);
        columnaCompu = (int) (Math.random() * 3);
    } while (tablero[filaCompu][columnaCompu] != 0);

    tablero[filaCompu][columnaCompu] = 2;
    imprimirTablero(tablero);

    resultado = evaluarPartida(tablero);
    if (resultado == 2) {
        System.out.println("¡GANO LA COMPUTADORA!");
        break;
    }
        }

        captu.close();
    }

    public static int pedirFila(String mensaje) {
        Scanner captu = new Scanner(System.in);
        System.out.print(mensaje);
        return captu.nextInt();
    }

    public static int pedirColumna(String mensaje) {
        Scanner captu = new Scanner(System.in);
        System.out.print(mensaje);
        return captu.nextInt();
    }

    public static void inicializarTablero(int[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0; 
            }
        }
    }

    public static void imprimirTablero(int[][] tablero) {
    System.out.println("Tablero actual:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (tablero[i][j] == 0) {
                System.out.print("-"); 
            } else if (tablero[i][j] == 1) {
                System.out.print("X"); // Marca del jugador
            } else {
                System.out.print("O"); // Marca de la computadora
            }
            System.out.print(" "); 
        }
        System.out.println(); // Nueva línea al final de cada fila
    }
    }

    public static int evaluarPartida(int[][] tablero) {
    for (int i = 0; i < 3; i++) {
        // Verificar filas
        if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != 0) {
            return tablero[i][0];
        }
        // Verificar columnas
        if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[0][i] != 0) {
            return tablero[0][i]; 
        }
    }
    // Verificar diagonales
    if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != 0) {
        return tablero[0][0]; 
    }
    if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != 0) {
        return tablero[0][2]; // Retorna el jugador que ganó
    }
    return 0; 
}
    
}

