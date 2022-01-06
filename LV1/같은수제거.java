package LV1;
import java.util.*;

public class 같은수제거 {

    public class Solution {
        public  ArrayList<Integer> solution(int[] arr) {
            ArrayList<Integer> answer = new ArrayList<>();
            int n = 10;
            for ( int i = 0; i < arr.length; i++){
                if( arr[i]!= n)
                    answer.add(arr[i]);
                    n = arr[i];
            }
            return answer;
        }
    }
        
}
