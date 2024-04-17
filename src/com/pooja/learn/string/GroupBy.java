package com.pooja.learn.string;

import java.util.*;

public class GroupBy {


    public HashMap<Character, Integer> GroupByFun(String input) {
        HashMap<Character, Integer> groupbyout = new HashMap<Character, Integer>();
        char[] strchar = input.toCharArray();
        for (char i : strchar) {
            if (groupbyout.containsKey(i))
                groupbyout.put(i, groupbyout.get(i) + 1);
            else
                groupbyout.put(i, 1);

        }


        return groupbyout;
    }

    public static void main(String[] args) {
        System.out.println("Enter an input");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        GroupBy test = new GroupBy();

        HashMap<Character, Integer> output = test.GroupByFun(input);
        output.forEach((key, value) -> System.out.println(key + " " + value));

    }
}
