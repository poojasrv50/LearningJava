package util;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {

    public static void print2DArray(char[][] T) {
        if (T == null) return;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print("T[" + i + "," + j + "] " + T[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void print2DArray(int[][] T) {
        if (T == null) return;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print("T[" + i + "," + j + "] " + T[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void print2DArray(String[][] T) {
        if (T == null) return;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print("T[" + i + "," + j + "] " + T[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void print2DArray(Object[][] T) {
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print("T[" + i + "," + j + "] " + T[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] array) {
        if (array == null) return;
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }

    public static void printArray(boolean[] array) {
        if (array == null) return;
        for (boolean j : array) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }

    public static void printArray(char[] array) {
        if (array == null) return;
        for (char j : array) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }

    public static void printArray(Object[] array) {
        if (array == null) return;
        for (Object j : array) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int anArr : arr)
            if (max < anArr)
                max = anArr;
        return max;
    }

    public static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int anArr : arr)
            if (min > anArr)
                min = anArr;
        return min;
    }

    public static int[][] parse2DArray(String str) {
        String[] filteredArraysAsString = sanitize(str);
        List<int[]> finalList = new ArrayList<>();

        for (String array : filteredArraysAsString) {
            finalList.add(parseArray(array));
        }

        int[][] result = new int[finalList.size()][finalList.get(0).length];

        for (int i = 0; i < finalList.size(); i++) {
            result[i] = finalList.get(i);
        }
        return result;
    }

    public static char[][] parse2DCharArray(String str) {
        String[] filteredArraysAsString = sanitize(str);
        List<char[]> finalList = new ArrayList<>();

        for (String array : filteredArraysAsString) {
            finalList.add(parseCharArray(array));
        }

        char[][] result = new char[finalList.size()][finalList.get(0).length];

        for (int i = 0; i < finalList.size(); i++) {
            result[i] = finalList.get(i);
        }
        return result;
    }

    private static String[] sanitize(String str) {
        str = str.replace("\n", "").replace("\r", "");
        str = str.trim();
        str = str.replaceAll("\\s", "");
        str = str.substring(2, str.length() - 2);
        str = str.replace("]", "#");
        str = str.replace("[", "#");
        return str.split("#,#");
    }

    public static int[] parseArray(String str) {
        int indexOfB1 = str.indexOf("[");
        int indexOfB2 = str.indexOf("]");

        if (indexOfB1 >= 0 && indexOfB2 >= 0) str = str.substring(str.indexOf("[") + 1, str.indexOf("]"));

        str = str.replace(",", " ");
        str = str.trim();
        String[] arr = str.split(" ");
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (i != arr.length) {
            try {
                if (arr[i].length() == 0) {
                    i++;
                    continue;
                }
                list.add(Integer.parseInt(arr[i].trim()));
            } catch (NumberFormatException e) {
                //nothing
            }
            i++;
        }

        return list.stream().mapToInt(ij -> ij).toArray();
    }

    public static char[] parseCharArray(String str) {
        int indexOfB1 = str.indexOf("[");
        int indexOfB2 = str.indexOf("]");

        if (indexOfB1 >= 0 && indexOfB2 >= 0) str = str.substring(str.indexOf("[") + 1, str.indexOf("]"));

        str = str.replace(",", " ");
        str = str.replace("'", "");
        str = str.replace(" ", "");
        str = str.trim();
        char[] charArr = new char[str.length()];

        for(int i=0;i<charArr.length;i++) {
            charArr[i] = str.charAt(i);
        }

        return charArr;
    }

    public static Integer[] generateArray(int num, boolean fromZero) {
        Integer[] arr = new Integer[num];
        int start = (fromZero) ? 0 : 1;

        for (int i = 0; i < num; i++) {
            arr[i] = start++;
        }

        return arr;
    }

    public static List<List<Integer>> getNestedListFrom2DArray(int[][] arr) {
        List<List<Integer>> list = new ArrayList<>();
        for (int[] ints : arr) {
            List<Integer> temp = new ArrayList<>();
            for (int anInt : ints) {
                temp.add(anInt);
            }
            list.add(temp);
        }

        return list;
    }

    public static List<List<Integer>> getNestedListFromString(String str) {
        int[][] arr = parse2DArray(str);
        return getNestedListFrom2DArray(arr);
    }

}