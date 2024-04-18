class Solution {
    public int solution(int n, int m, int[] section) {
        int result = 1;
        
        int startIdx = section[0];
        for(int i = 0; i < section.length; i++) {
            if(m < section[i] - startIdx + 1) {
                startIdx = section[i];
                result++;
            }
        }
        
        return result;
    }
}