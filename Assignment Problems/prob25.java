public class prob25 {
    public static void main(String[] args) {
        Thread t1 = new SumDigi(23);
        t1.start();
    }
}

class SumDigi extends Thread {
    private int num;

    public SumDigi(int num) {
        this.num = num;
    }

    private int calcSumDigi(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

    @Override
    public void run() {
        int n = this.num;
        while (n > 0) {
            n = calcSumDigi(n);
        }
    }
}