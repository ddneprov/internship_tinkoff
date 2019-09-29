package com.company;
import java.util.Scanner;

public class fifth {

    public static boolean check(Integer number) {
        int save = Integer.MAX_VALUE;
        while (number > 0)
            if (number % 10 <= save) {
                save = number % 10;
                number = number / 10;
            }
            else
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer from = sc.nextInt();
        Integer to = sc.nextInt();
        int sum = 0;

        for (int i = from; i < to+1; ++i)
            if (check(i))
                sum++;

        System.out.println(sum % ((int)(Math.pow(10, 9) + 7)));
    }
}
