package com.frank.myleetcode;

/**
 * Created by FH on 2017/3/9.
 */

public class Solution6 {
    public String convert(String s, int numRows) {
        int currentLineIndex = 0;
        StringBuilder[] buillderArrows = new StringBuilder[numRows];
        for (int i = 0 ; i < numRows ; i++){
            buillderArrows[i] = new StringBuilder();
        }
        //0 是下方向,1 是上方向
        int direction = 0;
        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if (direction == 0){
                buillderArrows[currentLineIndex].append(c);
                if (currentLineIndex < (numRows - 1)){
                    currentLineIndex++;
                }
                else {
                    direction = 1;
                    if (currentLineIndex > 0){
                        currentLineIndex-- ;
                    }
                }
            }
            else if (direction == 1){
                if (currentLineIndex == 0){
                    direction = 0;
                    i--;
                }
                else {
                    buillderArrows[currentLineIndex].append(c);
                    currentLineIndex--;
                }
            }
        }
        for (int i = 1 ; i < numRows ; i++){
            buillderArrows[0].append(buillderArrows[i]);
        }
        return buillderArrows[0].toString();
    }
}
