
import java.util.Scanner;
import java.util.Random;
//autor PABLO VELEZ

public class EJERCICIO_01 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int filas = 0, columnas = 0;
        System.out.println("Ingrese las filas");
        filas = tc.nextInt();
        System.out.println("Ingresa las columnas");
        columnas = tc.nextInt();
        int matriz1[][] = new int[filas][columnas];
        int matriz2[][] = new int[filas][columnas];
        int matriz3[][] = new int[filas][columnas];
        llenarMatriz(matriz1, filas, columnas);
        System.out.println("Matriz principal:");
        System.out.println(presentarMatriz(matriz1, filas, columnas));
        pares(matriz1, matriz2, filas, columnas);
        System.out.println("pares:");
        System.out.println(presentarMatriz(matriz2, filas, columnas));
        impares(matriz1, matriz3, filas, columnas);
        System.out.println("impares:");
        System.out.println(presentarMatriz(matriz3, filas, columnas));
        System.out.println("PROMEDIO DE LOS VALORES: " + promedio(matriz1, filas, columnas));
    }

    public static void llenarMatriz(int matriz[][], int limF, int limC) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                matriz[i][j] = (int) (Math.random() * (9 - 0 + 1) + 0);
            }
        }
    }

    public static String presentarMatriz(int matriz[][], int limF, int limC) {
        String cadena = "";
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                cadena += String.format("%d\t", matriz[i][j]);
            }
            cadena += "\n";
        }
        return cadena;
    }

    public static void pares(int matriz1[][], int matriz2[][], int limF, int limC) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                if ((matriz1[i][j] % 2) == 0) {
                    matriz2[i][j] = matriz1[i][j];
                } else {
                    matriz2[i][j] = 0;
                }
            }
        }
    }

    public static void impares(int matriz1[][], int matriz3[][], int limF, int limC) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                if ((matriz1[i][j] % 2) != 0) {
                    matriz3[i][j] = matriz1[i][j];
                } else {
                    matriz3[i][j] = 0;
                }
            }
        }
    }

    public static double promedio(int matriz1[][], int limF, int limC) {
        double promedio = 0;
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                promedio += matriz1[i][j];
            }
        }
        promedio = promedio / (limF * limC);
        return promedio;
    }
}
/*
Ingrese las filas
2
Ingresa las columnas
3
Matriz principal:
0	8	9	
7	8	7	

pares:
0	8	0	
0	8	0	

impares:
0	0	9	
7	0	7	

PROMEDIO DE LOS VALORES: 6.5
*/