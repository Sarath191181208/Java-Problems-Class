public class prob4 {
    /**
     * Q : Array of objs;
     * 
     * ? technically everyting is an object let's say user defined obj for now
     */
    public static void main(String[] args) {
        int size = 10;
        Num[] arr = new Num[size];
        for (int i = 0; i < size; i++) {
            arr[i] = new Num(i);
        }
        for (Num ele : arr) {
            ele.printNum();
        }
    }
}

class Num {
    private int num;

    public Num(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void printNum() {
        System.out.println("Num: " + num);
    }
}
