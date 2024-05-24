class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int[] cnt = new int[100000];
        
        int idx = 0;
        for(int i: arr) {
            if(k <= idx) break;
            if(cnt[i] == 0) {
                answer[idx++] = i;
            }
            cnt[i]++;
        }
        
        for(int i = idx; i < k; i++)
            answer[i] = -1;
        
        return answer;
    }
}