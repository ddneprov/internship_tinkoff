package com.company;
import java.util.Scanner;


public class second {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        Integer str = sc.nextInt();

        int [] data = new int[str];
        for (int i = 0; i < str; i++)
            data[i] = sc.nextInt();
/*
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < str; i++)
            map.put(i, sc.nextInt());*/

        int x1 = -1;
        int x2 = -1;
        int max = -1;

        for(int i = 0; i < str - 1; ++i) {
            for(int j = i+1; j<str; ++j) {
                if(data[j] - data[i] > max) {
                    max = data[j] - data[i];
                    x1 = i;
                    x2 = j;
                }
            }
        }

        System.out.println(x1 + 1);
        System.out.println(x2 + 1);


        /*List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare( Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b ) {
                return a.getValue() - b.getValue();
            }
        });
*/

        /*int min = list.get(0).getValue();
        int max = list.get(list.size() - 1).getValue();

        if (list.get(0).getKey() > list.get(list.size() - 1).getKey()) {
            for (int i = 1; i < (str - 1); i++) {
                int c = 100;
                if (list.get(i).getKey() < list.get(list.size() - 1).getKey()) {

                }
            }
        }*/
    }
}
