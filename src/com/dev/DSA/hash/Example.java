package com.dev.DSA.hash;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        int[] ch = new int[256];
        // Scanner sc = new Scanner(System.in);

        String s = "Hello";
        for (char val : s.toCharArray()) {
            ch[val] += 1;// -> implicit conversion from char -> int(only for primitive dataType and some
                         // non primitive Types too)
        }
        for (int x = 0; x < 256; x++) {
            System.out.println(ch[x]);
        }
        // sc.close();
    }
}