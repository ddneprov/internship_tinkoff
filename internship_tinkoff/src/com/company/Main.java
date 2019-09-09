package com.company;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
class Vertex
{
    private final Integer x;
    private final Integer y;

    public Vertex(Integer x, Integer y) {
        this.x   = x;
        this.y = y;
    }

    public Integer getX()   { return x; }
    public Integer getY() { return y; }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int N = in.nextInt();

        ArrayList<Vertex> vertexes = new ArrayList<>();

        for(int i = 0 ; i < N; i++) {
            Vertex v = new Vertex(in.nextInt(), in.nextInt());
            vertexes.add(v);
        }


        double s_final = 0;
        for (int i = 0; i <  N-2; i++)
        {
            for(int j = i+1; j < N-1; j++)
            {
                for (int k = j+1; k < N; k++)
                {
                    // s:=abs((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3))/2
                    double a = (vertexes.get(i).getX() - vertexes.get(k).getX());
                    double b = (vertexes.get(j).getY() - vertexes.get(k).getY());
                    double c = (vertexes.get(j).getX() - vertexes.get(k).getX());
                    double d = (vertexes.get(i).getY() - vertexes.get(k).getY());

                    double s = Math.abs((a*b-c*d)/2);
                    if (s > s_final)
                        s_final = s;
                }
            }
        }

        System.out.print(s_final);

        in.close();
    }
}
*/
