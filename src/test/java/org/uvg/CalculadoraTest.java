package org.uvg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private CalculadoraPostfix calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new CalculadoraPostfix();
    }

    @Test
    void testBasicOperations() {
        assertEquals(5, calculadora.evaluarExpresion("2 3 +"));
        assertEquals(1, calculadora.evaluarExpresion("3 2 -"));
        assertEquals(6, calculadora.evaluarExpresion("2 3 *"));
        assertEquals(2, calculadora.evaluarExpresion("6 3 /"));
    }


    @Test
    void testErrorHandling() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.evaluarExpresion("2 3 &"));
        assertThrows(IllegalStateException.class, () -> calculadora.evaluarExpresion("2 +"));
        assertThrows(ArithmeticException.class, () -> calculadora.evaluarExpresion("5 0 /"));
    }

    @Test
    void testEdgeCases() {
        assertEquals(0, calculadora.evaluarExpresion("0 0 +"));
        assertEquals(-1, calculadora.evaluarExpresion("0 1 -"));
        assertEquals(1, calculadora.evaluarExpresion("1 1 + 2 /"));
        assertThrows(IllegalStateException.class, () -> calculadora.evaluarExpresion("")); // Cambia esto
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> 
            calculadora.evaluarExpresion("5 0 /"));
    }

    @Test 
    void testNegativeNumbers() {
    assertEquals(-5, calculadora.evaluarExpresion("0 5 -"));
    assertEquals(-6, calculadora.evaluarExpresion("2 8 -"));
    assertEquals(-15, calculadora.evaluarExpresion("5 4 * 35 -"));
    }


    @Test
    void testInvalidExpressions() {
    assertThrows(IllegalStateException.class, () -> 
        calculadora.evaluarExpresion("1 2 3 +"));
    assertThrows(IllegalStateException.class, () -> 
        calculadora.evaluarExpresion("+ 1 2"));
    assertThrows(IllegalStateException.class, () -> 
        calculadora.evaluarExpresion("1 + 2"));
    }

    @Test
    void testZeroCases() {
    assertEquals(0, calculadora.evaluarExpresion("0 0 *"));
    assertEquals(0, calculadora.evaluarExpresion("5 0 *"));
    assertEquals(0, calculadora.evaluarExpresion("0 5 *"));
    }
}