import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new TreeSet<>();
        
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                if(check(i)) {
                    set.add(i);
                }
            }
        }
        
        int[] answer = new int[set.size()];
        
        int idx = 0;
        for(int a: set) {
            answer[idx++] = a;
        }
        
        return answer;
    }
    
    boolean check(int a) {
        for(int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i  == 0) return false;
        }
        return true;
    }
}