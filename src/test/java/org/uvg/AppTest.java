package org.uvg;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Pruebas Unitarias - Asignado a: Damián
 */
class PruebasCalculadora {
    private CalculadoraPostfix calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new CalculadoraPostfix();
    }

    @Test
    void testOperacionesBasicas() {
        assertEquals(5, calculadora.evaluarExpresion("2 3 +"));
        assertEquals(1, calculadora.evaluarExpresion("3 2 -"));
        assertEquals(6, calculadora.evaluarExpresion("2 3 *"));
        assertEquals(2, calculadora.evaluarExpresion("6 3 /"));
    }

    @Test
    void testExpresionesComplejas() {
        assertEquals(14, calculadora.evaluarExpresion("5 1 2 + 4 * + 3 -"));
        assertEquals(9, calculadora.evaluarExpresion("3 4 + 2 * 7 -"));
    }

    @Test
    void testManejoErrores() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.evaluarExpresion("2 3 &"));
        assertThrows(IllegalStateException.class, () -> calculadora.evaluarExpresion("2 +"));
        assertThrows(ArithmeticException.class, () -> calculadora.evaluarExpresion("5 0 /"));
    }

    @Test
    void testCasosLimite() {
        assertEquals(0, calculadora.evaluarExpresion("0 0 +"));
        assertEquals(-1, calculadora.evaluarExpresion("0 1 -"));
        assertEquals(1, calculadora.evaluarExpresion("1 1 + 2 /"));
        assertThrows(IllegalArgumentException.class, () -> calculadora.evaluarExpresion(""));
    }
}
