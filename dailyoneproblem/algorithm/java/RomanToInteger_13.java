/**
 * Description
 * <br> Created by WangKun on 2020/01/10
 * <br> 罗马数字转整数
 **/
public class RomanToInteger_13 {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap(7);
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int l = s.length() - 1;
        int r = map.get(s.charAt(l));
        for (int i = l; i > 0; i--) {
            int a = map.get(s.charAt(i));
            int b = map.get(s.charAt(i - 1));
            if (a <= b) {
                r += b;
            } else {
                r -= b;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        String string = "MCMXCIV";
        int i = romanToInt(string);
        System.out.println(string + "-----" + i);

    }
}
