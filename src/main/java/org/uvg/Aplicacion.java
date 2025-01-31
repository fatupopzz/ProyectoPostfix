package org.uvg;


/**
 * @author Fatima Navarro
 * @version 1.0
 * Clase principal del evaluador postfix:
 * programa que calcula expresiones matemáticas en notación postfix
 * 
 * TAREAS:
 * 1. Leer archivo datos.txt
 * 2. Integrar componentes
 * 3. Manejar errores de archivo/evaluación
 * 4. Coordinar entregas del equipo
 */

import java.nio.file.Files;
import java.nio.file.Paths;

public class Aplicacion {
    public static void main(String[] args) {
        // Usar la calculadora adaptada
        CalculadoraExpresiones calc = new Calculadora(); //esto se cambia por lo de otro grupo
        
        try {
            String expresion = new String(Files.readAllBytes(Paths.get("datos.txt"))).trim();
            System.out.println("Expresión: " + expresion);
            int resultado = calc.evaluarExpresion(expresion);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}