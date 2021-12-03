package com.rajni.assignment.week1;

import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        if(str.endsWith("9") && (str.startsWith("9") || str.length() == 1)) {
            boolean addOne = true;
            for (int i = 0 ; i <  str.length(); i++) {
                if(str.charAt(i) != '9') {
                    addOne = false;
                    break;
                }
            }
            if(addOne) {
                System.out.println(str.length() + 1);
            } else {
                System.out.println(str.length());
            }
        } else {
            System.out.println(str.length());
        }

    }
}
