class Solution {
    public int[] solution(int n) {
        int len = n / 2;
        if(n % 2 != 0) len++;
        
        int[] answer = new int[len];
        
        int a = 1;
        for(int i = 0; i < len; i++) {
            answer[i] = a;
            a += 2;
        }
        return answer;
    }
}