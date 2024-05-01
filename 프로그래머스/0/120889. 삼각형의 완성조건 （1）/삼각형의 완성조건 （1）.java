class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int sum = 0;
        
        for(int i: sides) {
            max = max < i ? i : max;
            sum += i;
        }
        
        if(sum - max <= max) {
            return 2;
        }
        
        return 1;
    }
}