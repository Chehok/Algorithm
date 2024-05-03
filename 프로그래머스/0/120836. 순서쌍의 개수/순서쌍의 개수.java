import java.util.Set;
import java.util.HashSet;

class Solution {
    Set<Integer> set = new HashSet<>();
    
    public int solution(int n) {
        set.add(1);
        set.add(n);
        getDivisor(n);
        
        return set.size();    
    }
    
    public void getDivisor(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }
    }
}