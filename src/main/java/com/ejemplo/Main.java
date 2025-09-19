package com.ejemplo;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma 5 + 3 = " + calc.sumar(5, 3));
        System.out.println("Resta 5 - 3 = " + calc.restar(5, 3));
        System.out.println("Multiplicación 5 * 3 = " + calc.multiplicar(5, 3));
        System.out.println("División 10 / 2 = " + calc.dividir(10, 2));
    }
}
