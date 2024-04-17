package com.pooja.learn.string;

import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        HashMap referance = new HashMap<String,Integer>();
        referance.put('I',1);
        referance.put('V',5);
        referance.put('X',10);
        referance.put('L',50);
        referance.put('C',100);
        referance.put('D',500);
        referance.put('M',1000);

        char[] charArray = s.toCharArray();
        int value = 0;
        for (int i =0; i<charArray.length; i++)
        {
            if (i !=(charArray.length-1))
            {


                if(charArray[i] == 'I' && charArray[i+1] == 'V' ){
                    value = value + 4;
                    i++;

                }
                else if(charArray[i] == 'I' && charArray[i+1] == 'X'){

                    value = value + 9;
                    i++;

                }
                else if(charArray[i] == 'X' && charArray[i+1] == 'L')
                {
                    value = value + 40;
                    i++;

                }
                else if(charArray[i] == 'X' && charArray[i+1] == 'C')
                {
                    value = value + 90;
                    i++;

                }
                else if(charArray[i] == 'C' && charArray[i+1] == 'D')
                {
                    value = value + 400;
                    i++;

                }
                else if(charArray[i] == 'C' && charArray[i+1] == 'M')
                {
                    value = value + 900;
                    i++;

                }
                else{

                    value = value + (Integer)referance.get(charArray[i]);
                }

            }
            else{

                value = value + (Integer)referance.get(charArray[i]);
            }

        }
        System.out.println(value);

        return value;
    }
}
