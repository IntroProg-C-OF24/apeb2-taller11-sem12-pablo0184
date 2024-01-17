import java.util.Scanner;
public class EJERCICIO_03 {
    // AUTOR PABLO VELEZ
        static int LIM = 4;
        static String[] promedio = new String[LIM];
        public static void main(String[] args) {
            Scanner tc = new Scanner(System.in);
            double[] calificaciones = new double[LIM];
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("INGRESA LA NOTA DEL ALUMNO: " + (i + 1));
                calificaciones[i] = tc.nextDouble();
            }
            cualitativo(calificaciones, promedio);
            presentarPromedio(promedio);
        }

        public static void cualitativo(double notas[], String promedio[]) {
            for (int i = 0; i < notas.length; i++) {
                if ((notas[i] >= 0) & (notas[i] <= 5)) {
                    promedio[i] = "PROMEDIO REGULAR";
                } else {
                    if ((notas[i] >= 5.1) & (notas[i] <= 8)) {
                        promedio[i] = "PROMEDIO BUENO";
                    } else {
                        if ((notas[i] >= 8.1) & (notas[i] <= 9)) {
                            promedio[i] = "PROMEDIO MUY BUENO";
                        } else {
                            promedio[i] = "PROMEDIO SOBRESALIENTE";
                        }
                    }
                }
            }
        }

        public static void presentarPromedio(String promedio[]) {
            for (int i = 0; i < promedio.length; i++) {
                System.out.println("El estudiante numero " + (i + 1) + " tiene una nota " + promedio[i]);
            }
        }
    }
/*
INGRESA LA NOTA DEL ALUMNO: 1
1
INGRESA LA NOTA DEL ALUMNO: 2
5
INGRESA LA NOTA DEL ALUMNO: 3
8
INGRESA LA NOTA DEL ALUMNO: 4
10
El estudiante numero 1 tiene una nota PROMEDIO REGULAR
El estudiante numero 2 tiene una nota PROMEDIO REGULAR
El estudiante numero 3 tiene una nota PROMEDIO BUENO
El estudiante numero 4 tiene una nota PROMEDIO SOBRESALIENTE
*/
