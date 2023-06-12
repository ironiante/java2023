package EstructurasDeControl;

import java.util.Scanner;

public class Ejemplo2EntradaDatos {
    // voy a pedir al usuario que ingrese dos numeros y evaluamos cual es mayor.

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("ingrese primer numero");
        int primernumero= Entrada.nextInt();
        System.out.println("ingrese segundo numero");
        int segundoNumero = Entrada.nextInt();
        if (primernumero > segundoNumero){
            System.out.println("el numero mayor es. " + primernumero);
        }else if (segundoNumero > primernumero){
            System.out.println("el numero mayor es: " + segundoNumero);
        }else {
            System.out.println(" los dos numeros son iguales");
        }


    }
    }