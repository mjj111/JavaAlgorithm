package LV1;

public class 하샤드수 {
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            int sum = 0;
            int a = x;
            while(a>0){
                sum+= a%10;
                a /=10;
            }
            if ( x % sum != 0){
                answer = false;
            }
            return answer;
        }
    }
}
