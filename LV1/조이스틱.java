public class 조이스틱 {
class Solution {
    public int solution(String name) {
        int answer = 0;
        int alpha = 'Z'-'A'+1;
        
        //각 자리에서 위,아래로 최소 이동값
        for(int i=0; i<name.length(); i++) {
            int temp = name.charAt(i) - 'A';
            if(temp==0) continue;
            answer += Math.min(temp, alpha-temp);
        }
        
        //최소 자리 이동값
        int minCount = name.length()-1; //기본 이동거리는 길이 - 1
        for(int i=0; i<name.length(); i++) {
            if(name.charAt(i)=='A') continue;
            int check = i+1;
            while(check<name.length() && name.charAt(check)=='A') {
                check++;
            }
            int moveCount = i*2 + (name.length() - check); //현재위치+돌아갈거리 + 끝위치
            minCount = Math.min(minCount, moveCount);
        }
        
        return answer + minCount;
    }
}
}
