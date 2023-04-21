package javaInterview;

import java.util.ArrayList;

public class CountOfOcurrence {
    public static void main(String[] args) {
        String str = "avinash";
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1001);
        al.add(1002);
        al.add(1003);
        al.add(1004);

        long cnt =  str.chars().filter(x ->x=='a').count();
        System.out.println("count of a: "+cnt);
    }
}

