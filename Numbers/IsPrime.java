package Numbers;

import java.lang.Math;

public class IsPrime {
    public static void isPrime(int num) {
        if (num == 1) {
            System.out.println("1 is not a prime number");
        }
        // Checking if prime
        for (int i = 2; i < (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
                return;
            } else {
                System.out.println(num + " is a prime number");
            }
        }
    }
}
