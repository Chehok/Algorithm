import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new HashSet<>();
        
        int idx = 0;
        for(int i: arr) {
            if(k <= idx) break;
            if(set.add(i)){
                answer[idx++] = i;
            }
        }
        
        for(int i = idx; i < k; i++)
            answer[i] = -1; 
        
        return answer;
    }
}