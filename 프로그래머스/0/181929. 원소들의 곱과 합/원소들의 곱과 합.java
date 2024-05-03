class Solution {
    public int solution(int[] num_list) {
        int plus = 0;
        int multi = 1;
        
        for(int i: num_list) {
            plus += i;
            multi *= i;
        }
        
        return plus * plus < multi ? 0 : 1;
    }
}