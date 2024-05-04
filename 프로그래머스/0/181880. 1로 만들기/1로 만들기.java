class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i: num_list) {
            int cnt = 0;
            
            while(i != 1) {
                i /= 2;
                cnt++;
            }
            
            answer += cnt;
        }
        
        return answer;
    }
}