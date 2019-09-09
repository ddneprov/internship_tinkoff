/*
package com.company.intership;

import java.util.Scanner;

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

class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int number = 0;

        Pair t1 = new Pair(-1, -1);
        Pair t2 = new Pair(-1,-1);
        Pair t3 = new Pair(-1,-1);

        String str = "";

        for(int i=0; i<N; ++i){
            try {
                int x = sc.nextInt();
                int y = sc.nextInt();

                ++number;
                number %= 3;

                switch (number)
                {
                    case (1):
                        str = Count(x, y, t1, str);
                        break;
                    case (2):
                        str = Count(x, y, t2, str);
                        break;
                    default:
                        str = Count(x, y, t3, str);
                        break;
                }
            }
            catch (ClassCastException ex){
                ex.printStackTrace();
            }
        }

        System.out.println(str);
        sc.close();
    }


    private static String Count(int hours, int minutes, Pair pair, String str){

        int a = 30;
        if(pair.getSecond() == -1){
            pair.setFirst(hours);
            pair.setSecond(minutes);
        }
        else{
            pair.setFirst((pair.getFirst() + ((pair.getSecond() + 30)/60))%24);
            pair.setSecond((pair.getSecond() + 30)%60);
            if(hours - pair.getFirst()>0 | minutes - pair.getSecond()>=0)
                a = 30;
            else
                a = Math.abs(minutes - pair.getSecond() - 30);
        }

        hours = (hours + ((minutes +a ) / 60) % 24);
        minutes = (minutes + a) % 60;

        if(minutes<10)
            str += hours + " " + minutes + "\n";
        else
            str += hours + " " + minutes;
        return str;
    }
}


*/
