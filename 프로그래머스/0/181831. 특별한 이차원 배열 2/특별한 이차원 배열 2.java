class Solution {
    public int solution(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i][arr.length - i - 1] != arr[arr.length - i - 1][i]) return 0;
        }
        
        return 1;
    }
}