class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String s_1: s1) {
            for(String s_2: s2) {
                if(s_1.equals(s_2))
                    answer++;
            }
        }
        
        return answer;
    }
}