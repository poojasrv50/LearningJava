package com.pooja.learn.string;

import java.util.*;

public class Clumio1 {
    static String programmer = "programmer";


    public static int getIndex(String input){
        ArrayList<Character> prgm = new ArrayList<>();
        Collections.addAll(prgm,'p','r','o','g','a','m','e');
        ArrayList<Integer> freq = new ArrayList<>();
        Collections.addAll(freq,1, 3, 1, 1, 1,2,1);
        int maxIndex =0;
        for(int i=0; i< prgm.size(); i++){
            Character myElement = prgm.get(i);
            for(int j=0; j<input.length();j++){
                if(myElement.equals(input.charAt(j))){
                    freq.set(i,freq.get(i)-1);
                }
                if(freq.get(i) == 0){
                    if(j>maxIndex){
                        maxIndex=j;
                    }
                    break;
                }
            }
            if(freq.get(i) > 0)
                return -1;
        }
        return maxIndex;

    }
    public static int getProgrammer(String input){
        int firstIndex=getIndex(input);
        StringBuilder sb = new StringBuilder(input);
        int lastIndex = getIndex(sb.reverse().toString());
        System.out.println("firstIndex: "+firstIndex+"lastIndex: "+lastIndex);
        return (input.length()-1-lastIndex)-firstIndex-1;

    }

    public static void main(String[] args) {
        String input="rammerabcprogppppppppprogrammerc";
        System.out.println(getProgrammer(input));

    }

}
