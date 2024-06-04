class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int sum = 0;
        for(int i = 0; i < num; i++) {
            answer[i] = i + 1;
            sum += answer[i];
        }
        
        int add = (total - sum) / num;
        
        for(int i = 0; i < num; i++) {
            answer[i] += add;
        }
        
        return answer;
    }
}