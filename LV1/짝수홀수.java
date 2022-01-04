package LV1;
import java.util.*;
public class 짝수홀수 {
class Solution {
    public String solution(int num) {
        ArrayList<String> answer = new ArrayList<>();
        if (num%2 == 0){
            answer.add("Even");
        }else{
            answer.add("Odd");
        }
        return answer.get(0);
    }
}
    
}
