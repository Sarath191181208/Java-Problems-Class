
public class prob25 {

    private static int factorial(int num) {
        int product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] numArr = { 1024, 2048, 4096, 1124 };
        var threadArr = new SumDigi[4];
        for (int i = 0; i < numArr.length; i++) {
            int ele = numArr[i];
            threadArr[i] = new SumDigi(ele);
            threadArr[i].start();
        }

        for (SumDigi thred : threadArr) {
            thred.join();
        }

        SumDigi b = (SumDigi) threadArr[1];
        System.out.println(factorial(b.getVal()));

    }
}

class SumDigi extends Thread {
    private int num;

    public SumDigi(int num) {
        this.num = num;
    }

    private int calcSumDigi(int num) {
        int sum = 0;
        int digit = 0;

        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

    @Override
    public void run() {
        // running until squshed into a single digit
        while (this.num > 9) {
            // calc sum of digits
            this.num = calcSumDigi(this.num);
        }
    }

    public int getVal() {
        return this.num;
    }
}