package com.rajni.assignment.week1;

import java.util.Scanner;

public class StraightFlush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArray = new String[5];
       // char[] suits = new char[5];
        for (int i = 0 ; i < 5; i++) {
            String str = scanner.next();
            strArray[i] = str;
         //   suits[i] = str.charAt(1);
        }

        boolean sameUnit = true;
        boolean aceFlush = false;

        boolean isAce = false;
        int countOfLetters = 0;
        int countOfDigits = 0;
        for (int i = 0 ;i < strArray.length; i++) {
            String str = strArray[i];
            char firstChar = str.charAt(0);
            char secondChar = str.charAt(1);
            if(Character.isLetter(firstChar)) {
                countOfLetters++;
                if(firstChar == 'A') {
                    isAce = true;
                }
            } else if(Character.isDigit(firstChar)) {
                countOfDigits++;
            }
            // check for the same unit.
            if(i < strArray.length - 1 && secondChar != strArray[i+1].charAt(1)) {
                sameUnit = false;
            }
        }

        if(sameUnit) {
            if(countOfDigits > 0 && countOfLetters > 0 ) {
                if(isAce && countOfLetters == 1)
                    aceFlush = true;
            } else if(countOfDigits > 0) {
                aceFlush = true;
            } else if(countOfLetters > 0) {
                aceFlush = true;
            }
        }

        if(aceFlush) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
