import java.util.Set;
import java.util.TreeSet;

class Solution {
    Set<Integer> set = new TreeSet<>();
    
    public int[] solution(int n) {
        getDivisor(n);
        int[] answer = new int[set.size()];
        
        int idx = 0;
        for(int i: set){
            answer[idx++] = i;
        }
        
        return answer;
    }
    
    public void getDivisor(int n) {
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }
    }
}