import java.util.Scanner;
//Integrante: Ángel Daniel Garcia Espino 
//Integrante: Johnatan Cuauhtémoc Vázquez Arciga
// Equipo: 14
public class intervaloEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //En esta parte se introducen los nuemros enteros en variables a, b, c ingresadas por el usuario
        System.out.print("Introducción del valor del entero a: ");
        int a = scanner.nextInt();
        
        System.out.print("Introducción del valor del entero b: ");
        int b = scanner.nextInt();
        
        System.out.print("Introducción del valor del entero c: ");
        int c = scanner.nextInt();
        
        // Se determinar la posición del entero 'c' con respecto al intervalo especificado en la practica [a, b]
        if (c >= a && c <= b) {
            System.out.println("Intervalo");
        } else if (c < a) {
            System.out.println("Izquierda");
        } else {
            System.out.println("Derecha");
        }

        // En esta utima parte de termina la ejecución del problema a traves de Scanner.
        scanner.close();
    }
}