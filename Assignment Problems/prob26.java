import java.util.Scanner;

public class prob26 {

    private static void takeInput(String[] inputs) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < inputs.length; i++) {
            System.out.println("Enter a string as input: ");
            String s = sc.nextLine();
            inputs[i] = s;
        }

        sc.close();
    }

    public static void main(String[] args) throws InterruptedException {
        var inputs = new String[4];
        takeInput(inputs);

        var threadArr = new rmString[4];
        for (int i = 0; i < 4; i++) {
            String inputString = inputs[i];
            threadArr[i] = new rmString(inputString);
            var t = threadArr[i];
            t.start();
        }

        for (rmString t : threadArr) {
            t.join();
        }

        for (rmString t : threadArr) {
            String val = t.get();
            System.out.println(val);
        }
    }
}

class rmString extends Thread {
    private String s;

    rmString(String s) {
        this.s = s;
    }

    public String get() {
        return this.s;
    }

    private static char getMaxChar(String str) {
        var charArr = str.toLowerCase().toCharArray();

        int freq[] = new int[26];
        int len = charArr.length;
        int max = -1;
        char res = 0;
        char c;
        int hashIdx, charCount;

        // iterating and filling the number of occurances
        for (int i = 0; i < len; i++) {
            c = charArr[i];
            hashIdx = c - 'a';

            if (c == ' ')
                continue;

            // filling the hash table
            freq[hashIdx]++;

            // Caluculating the max occuring char
            charCount = freq[hashIdx];
            if (max < charCount) {
                max = charCount;
                res = c;
            }

        }

        return res;
    }

    @Override
    public void run() {
        // MOC: Most Occuring Character
        char maxChar = getMaxChar(s); // getting the MOC
        String c = Character.toString(maxChar); // char -> String
        String newS = s.replaceAll(c, "");// removing the MOC
        this.s = newS; // printing the new String with all the MOC removed
    }

}
