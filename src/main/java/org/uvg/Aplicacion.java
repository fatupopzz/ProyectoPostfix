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
<<<<<<< HEAD
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Aplicacion {
    public static void main(String[] args) {
        CalculadoraExpresiones calc = new CalculadoraPostfix();
        
        try {
            String expresion = new String(Files.readAllBytes(Paths.get("datos.txt"))).trim();
            System.out.println("Expresión: " + expresion);
            
            int resultado = calc.evaluarExpresion(expresion);
            System.out.println("Resultado: " + resultado);
            
        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Error evaluando: " + e.getMessage());
        }
    }
}
=======
public class Aplicacion {
    // ... [implementación] ...
}
>>>>>>> 37dc01e94dadc6ebc6c088b1371a38bc29c1421d
