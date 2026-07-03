# 🎓 Gestor Universitario - Búsqueda Recursiva

## Descripción

Este proyecto corresponde a la práctica **Gestor Universitario**, desarrollada en Java utilizando los principios de la Programación Orientada a Objetos (POO).

Como parte de la práctica se implementó un método de **búsqueda recursiva** en todas las clases que contienen relaciones de agregación o composición de tipo **1 a N**, permitiendo localizar un objeto dentro de un arreglo y regresar la posición donde se encuentra.

Además, se realizaron pruebas de funcionamiento en la clase `Main.java` para verificar el correcto comportamiento de cada uno de los métodos implementados.

---

## Estructura del proyecto

El sistema representa una universidad mediante diferentes clases que modelan personas, estudiantes, trabajadores y departamentos.

Las relaciones de agregación o composición identificadas fueron las siguientes:

| Clase | Relación 1 a N | Arreglo |
|-------|----------------|---------|
| Universidad | Estudiantes | `Estudiante[] estudiantes` |
| Universidad | Trabajadores | `Trabajador[] trabajadores` |
| Universidad | Departamentos | `Departamento[] departamentos` |
| Departamento | Profesores | `PDI[] profesores` |

Estas fueron las clases donde se implementó la búsqueda recursiva, ya que contienen colecciones de objetos almacenadas en arreglos.

---

## Implementación de la búsqueda recursiva

La búsqueda recursiva consiste en recorrer un arreglo elemento por elemento mediante llamadas al mismo método, sin utilizar ciclos iterativos (`for` o `while`) para realizar la búsqueda.

Cada método implementado regresa:

- La posición donde se encontró el elemento.
- `-1` cuando el elemento no existe dentro del arreglo.

Para mantener una interfaz sencilla para el usuario, cada búsqueda fue implementada mediante **dos métodos**:

- Un método **público**, encargado de iniciar la búsqueda.
- Un método **privado**, encargado de realizar la recursión y controlar la posición actual del arreglo.

Esta separación permite ocultar la lógica interna de la búsqueda y facilita el uso del método desde cualquier otra clase del proyecto.

---

## ¿Por qué se utilizaron dos métodos?

Se implementó un método público y un método privado por las siguientes razones:

- El método público permite iniciar la búsqueda sin que el usuario tenga que conocer la posición inicial del arreglo.

```java
buscarProfesorRecursivo("Maria Lopez");
```

Internamente, este método llama a un segundo método que recibe como parámetro la posición actual del arreglo.

```java
buscarProfesorRecursivo("Maria Lopez", 0);
```

El segundo método es el encargado de avanzar posición por posición hasta encontrar el elemento o llegar al final del arreglo.

---

## Funcionamiento del algoritmo

El algoritmo implementado realiza una búsqueda recursiva sobre un arreglo de objetos.

Su funcionamiento puede resumirse en los siguientes pasos:

1. Se recibe el nombre del elemento que se desea buscar.
2. La búsqueda comienza en la posición **0** del arreglo.
3. Se verifica si la posición actual es mayor o igual al tamaño del arreglo.
   - Si esto ocurre, significa que el elemento no existe y el método regresa **-1**.
4. Si la posición es válida, se compara el nombre del objeto almacenado con el nombre buscado.
   - Si coinciden, el método regresa la posición donde fue encontrado.
   - Si no coinciden, el método vuelve a llamarse incrementando la posición en **1**.
5. El proceso continúa hasta encontrar el elemento o recorrer completamente el arreglo.

---

## Diagrama del proceso de búsqueda

```text
Inicio
   │
   ▼
Recibir nombre del elemento
   │
   ▼
Comenzar en la posición 0
   │
   ▼
¿La posición es mayor o igual al tamaño del arreglo?
   │
 ┌─┴───────────────┐
 │                 │
Sí                 No
 │                 │
 ▼                 ▼
Regresar -1   ¿El nombre coincide?
                   │
             ┌─────┴─────┐
             │           │
            Sí           No
             │           │
             ▼           ▼
   Regresar posición   posición + 1
                           │
                           ▼
              Llamar nuevamente al método
```

---