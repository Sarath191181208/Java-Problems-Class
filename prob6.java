public class prob6 {
    /**
     * Q: Inheritence and override
     */
    public static void main(String[] args) {

        // initiating the objs

        Fan f = new Fan();
        UshaFan u = new UshaFan();
        OrientFan o = new OrientFan();
        // Here new fan forgot to implement get speed method
        // still we get the speed from the base class
        NewFan n = new NewFan();

        Fan[] fanLst = { f, u, o, n };

        for (Fan fan : fanLst) {
            System.out.print(fan.getName() + ": ");
            System.out.println(fan.getSpeed());
        }
    }
}

class Fan {
    public int getSpeed() {
        return 200;
    }

    public String getName() {
        return "Basic Fan";
    }
}

class UshaFan extends Fan {
    public int getSpeed() {
        return 300;
    }

    public String getName() {
        return "Usha";
    }
}

class OrientFan extends Fan {
    public int getSpeed() {
        return 350;
    }

    public String getName() {
        return "Orient";
    }
}

class NewFan extends Fan {
    public String getName() {
        return "New";
    }
}