package com.rajni.practice.week1;

import java.util.Scanner;

public class MaxSumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0 ;  i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = 0;
        for (int i = 0 ; i < array.length; i++) {
            for (int j = 0 ; j < array.length; j++) {
                if (i != j && array[i] + array[j] > max) {
                    max = array[i] + array[j];
                }
            }
        }
        System.out.println("Max Sum is :: "+max);
    }
}
