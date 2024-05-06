import java.util.Collections;
import java.util.Arrays;

class Solution {
    public long solution(int n, int[] works) {
        Integer[] _works = new Integer[works.length];
        long answer = 0;
        
        for(int i = 0; i < works.length; i++) _works[i] = works[i];
        Arrays.sort(_works, Collections.reverseOrder());
        
        while(n > 0 && _works[0] > 0) {
            int idx = 0;
            while (n > 0 && idx < works.length && _works[idx] >= _works[0]) {
                _works[idx]--;
                n--;
                idx++;
            }
        }
        
        for(int a: _works) {
            answer += a * a;
        }
        return answer;
    }
}