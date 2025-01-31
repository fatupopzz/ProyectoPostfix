# Hoja de Trabajo 2: Evaluador Postfix

## Descripción de Clases

![image](https://github.com/user-attachments/assets/f68b34ca-5528-4bef-ba03-013ed8d53200)

## Diagrama de secuencia 

![image](https://github.com/user-attachments/assets/5ba38eb5-3d40-4e61-9db6-205444d894cd)


## Descripción
Implementación de un evaluador de expresiones matemáticas en notación postfix, utilizando un ADT Stack genérico y adaptadores para interoperabilidad entre grupos.

## Integrantes
- Emilio: Implementación CalculadoraPostfix
- Damián: Implementación PilaVector y pruebas
- Fátima: Intérprete, adaptador y programa principal

## Estructura del Proyecto

### ADT Stack<E>
- Interface genérica para operaciones de pila
- Operaciones: push, pop, peek, empty, size
- Implementación usando Vector en PilaVector<E>

### Componentes Principales
- **Stack<E>**: Interface para operaciones de pila
- **PilaVector<E>**: Implementación de pila usando Vector
- **Calculadora**: Interface para evaluación
- **CalculadoraPostfix**: Evaluador de expresiones
- **Aplicacion**: Programa principal

### Interoperabilidad
El proyecto incluye un adaptador que permite:
- Usar calculadoras de otros grupos
- Mantener compatibilidad entre diferentes implementaciones
- Integrar código sin modificar implementaciones originales

## Uso
1. Usar el archivo datos.txt en la raíz del proyecto
2. Escribir expresión postfix 
3. Ejecutar
