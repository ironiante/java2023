package tiposDatosPrimitivos;

public class OperadoresDeAsignacion {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("Valor original de a: " + a);
        System.out.println("Valor original de b: " + b);

        // Operadores de asignación
        a += 2; // a = a + 2;
        b *= 4; // b = b * 4;

        System.out.println("Valor de a después de la asignación: " + a);
        System.out.println("Valor de b después de la asignación: " + b);
    }
}
