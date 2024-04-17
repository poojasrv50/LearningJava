package practice;

import java.util.*;

public class LeastUnique {

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map1 = new HashMap<>();

        for(int num : arr){
            if(map1.containsKey(num)) map1.put(num,map1.get(num)+1);
            else {
                map1.put(num,1);
            }
        }
        List<Integer> frequncyList = new ArrayList<>(map1.values());
        Collections.sort(frequncyList);
        int remove = 0;
        System.out.println(frequncyList);
        while (remove<k){
            if(frequncyList.get(0) == 1) {
                frequncyList.remove(0);

            }
            else{
                frequncyList.set(0,frequncyList.get(0)-1);
            }
            remove++;
        }
        System.out.println(frequncyList);
        return frequncyList.size();
    }

    public static void main(String[] args) {
        int[] input =  {4,3,1,1,3,3,2};
        System.out.println(findLeastNumOfUniqueInts(input,3));

    }
}
