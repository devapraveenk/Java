package com.dev.DSA.twopointers;

public class VaildPalin {

    public boolean isPalindrome(String s) {
        return solution(s);
    }

    private static boolean solution(String s) {
        StringBuilder ns = new StringBuilder();

        for (char x : s.toCharArray()) {
            if (Character.isLetterOrDigit(x)) {
                ns.append(Character.toLowerCase(x));
            }
        }

        int x = 0;
        int y = ns.length() - 1;
        while (x < y) {
            if (ns.charAt(x) != ns.charAt(y)) {
                return false;
            }
            x += 1;
            y -= 1;
        }
        return true;
    }
}
