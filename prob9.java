import Numbers.IsPrime;

public class prob9 {
    /**
     * Q: User defined Package
     */
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            // isPrime is a static method
            IsPrime.isPrime(i);
        }
    }
}
