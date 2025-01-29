package org.uvg;
import java.util.Stack;


/**
 * Intérprete para procesar archivo de texto y convertirlo a expresión postfix
 * @author Fatima Navarro
 * @version 1.0
 */
public class InterpretePostfix {
    private Stack<Integer> pila;

    public InterpretePostfix() {
        pila = new Stack<>();
    }

    /**
     * Procesa la entrada del archivo
     * @param linea línea a procesar del archivo
     * @return true si la línea es válida, false si no
     */
    public boolean procesarLinea(String linea) {
        String[] tokens = linea.trim().split("\\s+");
        
        // Verifica si hay tokens
        if (tokens.length == 0) {
            return false;
        }

        // Verifica cada token
        for (String token : tokens) {
            if (!esNumero(token) && !esOperador(token)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifica si un token es número
     */
    private boolean esNumero(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Verifica si es operador válido
     */
    private boolean esOperador(String token) {
        return "+-*/".contains(token);
    }

    /**
     * Prepara expresión para evaluación
     * @param linea línea del archivo
     * @return expresión procesada
     * @throws IllegalArgumentException si la expresión es inválida
     */
    public String prepararExpresion(String linea) {
        if (!procesarLinea(linea)) {
            throw new IllegalArgumentException("Expresión inválida en archivo");
        }
        return linea.trim();
    }
}