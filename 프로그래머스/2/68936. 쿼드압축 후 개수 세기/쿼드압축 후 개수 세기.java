class Solution {
    int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {
        quad(0, 0, arr.length, arr);
        
        return answer;
    }
    
    private void quad(int x, int y, int size, int[][] arr) {
        if(check(x, y, size, arr)) {
            answer[arr[x][y]]++;
            return;
        }
        
        quad(x, y, size / 2, arr);
        quad(x, y + size / 2, size / 2, arr);
        quad(x + size / 2, y, size / 2, arr);
        quad(x + size / 2, y + size / 2, size / 2, arr);
    }
    
    private boolean check(int x, int y, int size, int[][] arr) {
        for(int i = x; i < x + size; i++) {
            for(int j = y; j < y + size; j++) {
                if(arr[x][y] != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}