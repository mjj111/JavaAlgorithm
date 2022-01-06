package LV1;

public class 문자열다루기기본 {
    class Solution {
        public boolean solution(String s) {
            if(s.length() == 4 || s.length() == 6){
                try{
                    int aa = Integer.parseInt(s);
                    return true;
                } catch(NumberFormatException e){ 
                    return false;
                }
            }
            else return false;
        }
      }
}
