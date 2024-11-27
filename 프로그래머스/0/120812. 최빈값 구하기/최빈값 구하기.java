class Solution {
    public int solution(int[] array) {
        int[] temp = new int[1001];
        int max = 0;
        int cnt = 1;
        
        for(int a: array) temp[a]++;
        
        for(int i = 1; i < 1001; i++) {
            if(temp[max] == temp[i]) {
                cnt++;
            } else if(temp[max] < temp[i]) {
                cnt = 1;
                max = i;
            }
        }
        
        return cnt > 1 ? -1 : max;
    }
}