package com.rajni.assignment.week1;

import java.math.BigInteger;
import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger integer = new BigInteger(scanner.next()).add(new BigInteger("1"));
        int digits = 0;
        BigInteger divisor = new BigInteger("10");
        while (integer.compareTo(BigInteger.ZERO) != 0) {
            digits++;
            integer = integer.divide(divisor);
        }
        System.out.println(digits);
    }
}
