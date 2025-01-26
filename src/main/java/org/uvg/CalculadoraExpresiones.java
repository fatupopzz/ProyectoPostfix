package org.uvg;

/**
* Interface que define contrato para calculadoras de expresiones
* @author Fatima Navarro
* @version 1.0 
*/
interface CalculadoraExpresiones {
    /**
     * Evalúa una expresión matemática y retorna resultado
     * @param expresion expresión a evaluar
     * @return resultado de la evaluación
     * @throws IllegalArgumentException si expresión inválida
     * @throws ArithmeticException si hay división por cero
     */
    int evaluarExpresion(String expresion);
}