package LV1;

public class 약수의합 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i =1; i < n+1; i ++) answer += (n%i ==0) ?  i : 0;
            return answer;
        }
    }
}
