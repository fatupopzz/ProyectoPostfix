package org.uvg;
import java.util.Vector;
/**
 * @author Emilio
 * @version 1.0
 * Implementación de Stack usando Vector
 * 
 * TAREAS:
 * 1. Implementar todos los métodos de Stack
 * 2. Manejar casos de pila vacía
 * 3. Implementar pruebas unitarias
 * 4. Documentar con JavaDoc
 */

public class PilaVector<E> implements Stack<E> {    
    //se crea un objeto de tipo vector 
    private Vector<E> Stack; 

    public void VectorStack () {
        //contructor de la clase 
        this.Stack = new Vector<>();
    }

    @Override
    public boolean empty() {
        //se verifica si la pila esta vacia. Retorna el resultado
        return Stack.isEmpty();
    }

    @Override
    public E peek() {
        //se verifica si la pila esta vacia. Si lo esta, se lanza una excepcion
        if (Stack.isEmpty() == true) {
            throw new IllegalStateException("La pila se encuentra vacía, peek no está disponible");
        }
        //si no esta vacia, se retorna el ultimo elemento de la pila
        return Stack.lastElement();
    }

    @Override
    public E pop() {
        //se verifica si la pila esta vacia. Si lo esta, se lanza una excepcion
        if (Stack.isEmpty() == true) {
            throw new IllegalStateException("La pila se encuentra vacía, pop no está disponible");
        }
        //si no esta vacia, se remueve el ultimo elemento de la pila y se retorna
        return Stack.remove(Stack.size() - 1);
    }
    
    /**
     *  Se añade un elemento a la pila, este tomará la última posición. 
     */
    @Override
    public void push(E item) {
        //se añade un elemento a la pila
        Stack.add(item);
        
    }

    @Override
    public int size() {
        //se retorna el tamaño de la pila
        return Stack.size();
    }
    
    
}

