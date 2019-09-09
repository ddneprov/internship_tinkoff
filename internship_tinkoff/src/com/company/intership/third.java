package com.company.intership;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class third {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        Pattern pattern = Pattern.compile("[:;][-]*+[()\\[\\]]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find())
            count++;
        System.out.println(count);


        /*int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ':' || str.charAt(i) == ';') {
                int q = i;
                if(q + 1 < str.length())
                    q++;
                while (str.charAt(q) == '-' && q+1<str.length())
                    q++;
                if (str.charAt(q) == '[' || str.charAt(q) == '(' || str.charAt(q) == ')' || str.charAt(q) == ']') {
                    answer++;
                    i = q;
                }
            }
        }
        System.out.println(answer);*/
        sc.close();
    }
}