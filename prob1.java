
class prob1 {
    public static void main(String[] args) {
        numsArr nmArr = new numsArr(1, 2, 3);
        nmArr.print();
        System.out.println("Triple cons end");
        print_spacer(20);

        numsArr intArr = new numsArr(new int[] { 1, 2, 3 });
        intArr.print();
        System.out.println("int cons end");
        print_spacer(20);

        numsArr floatArr = new numsArr(new float[] { 1.1f, 2.2f, 3.3f });
        floatArr.print();
        System.out.println("float cons end");
        print_spacer(20);
    }
    private static void print_spacer(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println("->");
    }
}

class numsArr {

    private int[] marks = new int[3];

    public numsArr(int[] marks) {
        System.out.println("Constructor with int array");
        this.marks = marks;
    }
    // accept multiple arguments
    public numsArr(float[] marks) {
        System.out.println("float Constructor");
        this.marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = (int) marks[i];
        }
    }

    public numsArr(int mat, int sci, int cs) {
        System.out.println("Constructor with 3 arguments");
        this.marks[0] = mat;
        this.marks[1] = sci;
        this.marks[2] = cs;
    }


    public void print() {
        String[] strArr = { "Maths", "Science", "Computer-Science" };
        for (int i = 0; i < marks.length; i++) {
            System.out.println(strArr[i]+ " : " + marks[i]);
        }
    }
}
