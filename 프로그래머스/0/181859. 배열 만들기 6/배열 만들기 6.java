import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        for(int a: arr) {
            if(answer.size() == 0) answer.add(a);
            else {
                if(answer.get(answer.size() - 1) == a) {
                    answer.remove(answer.size() - 1);
                } else {
                    answer.add(a);
                }
            }
        }
        
        if(answer.size() == 0) answer.add(-1);
        
        return answer;
    }
}