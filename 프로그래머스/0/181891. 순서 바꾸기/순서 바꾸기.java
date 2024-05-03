class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];
        
        for(int i = 0; i < n; i++) {
            answer[len - n + i] = num_list[i];
        }
        for(int i = n; i < len; i++) {
            answer[i - n] = num_list[i];
        }
        
        return answer;
    }
}