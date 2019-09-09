package com.company.intership;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int N = sc.nextInt();
            List<Pair> pairs = new ArrayList<>();
            for (int i = 0; i < N; ++i)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                pairs.add(new Pair(a, b));
            }
            float S = 0;
            for (int i = 0; i < N - 2; ++i)
            {
                for (int j = i + 1; j < N - 1; ++j)
                {
                    for (int l = j + 1; l < N; ++l) {

                        double a1 = Math.abs(pairs.get(i).getSecond() - pairs.get(j).getSecond());
                        double a2 = Math.abs(pairs.get(i).getFirst() - pairs.get(j).getFirst());
                        double a = Math.sqrt(a1 * a1 + a2 * a2);

                        double b1 = Math.abs(pairs.get(i).getSecond() - pairs.get(l).getSecond());
                        double b2 = Math.abs(pairs.get(i).getFirst() - pairs.get(l).getFirst());
                        double b = Math.sqrt(b1 * b1 + b2 * b2);

                        double c1 = Math.abs(pairs.get(l).getSecond() - pairs.get(j).getSecond());
                        double c2 = Math.abs(pairs.get(l).getFirst() - pairs.get(j).getFirst());
                        double c = Math.sqrt(c1 * c1 + c2 * c2);

                        double p = (a + b + c) / 2;
                        if (Math.sqrt(p * (p - a) * (p - b) * (p - c)) > S) {
                            S = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
                        }
                    }

                }
            }
            System.out.println(S);
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
        sc.close();
    }
}

class Pair{
    private int first, second;
    public Pair( int first, int second ){
        this.first = first;
        this.second = second;
    }
    public void setFirst( int first ){ this.first = first; }
    public void setSecond( int second ){ this.second = second; }
    public int getFirst(){ return first; }
    public int getSecond(){ return second; }
}

