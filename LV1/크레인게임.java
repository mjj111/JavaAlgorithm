import java.util.Stack;
public class 크레인게임 {
class Solution {
	public  int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0; i<moves.length; i++) {
			for(int j=0; j<board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					if(s.isEmpty())
						s.push(board[j][moves[i]-1]);
					else {
						if(s.peek() == board[j][moves[i]-1]) {
							s.pop();
							answer += 2;
						}
						else {
							s.push(board[j][moves[i]-1]);
						}
					}
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		return answer;
	}
}
    
}
