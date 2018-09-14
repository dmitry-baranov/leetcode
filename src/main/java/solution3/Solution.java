package solution3;

import java.util.HashMap;
import java.util.Map;

class Solution {
    int lengthOfLongestSubstring(String s) {
        char[] string = s.toCharArray();
        int increment = 0;
        int max = 0;
        Map<String, Integer> subString = new HashMap<String, Integer>();
        for (int i = 0; i < string.length; i++) {
            if (!subString.containsKey(String.valueOf(string[i]))) {
                subString.put(String.valueOf(string[i]), i);
                increment = increment + 1;
                if (increment > max) {
                    max = increment;
                }
            } else {
                i = subString.get(String.valueOf(string[i])) + 1;
                subString = new HashMap<String, Integer>();
                subString.put(String.valueOf(string[i]),i);
                increment = 1;
            }
        }
        return max;

    }
    public int lengthOfLongestSubstring1(String s) {
        int n = s.length(), result = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            result = Math.max(result, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return result;
    }
}
