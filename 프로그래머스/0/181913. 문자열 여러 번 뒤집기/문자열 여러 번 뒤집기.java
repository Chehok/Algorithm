class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] answer = my_string.toCharArray();
        char[] reverse;
        
        for(int[] q: queries) {
            int idx = q[0];
            reverse = answer.clone();
            for(int i = q[1]; q[0] <= i; i--) {
                answer[idx++] = reverse[i];
            }
        }
        
        return String.valueOf(answer);
    }
}