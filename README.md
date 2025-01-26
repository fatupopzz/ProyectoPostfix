# Hoja de Trabajo 2: Evaluador Postfix

## Descripción de Clases

![image](https://github.com/user-attachments/assets/f68b34ca-5528-4bef-ba03-013ed8d53200)

### Stack<E>
- Interface que define operaciones básicas de pila
- Proporcionada por el auxiliar
- Métodos: push(), pop(), peek(), empty(), size()

### PilaVector<E> (Damián)
- Implementación de Stack usando Vector
- Estructura dinámica que crece según necesidad
- Maneja excepciones para pila vacía

### CalculadoraExpresiones
- Interface que define el contrato común
- Permite interoperabilidad entre grupos
- Método: evaluarExpresion()

### CalculadoraPostfix (Emilio)
- Implementa CalculadoraExpresiones
- Evalúa expresiones postfix
- Usa Stack para procesar operandos/operadores
- Maneja errores matemáticos

### InterpretePostfix (Fátima)
- Procesa entrada del archivo datos.txt
- Valida formato y tokens
- Prepara expresión para evaluación

### Aplicacion (Fátima)
- Punto de entrada del programa
- Integra intérprete y calculadora
- Lee archivo y muestra resultados


## Equipo
- **Damián**: PilaVector + Testing
- **Emilio**: CalculadoraPostfix
- **Fátima**: Intérprete + Aplicación

