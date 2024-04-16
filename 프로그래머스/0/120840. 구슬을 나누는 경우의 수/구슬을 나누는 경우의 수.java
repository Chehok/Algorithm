class Solution {
    public long solution(int balls, int share) { // 1 1
        long result = 1;
        
        for(int i = 1; i <= share; i++) {
            result *= balls--;
            result /= i;
        }
        
        return result;
    }
}