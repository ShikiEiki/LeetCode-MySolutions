package frank.com.jnitest;

/**
 * Created by fuhan on 2017/1/15.
 */

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2){
            return s.length();
        }
        int begin = 0 , end;
        int returnStrLength = 1;
        String substr;
        while (begin < s.length() - 1){
            end = begin + 1 + returnStrLength;
            while (end <= s.length()){
                substr = s.substring(begin , end);
                boolean found = false;
                for (int i = 0 ; i < substr.length() ; i++){
                    if (substr.indexOf(substr.charAt(i) , i + 1) != -1){
                        found = true;
                        break;
                    }
                }
                if (!found){
                    end++;
                }
                else {
                    break;
                }
            }
            if (end - begin - 1 > returnStrLength){
                returnStrLength = end - begin - 1;
            }
            begin++;
        }
        return returnStrLength;
    }
}


