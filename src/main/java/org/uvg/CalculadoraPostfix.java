package org.uvg;

/**
 * @author Damián
 * @version 1.1
 * Evaluador de expresiones postfix
 * lee una expresión matemática en notación postfix y la evalúa
 * de izquierda a derecha
 */
public class CalculadoraPostfix implements CalculadoraExpresiones {
    private PilaVector<Integer> pila; // Cambiado a PilaVector

    public CalculadoraPostfix() {
        this.pila = new PilaVector<>();
    }

    @Override
    public int evaluarExpresion(String expresion) throws IllegalArgumentException, ArithmeticException {
        String[] tokens = expresion.split(" ");
        for (String token : tokens) {
            if (esNumero(token)) {
                pila.push(Integer.parseInt(token));
            } else if (esOperador(token)) {
                procesarOperador(token);
            } else {
                throw new IllegalArgumentException("Token inválido: " + token);
            }
        }
        if (pila.size() != 1) {
            throw new IllegalStateException("Expresión inválida, elementos sobrantes");
        }
        return pila.pop();
    }

    private boolean esNumero(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean esOperador(String token) {
        return "+-*/".contains(token);
    }

    private void procesarOperador(String operador) {
        if (pila.size() < 2) {
            throw new IllegalStateException("No hay suficientes operandos en la pila");
        }
        int b = pila.pop();
        int a = pila.pop();
        
        switch (operador) {
            case "+":
                pila.push(a + b);
                break;
            case "-":
                pila.push(a - b);
                break;
            case "*":
                pila.push(a * b);
                break;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("División por cero"); // Aseguramos que se lance la excepción
                }
                pila.push(a / b);
                break;
            default:
                throw new IllegalArgumentException("Operador desconocido: " + operador);
        }
    }
}
