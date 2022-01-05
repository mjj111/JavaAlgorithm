package LV1;
import java.util.*;
public class 정수내림차순 {
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] array = ("" + n).split("");
        Arrays.sort(array);
        Collections.reverse(Arrays.asList(array));
        answer = Long.parseLong(String.join("", array));
        return answer;
    }
}
//long 자료형을 문자열로 만드는 것과 정렬 함수(Arrays.sort(), Collections.reverse())를 사용하는 것이 핵심!
}
