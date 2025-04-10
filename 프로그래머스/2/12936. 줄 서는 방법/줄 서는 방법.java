class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        int[] q = new int[n + 1];
        int idx = 0;
        
        for(int i = 1; i <= n; i++) q[i] = i;
        
        for(int i = n - 1; i >= 0; i--) {
            long fact = getFactorial(i);
            int a = (int) ((k - 1) / fact + 1);
            
            answer[idx++] = q[a];
            
            for(int j = a; j <= i; j++) q[j] = q[j + 1];
            
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