public class prob3 {
    /**
     * Q : Class +Dynamic Method Invocation/ Run time Polymorphism
     * Using overloading
     * 
     */
    public static void main(String[] args) {
        Cat c = new Tiger();
        c.talk();
        c.animalSound();
    }
}

class Cat {
    public void talk() {
        System.out.println("Meow");
    }

    public void animalSound() {
        System.out.println("Cat sound");
    }
}

class Tiger extends Cat {
    public void talk() {
        System.out.println("Roar");
    }
}