package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer K = sc.nextInt();
        BigInteger a = BigInteger.valueOf(1);

        for (int i = 2; i <= K; i++)
            a = a.multiply(BigInteger.valueOf(i));

        while ((a.mod(BigInteger.valueOf(10))).compareTo(BigInteger.valueOf(0)) == 0)
            a = a.divide(BigInteger.valueOf(10));

        System.out.println(a.mod(BigInteger.valueOf(10)));
    }
}
