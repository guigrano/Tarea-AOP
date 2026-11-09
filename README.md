# Tarea AOP 2.0 - Grupo 2

Patrones de diseño Adapter y Singleton en Java, implementados con programación orientada a objetos (Sección A) y con programación orientada a aspectos usando AspectJ (secciones B y C).

## Requisitos

- JDK 16 o superior (probado con JDK 25).
- Maven 3.9 o superior, solo para las secciones B y C.

## Sección A: POO (Java puro)

Se compila con `javac`, desde la carpeta de cada patrón:

```
cd seccion-A/adapter
javac *.java
java Main
```

Salida esperada: `Transferencia bancaria: $50.0`.

Para el Singleton se hace lo mismo en `seccion-A/singleton`. Salida esperada: `Sistema de Pagos` y `¿Son el mismo objeto? true`.

## Secciones B y C: AOP (AspectJ)

Estas secciones tienen aspectos (archivos `.aj`), que `javac` no entiende. Se compilan con el compilador de AspectJ (`ajc`), que Maven descarga y usa automáticamente. Desde la raíz del repositorio:

```
mvn -f seccion-B/pom.xml clean compile exec:java
mvn -f seccion-C/pom.xml clean compile exec:java
```

Salida esperada:

- Sección B: `Pago con tarjeta: $25.5` y `Transferencia bancaria: $50.0`.
- Sección C: `Sistema de Pagos` y `¿Son el mismo objeto? true`.

## Notas

- B y C no se deben compilar con `javac` ni con el botón de ejecutar del editor: B no compila sin el aspecto, y C compila pero el Singleton no se aplica (imprime `false`).
- El aviso `bad version number` que muestra Maven al compilar no afecta la ejecución.
- Los editores sin soporte para AspectJ (por ejemplo, VS Code) pueden marcar errores que no existen en estos archivos. El comando de Maven es la referencia.
