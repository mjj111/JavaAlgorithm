package LV1;

public class 수박수박 {
    class Solution {
        public String solution(int n) {
            String answer = "";
            for(int i = 0; i < n; i ++)
                answer+= (i%2==1)?"박":"수";
            return answer;
        }
    }
}
