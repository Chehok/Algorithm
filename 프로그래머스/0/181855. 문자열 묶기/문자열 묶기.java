class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] strLen = new int[31];
        
        for(String s: strArr) {
            strLen[s.length()]++;
        }
        
        for(int a: strLen) {
            answer = Math.max(a, answer);
        }
        
        return answer;
    }
}