import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        
        loop:
        for(int a: arr) {
            for(int d: delete_list) {
                if(a == d) continue loop;
            }
            answer.add(a);
        }
        
        return answer;
    }
}