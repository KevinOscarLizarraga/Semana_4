
package com.mycompany.semana_4;

import java.util.Arrays;

/*
EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA FILAS DE LA MATRIZ 
*/

public class Ejercico_3 {
    
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        for (int i = 0; i < matriz.length; i++) {
            double si = 0;
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random()*100+1);
                si = si + matriz[i][j];
            }
            System.out.println(Arrays.toString (matriz [i]));
            System.out.println("Suma de la fila "+ i + " =\n" + si + "\n");
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString (matriz [i]));
        }
    }
}
