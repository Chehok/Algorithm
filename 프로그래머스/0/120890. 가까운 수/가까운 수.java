class Solution {
    public int solution(int[] array, int n) {
        int min = Math.abs(array[0] - n);
        int minIdx = 0;
        
        for(int i = 1; i < array.length; i++) {
            int temp = Math.abs(n - array[i]);
            
            if(temp < min) {
                min = temp;
                minIdx = i;
            } else if(min == temp) {
                if(array[i] < array[minIdx]) {
                    minIdx = i;
                }
            }
        }
        
        return array[minIdx];
    }
}