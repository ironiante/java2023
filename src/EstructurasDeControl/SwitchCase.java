package EstructurasDeControl;

import java.util.Scanner;

public class SwitchCase {

    /**
     *  Permite evaluar una variable y ejecutar diferentes bloques de código según el valor de la variable.
     *  El break es una palabra clave utilizada dentro de un bloque case en un switch-case para finalizar la ejecución
     *  del switch y salir del bloque. Cuando se encuentra un break dentro de un case, el programa salta a la siguiente
     *  línea de código después del bloque switch, evitando que se ejecuten los bloques de código de otros case que le
     *  sigan. Esto se conoce como "romper" o "salir" del switch.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la calificacion");
        String calificacion = entrada.nextLine();
        switch (calificacion){
            case "A":
                System.out.println("Excelente");
                break;
            case "B":
                System.out.println("Bueno");
                break;
            case "C" :
                System.out.println("Regular");
                break;
            default:
                System.out.println("Desaprobado");



        }
    }
}
