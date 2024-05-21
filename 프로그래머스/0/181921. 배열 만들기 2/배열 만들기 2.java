import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        int idx = 1;
        
        while(true) {
            int val = Integer.valueOf(Integer.toString(idx++, 2)) * 5;
            if(val < l) continue;
            if(val > r) break;
            
            answer.add(val);
        }
        
        if(answer.isEmpty()) answer.add(-1);
        
        return answer;
    }
}