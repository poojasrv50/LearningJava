import java.util.ArrayList;
import java.util.List;

public class BlackLine {
    public static int subStringMax(String str1, String str2) {
        List<Character> ans = new ArrayList<>();
        int maxSubstring = 0;
        List<Character> myList = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            Character myChar = str1.charAt(i);
            if (str2.indexOf(myChar) != -1) {
                myList.add(myChar);
            } else {
                if (myList.size() > maxSubstring) {
                    maxSubstring = myList.size();
                    ans.clear();
                    ans.addAll(myList);
                }
                myList.clear();
            }
        }
        System.out.println(ans);
        return maxSubstring;
    }

    public static void main(String[] args) {
        String str1 = "abcdefacbccbagfacbacer";
        String str2 = "abc";
        System.out.println(subStringMax(str1, str2));
    }
}
