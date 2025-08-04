package Problem;

import java.util.Scanner;

public class digitcount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int digit = in.nextInt();
        int digitCount = (int) Math.log10(digit);
        System.out.println(digitCount + 1);
    }
}
