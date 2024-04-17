package com.pooja.learn.Array;

import java.util.*;

public class Clumio2 {

    public static ArrayList<Integer> simpleQueue(ArrayList<Integer> input){
        ArrayList<Integer> sortedArray = new ArrayList<>(input);
        Map order = new HashMap<Integer,Integer>();
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(sortedArray);
        order.put(sortedArray.get(0),1);
        int index=1;
        for(int i =1; i<input.size();i++){
            if( sortedArray.get(i) == sortedArray.get(i-1)){
            }
            else {
                order.put(sortedArray.get(i),++index);
            }
        }
        System.out.println(order);
        for(int i =0; i<sortedArray.size();i++){
            result.add((Integer)order.get(input.get(i)));
        }
        return result;

    }
    public static void main(String[] args) {
        ArrayList<Integer> pq = new ArrayList<>();
        Collections.addAll(pq, 1,7,2,4,9,1);
        System.out.println(simpleQueue(pq));

    }
}
