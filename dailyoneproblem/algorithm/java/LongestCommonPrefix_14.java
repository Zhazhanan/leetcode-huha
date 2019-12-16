/**
 * Description
 * <br> Created by WangKun on 2019/12/16
 * <br> Longest Common Prefix
 **/
public class LongestCommonPrefix_14 {

    /**
     * @lc app=leetcode id=14 lang=java
     * <p>
     * [14] Longest Common Prefix
     */
    public static boolean isCommonPrefix(String[] array, int middle) {
        var prefix = array[0].substring(0, middle);
        for (int i = 1; i < array.length; i++) {
            if (!array[i].startsWith(prefix)) return false;
        }

        return true;
    }

    /**
     * @param {string[]} array
     * @return {string}
     */
    public static String longestCommonPrefix(String[] array) {
        {
            if (null == array || array.length == 0) return "";
            if (array.length == 1) return array[0];

            var minLen = Integer.MAX_VALUE;

            for (String s : array) {
                minLen = Math.min(minLen, s.length());
            }

            var low = 0;
            var high = minLen;

            while (low <= high) {
                var middle = (low + high) >> 1;
                if (isCommonPrefix(array, middle)) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }

            return array[0].substring(0, (low + high) >> 1);
        }
    }

    public static void main(String[] args) {
        String[] array = {"flower", "flow", "flight"};
        String s = longestCommonPrefix(array);
        System.out.println("-----" + s);
    }

}
