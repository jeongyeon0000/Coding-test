import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        while(n != 1){
            answer.add(n);
            if(n%2 == 0){
                n /= 2;
                continue;
            }
            n = 3*n+1;
        }
        answer.add(n);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}