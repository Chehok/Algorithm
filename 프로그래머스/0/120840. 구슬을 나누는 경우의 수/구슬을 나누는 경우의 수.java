class Solution {
    public long solution(int balls, int share) { // 1 1
        long result = 1;
        
//         for(int i = balls; i > balls - share; i--) // 5 4 3 == n!
//             result *= i;
        
//         for(int i = 1; i <= share; i++) // 1 2 3 == m!
//             result /= i;
        
        for(int i = 1; i <= share; i++) {
            result *= balls;
            balls--;
            result /= i;
        }
        
        return result;
    }
}