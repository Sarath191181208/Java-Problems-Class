
public class prob2 {
    public static void main(String[] args) {
        Name name = new Name("Sarath");
        // getter
        System.out.println(name.getName());
        // setter
        name.setName("Chandra");

        System.out.println(name.getName());
    }
}

class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

}
