import java.util.*;
public class 가장큰수 {

class Solution {
    public String solution(int[] numbers) {
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
            return Integer.valueOf(b+a)-Integer.valueOf(a+b);
        });
        for(int num : numbers) pq.offer(String.valueOf(num));
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            String n = pq.poll();
            if(sb.length()==0 && n.equals("0")) continue;
            sb.append(n);
        }
        return sb.length()==0?"0":sb.toString();
    }
}
}
