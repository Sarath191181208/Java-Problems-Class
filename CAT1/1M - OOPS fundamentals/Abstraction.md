# Abstraction

Two ways to achieve abstraction in java:

1. Use interfaces
2. Use abstract classes
   - can't be instantiated.
   - can have abstract methods.
   - can have concrete methods.
   - can have static/final methods.

## Abstract class

```java
abstract class Shape {
    abstract void draw();
}
```

## Interfaces

```java
interface Shape {
    void draw();
}
```
