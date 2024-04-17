public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String Output = "";
        String reference = strs[0];


        for (int j = 0; j < reference.length(); j++) {
            boolean commonpf = false;
            if (strs.length == 1)
                commonpf = true;

            for (int i = 1; i < strs.length; i++) {

                if (strs[i].length() > j) {


                    if (strs[i].charAt(j) != reference.charAt(j)) {
                        commonpf = false;
                        break;
                    } else
                        commonpf = true;
                } else {
                    commonpf = false;
                    break;
                }

            }

            if (commonpf) {
                Output = Output + reference.charAt(j);
            } else
                break;
        }
        return Output;
    }
}
