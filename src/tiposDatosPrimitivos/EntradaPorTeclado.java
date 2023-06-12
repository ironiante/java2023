package tiposDatosPrimitivos;

import java.util.Scanner;

public class EntradaPorTeclado {
    /**
     * En este ejemplo, utilizamos la clase Scanner para leer la entrada del usuario desde la consola. Primero, creamos
     * un objeto Scanner y lo asociamos con la entrada estándar (System.in). Luego, utilizamos los métodos nextLine() y
     * nextInt() para leer una cadena de caracteres (nombre) y un número entero (edad) ingresados por el usuario.
     *
     * Finalmente, imprimimos los datos ingresados por el usuario utilizando System.out.println(). Recuerda cerrar el
     * objeto Scanner llamando al método close() para liberar los recursos utilizados.
     *
     * Al ejecutar este programa, se mostrarán los mensajes solicitando al usuario que ingrese su nombre y edad. Después
     * de que el usuario ingrese los valores correspondientes, se imprimirán los datos ingresados.
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // solicitar al usuario que ingrese su nombre
        System.out.println("por favor ingrese su nombre: ");
        String nombre = scanner.nextLine();
        // solicitar al usuario que ingrese su edad
        System.out.println(" por favor ingrese su edad: ");
        int edad = scanner.nextInt();
        //imprima los datos ingresados por el usuario.
        String datos= "los datos del usuario son: su nombre es:  " +nombre+ "  y su edad en años es : " + edad ;
        System.out.println(datos);
    }
}
