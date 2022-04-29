public class ObjectBasics {

    public static void main(String[] args) {
        int a = 0;
        a = a + 1;

        Obj obj = new Obj(5, 10);

        obj.sub();
        obj.mod();
        obj.mul();

    }

}

class Obj {
    int a;
    int b;

    Obj(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add() {
        System.out.println(a + b);
    }

    void sub() {
        System.out.println(a - b);
    }

    void mul() {
        System.out.println(a * b);
    }

    void div() {
        System.out.println(a / b);
    }

    void mod() {
        System.out.println(a % b);
    }

    void inc() {
        System.out.println(a++);
    }

    void dec() {
        System.out.println(a--);
    }

    void exp() {
        System.out.println(a ^ b);
    }

    void and() {
        System.out.println(a & b);
    }

    void or() {
        System.out.println(a | b);
    }

    void xor() {
        System.out.println(a ^ b);
    }

    void not() {
        System.out.println(~a);
    }

    void left() {
        System.out.println(a << b);
    }

    void right() {
        System.out.println(a >> b);
    }

    void rightUnsigned() {
        System.out.println(a >>> b);
    }
}
