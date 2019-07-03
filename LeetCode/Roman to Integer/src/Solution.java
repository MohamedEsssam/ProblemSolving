import java.util.Hashtable;

/**
 * Created by Mohamed Essam on 5/23/2019.
 */

public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int sub = 0;
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        hashtable.put('I', 1);
        hashtable.put('V', 5);
        hashtable.put('X', 10);
        hashtable.put('L', 50);
        hashtable.put('C', 100);
        hashtable.put('D', 500);
        hashtable.put('M', 1000);

        if (s.length() == 0) return 0;
        else {
            for (int i = 0; i < s.length(); i++) {
                if (!hashtable.containsKey(s.charAt(i)))
                    return 0;
                else {
                    if (i < s.length() - 1) {
                        if (s.charAt(i) == 'I') {
                            if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') sub += 2;
                        }
                        if (s.charAt(i) == 'X') {
                            if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') sub += 20;
                        }
                        if (s.charAt(i) == 'C') {
                            if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') sub += 200;
                        }
                    }
                    sum += hashtable.get(s.charAt(i)).intValue();
                }
            }
        }
        return sum-sub;
        }
    }
