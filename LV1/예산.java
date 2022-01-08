
import java.util.*;
public class 예산 {
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int idx = 0;
        while(idx<d.length) {
            if(idx>0) d[idx] += d[idx-1];
            if(budget<d[idx]) break;
            idx++;
        }
        return idx;
    }
}
    
}
