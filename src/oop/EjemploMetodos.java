package oop;

public class EjemploMetodos {
    public static void main(String[] args) {

        EjemploMetodos ejemplo = new EjemploMetodos();
        int resultadoSuma = ejemplo.sumar(8,10);
        System.out.println("el resultado de la suma es : " + resultadoSuma);
        double resultadoMultiplicacion = ejemplo.multiplicar(23.5,52.8);
        System.out.println(" el resultado de la multiplicacion es : " + resultadoMultiplicacion);
        int resultadoFactorial = ejemplo.factorial(6);
        System.out.println(" reultado del factorial " + resultadoFactorial);

    }
    public int sumar(int a,int b){
        return a+b;
    }
    public double multiplicar(double a,double b){
        return a*b;
    }
    public int factorial (int n){
        if (n==0){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
}

