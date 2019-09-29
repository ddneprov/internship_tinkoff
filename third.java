package com.company;
import java.util.Scanner;

// HE2LO
// HE12L3O

public class third {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String number = "";
        boolean flag = false;

        try {
            for (int i = 0; i < str.length(); i++) {
                while(Character.isDigit(str.charAt(i))) {
                    flag = true;
                    number += str.charAt(i);
                    i++;
                }
                if (flag) {
                    int number_int = Integer.parseInt(number);
                    String line = "";
                    for(int k = 0; k < number_int - 1; k++)
                        line += str.charAt(i);

                    str = str.replace(number, line);
                    number = "";
                    flag = false;
                }
            }
            System.out.println(str);
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
