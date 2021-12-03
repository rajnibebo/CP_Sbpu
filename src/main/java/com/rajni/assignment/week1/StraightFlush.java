package com.rajni.assignment.week1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StraightFlush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Character> suits = new HashSet<>();
        int[] ranks = new int[5];
        for (int i = 0 ; i < 5; i++) {
            String str = scanner.next();
            ranks[i] = rank(str.charAt(0));
            suits.add(str.charAt(1));
        }

        if(suits.size() > 1) {
            System.out.println("NO");
        } else {
            Arrays.sort(ranks);

            for (int i = 0; i < 4; ++i) {
                if (ranks[i] + 1 != ranks[i + 1]) {
                    if (i < 3 || ranks[0] != 2 || ranks[4] != 14) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
            System.out.println("YES");
        }
    }

    public static int rank(char ch) {
        switch (ch) {
            case 'T' : return 10;
            case 'J' : return 11;
            case 'Q' : return 12;
            case 'K' : return 13;
            case 'A' : return 14;
        }
        return ch - '0';
    }
}
