import java.util.Scanner;
public class EJERCICIO_02 {
    //AUTOR pablo velez
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double x, y;
        String seguir = null;
        int seleccion;
        do{
            System.out.println("Selecciona que area deseas calcular");
            System.out.println("[1] -> Area de un cuadrado");
            System.out.println("[2] -> Area de un triangulo");
            System.out.println("[3] -> Area de un rectangulo");
            seleccion = tc.nextInt();
            switch(seleccion){
                case 1:
                    System.out.println("Ingrese el valor del lado del cuadrado: ");
                    x = tc.nextDouble();
                    System.out.println("EL AREA DEL CUADRDO ES: " + cuadrado(x));
                    break;
                case 2:
                    System.out.println("Ingrese el valor de la base del triangulo: ");
                    x = tc.nextDouble();
                    System.out.println("Ingrese el valor de la altura del triangulo: ");
                    y = tc.nextDouble();
                    System.out.println("EL AREA DEL TRIANGULO ES: " + triangulo(x, y));
                    break;
                case 3:
                    System.out.println("Ingrese el valor de la base del rectangulo: ");
                    x = tc.nextDouble();
                    System.out.println("Ingrese el valor de la altura del rectangulo: ");
                    y = tc.nextDouble();
                    System.out.println("EL AREA DEL RECTANGULO ES: " + triangulo(x, y));
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            System.out.println("Quieres seguir con el programa?");
            seguir = tc.next();
        }while(seguir.equals("si"));
    }
    
    public static double cuadrado(double num1){ 
        double respt;
        respt = Math.pow(num1, 2);
        return respt;
    }

    public static double triangulo (double num1, double num2){ 
        double respt;
        respt =+ (num1*num2)/2;
        return respt;
    }

    public static double rectangulo(double num1, double num2){ 
        double respt;
        respt = num1 * num2;
        return respt;
    }
}
/*
Selecciona que area deseas calcular
[1] -> Area de un cuadrado
[2] -> Area de un triangulo
[3] -> Area de un rectangulo
1
Ingrese el valor del lado del cuadrado: 
4
EL AREA DEL CUADRDO ES: 16.0
Quieres seguir con el programa?
si
Selecciona que area deseas calcular
[1] -> Area de un cuadrado
[2] -> Area de un triangulo
[3] -> Area de un rectangulo
2
Ingrese el valor de la base del triangulo: 
3
Ingrese el valor de la altura del triangulo: 
6
EL AREA DEL TRIANGULO ES: 9.0
Quieres seguir con el programa?
si
Selecciona que area deseas calcular
[1] -> Area de un cuadrado
[2] -> Area de un triangulo
[3] -> Area de un rectangulo
3
Ingrese el valor de la base del rectangulo: 
5
Ingrese el valor de la altura del rectangulo: 
3
EL AREA DEL RECTANGULO ES: 7.5
Quieres seguir con el programa?
no
*/