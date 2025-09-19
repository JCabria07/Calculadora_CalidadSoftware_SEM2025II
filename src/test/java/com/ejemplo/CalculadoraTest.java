package com.ejemplo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculadora();
    }

    @Test
    void sumarNumerosDebeDarResultadoCorrecto() {
        assertEquals(5, calculator.sumar(2,3));
        assertEquals(12, calculator.sumar(6,6));
        assertEquals(28, calculator.sumar(15,13));
        assertEquals(1234, calculator.sumar(1233,1));
    }

    @Test
    void restarNumerosDebeDarResultadoCorrecto() {
        assertEquals(-1, calculator.restar(2,3));
        assertEquals(0, calculator.restar(6,6));
        assertEquals(2, calculator.restar(15,13));
        assertEquals(1232, calculator.restar(1233,1));
    }

    @Test
    void multiplicarNumerosDebeDarResultadoCorrecto() {
        assertEquals(6, calculator.multiplicar(2,3));
        assertEquals(36, calculator.multiplicar(6,6));
        assertEquals(195, calculator.multiplicar(15,13));
        assertEquals(1233, calculator.multiplicar(1233,1));
    }

    @Test
    void dividirNumerosDebeDarResultadoCorrecto() {
        assertEquals(2, calculator.dividir(10,5));
        assertEquals(5, calculator.dividir(50,10));
        assertEquals(18, calculator.dividir(36,2));
        assertEquals(19, calculator.dividir(76,4));
    }

    @Test
    void dividirEntreCeroDebeLanzarExcepcion() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> calculator.dividir(10,0));
        assertEquals("No se puede dividir entre 0", ex.getMessage());
    }

    @Test
    void moduloDebeDarResultadoCorrecto() {
        assertEquals(1, calculator.modulo(10,3));
        assertEquals(0, calculator.modulo(20,5));
        assertEquals(2, calculator.modulo(17,3));
    }

    @Test
    void moduloPorCeroDebeLanzarExcepcion() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> calculator.modulo(10,0));
        assertEquals("No se puede calcular módulo con 0", ex.getMessage());
    }

    @Test
    void potenciaDebeDarResultadoCorrecto() {
        assertEquals(8.0, calculator.potencia(2,3), 0.0001);
        assertEquals(1.0, calculator.potencia(5,0), 0.0001);
        assertEquals(81.0, calculator.potencia(9,2), 0.0001);
    }

    @Test
    void raizCuadradaDebeDarResultadoCorrecto() {
        assertEquals(3.0, calculator.raizCuadrada(9), 0.0001);
        assertEquals(5.0, calculator.raizCuadrada(25), 0.0001);
        assertEquals(10.0, calculator.raizCuadrada(100), 0.0001);
    }

    @Test
    void raizCuadradaDeNumeroNegativoDebeLanzarExcepcion() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> calculator.raizCuadrada(-9));
        assertEquals("No se puede calcular raíz cuadrada de un número negativo", ex.getMessage());
    }

    @Test
    void valorAbsolutoDebeDarResultadoCorrecto() {
        assertEquals(5, calculator.valorAbsoluto(5));
        assertEquals(5, calculator.valorAbsoluto(-5));
        assertEquals(0, calculator.valorAbsoluto(0));
    }
}
