# Method Overriding

- Cange the inherited parent implementation of the same method.

```java
class Bike {
    public String name;

    private int speedLimit = 100;

    Bike(String name) {
        this.name = name;
    }

    void ride(int speed) {
        if (speed > speedLimit)
            System.out.println("Speed lime reached");
        else
            System.out.println("I'm riding at " + speed + " km/h");
    }
}

class SuperBike extends Bike {
    public SuperBike(String name) {
        super(name);
    }

    @Override // optional
    void ride(int speed) {
        System.out.println("I'm riding at " + speed + " km/h on super Bike");
    }

}

public class Main {
    public static void main(String[] args) {
        Bike b = new Bike("Splender");
        b.ride(130);
        SuperBike s = new SuperBike("Gix");
        s.ride(130);
    }
}
```
