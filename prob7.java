public class prob7 {
    /**
     * Q: Multilevel Inheritence with acess modifiers
     */
    public static void main(String[] args) {

        Bat basicBat = new Bat();
        Bat cricBat = new CricketBat();
        Bat BatCriketer = new BatOfCricketer();

        Bat[] bats = { basicBat, cricBat, BatCriketer };

        for (Bat bat : bats) {
            bat.hit();
        }

    }
}

class Bat {
    protected void hit() {
        System.out.println("It hit!");
    }
}

class CricketBat extends Bat {
    @Override
    public void hit() {
        System.out.println("Ball's been hit!");
    }
}

class BatOfCricketer extends Bat {
    private void six() {
        System.out.println("It's a Six!");
    }

    @Override
    public void hit() {
        six();
    }
}
