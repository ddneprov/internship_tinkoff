package com.company.intership;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if(x1 - x2 == 0)
            return;

        double a = (double)(y1 - y2)/(x1 - x2);
        double b = y1 - a * x1;
        for(int i = Math.min(x1, x2); i <= Math.max(x1,x2); ++i){
            double y = a * i + b;
            if(y == Math.floor(y)) {
                ++sum;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}