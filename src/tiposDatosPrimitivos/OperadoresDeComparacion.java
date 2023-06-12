package tiposDatosPrimitivos;

public class OperadoresDeComparacion {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Operadores de comparación
        boolean igual = (a == b); // Igual a
        boolean distinto = (a != b); // Distinto de
        boolean mayor = (a > b); // Mayor que
        boolean menor = (a < b); // Menor que
        boolean mayorIgual = (a >= b); // Mayor o igual que
        boolean menorIgual = (a <= b); // Menor o igual que

        System.out.println("a == b: " + igual);
        System.out.println("a != b: " + distinto);
        System.out.println("a > b: " + mayor);
        System.out.println("a < b: " + menor);
        System.out.println("a >= b: " + mayorIgual);
        System.out.println("a <= b: " + menorIgual);
    }
}
