# Super

- The super keyword in java is a reference variable that is used to refer
  parent class objects.

- Use of super with variables: This scenario occurs when a derived
  class and base class has same data members. In that case there is a
  possibility of ambiguity for the JVM.

```java
class A { int speed = 10; }

class B extends A {
    int speed = 20;

    int getSpeed() { return speed; } // this.speed = 20;

    int getSuperSpeed() { return super.speed; } // speed from A = 10;
}
```
