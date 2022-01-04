package LV1;
import java.util.Scanner;
public class 직사각형별찍기 {
    class Solution{
        public boolean solution(int x){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean a = true;
            for (int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        return a;
        }
    }
}
    

