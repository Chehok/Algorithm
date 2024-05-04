import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 4; i <= n; i++) {
            if(getMeasureCnt(i) >= 3) 
                answer++;
        }
        
        return answer;
    }
    
    public int getMeasureCnt(int n) {
        Set<Integer> set = new HashSet<>();
        
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }
        
        return set.size();
    }
}