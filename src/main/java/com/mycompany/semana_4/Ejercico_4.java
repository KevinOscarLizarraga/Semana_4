
package com.mycompany.semana_4;

import java.util.Arrays;

/*
EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA COMUNAS DE LA MATRIZ
*/

public class Ejercico_4 {
    
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            double si = 0;
            for (int j = 0; j < matriz.length; j++) {
                matriz[j][i] = (int) (Math.random()*100+1);
                System.out.println(Arrays.toString (matriz [j]));
                si = si + matriz[j][i];
            }
            System.out.println("Suma de la columna "+ i + " =\n" + si + "\n");
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString (matriz [i]));
        }
    }
}
