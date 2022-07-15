public class prob23 {
    public static void main(String[] args) {
        var num1 = new ComplexNum(1.0, 2.0);
        var num2 = new ComplexNum(3.0, 4.0);

        int comp = num1.compareTo(num2);

        if (comp == 0)
            System.out.println(num1 + " = " + num2);
        else if (comp == 1)
            System.out.println(num1 + " > " + num2);
        else
            System.out.println(num1 + " < " + num2);

    }
}

class ComplexNum implements Comparable<ComplexNum> {

    Double re;
    Double im;

    ComplexNum(Double re, Double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString() {
        return re + " + " + im + "i";
    }

    private Double clacDis() {
        return (re * re) + (im * im);
    }

    @Override
    public int compareTo(ComplexNum o) {
        Double dis = this.clacDis();
        Double oDis = o.clacDis();

        if (dis == oDis)
            return 0;
        else if (dis > oDis)
            return 1;
        else
            return -1;
    }

}