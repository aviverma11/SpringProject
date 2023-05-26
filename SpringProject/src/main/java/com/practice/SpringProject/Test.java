package com.practice.SpringProject;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String str = "aaaaaaa";
        String str1 = "Avinash";
        String str2 = "Communications";

        //str2.codePoints().mapToObj(e->(char)e).collect(Collectors.groupingBy());
        Map<Character,Long> map = str2.codePoints().mapToObj(e->(char)e)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println("MAP:  "+map);


        String output = Arrays.asList(str.split("")).stream().distinct().collect(Collectors.joining());
        long count = str1.codePoints().filter(ch->ch=='A').count();
        long count2 = str1.chars().filter(ch->ch=='a').count();
        System.out.println("count2: "+count2);
       Map<String,Long>result =  Arrays.stream(str2.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new,Collectors.counting()));
        System.out.println("occurenc in map:"+result);
        System.out.println("occurence of A:"+count);
        System.out.println(output);
    }

}
