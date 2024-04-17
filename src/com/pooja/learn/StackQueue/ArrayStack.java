package com.pooja.learn.StackQueue;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack {

    public static List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int i=1,j=0;
        while(i<=n && j<target.length){
            if(target[j] == i){
                ans.add("Push");
                j++;
            }
            else {
               ans.add("Push");
               ans.add("Pop");
            }
            i++;
        }

    return ans;
    }



    public static void main(String[] args) {
        int[] target = { 1, 3};
        int n = 3;
        System.out.println(buildArray(target,n));

    }
}
