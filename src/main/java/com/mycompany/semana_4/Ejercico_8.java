
package com.mycompany.semana_4;

import java.util.Arrays;

/*
EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA FILAS PARES DE LA MATRIZ
 */

public class Ejercico_8 {
    
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random()*100+1);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString (matriz [i]));
        }
    }
}
