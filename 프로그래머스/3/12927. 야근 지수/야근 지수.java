import java.util.Arrays;

class Solution {
    public long solution(int n, int[] works) {
        int len = works.length - 1;
        long answer = 0;
        Arrays.sort(works);
        
        while(n > 0 && works[len] > 0) {
            int idx = len;
            while (n > 0 && 0 <= idx && works[idx] >= works[len]) {
                works[idx--]--;
                n--;
            }
        }
        
        for(int a: works) {
            answer += a * a;
        }
        return answer;
    }
}