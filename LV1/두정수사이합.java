package LV1;

public class 두정수사이합 {
    class Solution {
        public long solution(int a, int b) {
            int start = 0, end = 0;
            long sum = 0;
            
            if (a == b) {
                return a;
            } else if (a < b) {
                start = a;
                end = b;
            } else if (b < a) {
                start = b;
                end = a;
            }
            
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            
            return sum;
        }
    }
}
