package com.company;

import java.util.Scanner;

public class fouth {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        int i = 2;

        try {
            while (N % i != 0)
                i++;
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(i);
    }
}
