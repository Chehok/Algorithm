import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        int idx = 0;
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++) q.add(i);
        
        for(int i = n - 1; i >= 0; i--) {
            long fact = getFactorial(i);
            long a = (k - 1) / fact + 1;
            
            long size = q.size();
            for(long j = 1; j <= size; j++) {
                if(j == a) {
                    answer[idx++] = q.poll();
                } else {
                    q.add(q.poll());
                }
            }
            
            k = (k - 1) % fact + 1;
        }
        
        return answer;
    }
    
    long getFactorial(int n) {
        long factorial = 1;
        for(int i = n; i > 0; i--){
            factorial *= i;
        }
        return factorial;
    }
}