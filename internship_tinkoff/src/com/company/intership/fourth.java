package com.company.intership;

import java.util.Scanner;

class fouth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        try {
            N = sc.nextInt();
        }
        catch (ClassCastException ex){
            ex.printStackTrace();
            System.exit(0);
        }

        boolean norm = false;
        int [][] arr = new int[N][N];
        int [] dop = new int[N];
        for(int i = 0; i < N; ++i){
            for(int j = 0; j < N; ++j){
                arr[i][j] = sc.nextInt();
            }
            dop[i] = 0;
        }



        for (int k = 0; k < N; ++k) {
            if(dfs(k, arr, dop)) {
                norm = true;
                break;
            }
        }

        //
        System.out.println(norm? "1" : "0");
        sc.close();
    }


    private static boolean dfs(int i, int[][] array, int [] dop){
        if(dop[i]==2)
            return false;
        dop[i] = 1;
        for(int k = 0; k < array.length; ++k){
            if(dop[k] == 0 && array[k][i] == 1)
                dfs(k, array, dop);
            if(dop[k] == 1 && array[k][i] == 1)
                return true;
        }
        dop[i] = 2;
        return false;
    }
}
