package com.ejemplo;

public class Calculadora {

    // Suma
    public int sumar(int a, int b) {
        return a + b;
    }

    // Resta
    public int restar(int a, int b) {
        return a - b;
    }

    // Multiplicación
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // División con control de división por cero
    public int dividir(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No se puede dividir entre 0");
        return a / b;
    }

    // Módulo (resto de la división)
    public int modulo(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No se puede calcular módulo con 0");
        return a % b;
    }

    // Potencia (a elevado a b)
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Raíz cuadrada
    public double raizCuadrada(double numero) {
        if (numero < 0) throw new IllegalArgumentException("No se puede calcular raíz cuadrada de un número negativo");
        return Math.sqrt(numero);
    }

    // Valor absoluto
    public int valorAbsoluto(int numero) {
        return Math.abs(numero);
    }
}
