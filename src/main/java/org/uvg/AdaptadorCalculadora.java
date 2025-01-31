package org.uvg;


/**
 * Adaptador para hacer compatible la calculadora de otro grupo
 * con nuestra interfaz CalculadoraExpresiones
 */
public class AdaptadorCalculadora implements CalculadoraExpresiones {
    private Calculadora calculadoraGrupo2; // La calculadora del otro grupo
    
    public AdaptadorCalculadora() {
        this.calculadoraGrupo2 = new Calculadora();
    }
    
    @Override
    public int evaluarExpresion(String expresion) {
        // Convierte la llamada de nuestra interfaz al método del otro grupo
        return calculadoraGrupo2.Resultado(expresion);
    }
}