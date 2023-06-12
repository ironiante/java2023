public class OperadoresAritmeticos {
    /**
     * Operadores aritméticos:
     *
     * Suma (+): suma dos operandos.
     * Resta (-): resta dos operandos.
     * Multiplicación (*): multiplica dos operandos.
     * División (/): divide el primer operando por el segundo operando.
     * Módulo (%): devuelve el resto de la división del primer operando por el segundo operando.
     * Incremento (++): incrementa el valor de una variable en 1.
     * Decremento (--): decrementa el valor de una variable en 1.
     */
    public static void main(String[] args) {

                int a = 5;
                int b = 2;
                int c = 4;

                int resultado1 = a * b + c; // Multiplicación y suma
                int resultado2 = a + b * c; // Suma y multiplicación
                int resultado3 = (a + b) * c; // Suma y multiplicación con paréntesis

                double resultado4 = Math.pow(a, b); // Potencia utilizando la función Math.pow()
                double resultado5 = Math.sqrt(resultado4); // Raíz cuadrada utilizando la función Math.sqrt()

                int resultado6 = resultado1 % resultado2; // Módulo

                System.out.println("Resultado 1: " + resultado1);
                System.out.println("Resultado 2: " + resultado2);
                System.out.println("Resultado 3: " + resultado3);
                System.out.println("Resultado 4: " + resultado4);
                System.out.println("Resultado 5: " + resultado5);
                System.out.println("Resultado 6: " + resultado6);
            }
        }



