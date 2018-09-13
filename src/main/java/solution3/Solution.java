package solution3;

import java.util.HashSet;
import java.util.Set;

class Solution {
    int lengthOfLongestSubstring(String s) {
        char[] string = s.toCharArray();
        int increment = 0;
        int max = 0;
        Set<String> subString = new HashSet<String>();
        for (char aString : string) {
            if (subString.add(String.valueOf(aString))) {
                increment = increment + 1;
                if (increment > max) {
                    max = increment;
                }
            } else {
                subString = new HashSet<String>();
                subString.add(String.valueOf(aString));
                increment = 1;
            }
        }
        return max;
    }
}
