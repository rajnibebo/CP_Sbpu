package com.rajni.assignment.week1;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class AdditionAndSubtraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x, y, z;
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        int result = -1;

        // your code
        //int[] series = new int[1e8];
        BigInteger integer = new BigInteger("0");
        BigInteger xInt = new BigInteger(String.valueOf(x));
        BigInteger yInt = new BigInteger(String.valueOf(y));
        for (int i = 0 ; i < 5000; i++) {
            if( i != 0) {
                if( i % 2 != 0) {
                    integer = integer.add(xInt);
                } else {
                    integer = integer.subtract(yInt);
                }
            }

            if(integer.intValue() == z) {
                result = i;
                break;
            }
        }


        out.println(result);

        in.close();
        out.close();
    }

}
