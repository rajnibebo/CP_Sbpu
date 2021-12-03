package com.rajni.assignment.week1;

import java.io.PrintWriter;
import java.util.Scanner;

public class ErasingMaximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n;
        n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = in.nextInt();

        int[] result = new int[n - 1];

        // your code
        int index = -1;
        int max = -1;
        int maxOccurrence = 0;

        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            if(num > max) {
                max = num;
                maxOccurrence = 1;
                index = i;
            } else if(num == max && maxOccurrence < 3 ) {
                maxOccurrence++;
                index = i;
            }
        }

        for (int i = 0, j = 0 ; i < a.length ; i++, j++) {
            if( i != index) {
                result[j] = a[i];
            } else {
                if(index != a.length - 1) {
                    result[j] = a [++i];
                }

            }

        }

        for (int i = 0; i < result.length; ++i) {
            if (i != 0) out.print(' ');
            out.print(result[i]);
        }
        out.println();

        in.close();
        out.close();
    }
}
