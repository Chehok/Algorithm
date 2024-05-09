class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        int cnt = 0;
        
        if (s < n) return new int[]{-1};
        cnt = s % n;
        for(int i = 0; i < n; i++) {
            answer[i] = s / n;
        }
        
        int idx = n - 1;
        for(int i = 0; i < cnt; i++) {
            answer[idx--]++;
        }
        
        return answer;
    }
}