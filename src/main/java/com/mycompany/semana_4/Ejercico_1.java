
package com.mycompany.semana_4;
   
import java.util.Arrays;

 /*
EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO SUME LA DIAGONAL PRIMARIA Y SECUNDARIA
*/

public class Ejercico_1 {

    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        double d1 = 0;
        double d2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random()*100+1);
                if(i==j){
                    d1 = d1 + matriz[i][j];
                }              
                if(i+j == matriz.length-1){
                    d2 = d2 + matriz[i][j];
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString (matriz [i]));
        }
        System.out.println("\nDiagonal Principal\n" + d1);
        System.out.println("\nDiagonal Secundaria\n" + d2);
    }
}
