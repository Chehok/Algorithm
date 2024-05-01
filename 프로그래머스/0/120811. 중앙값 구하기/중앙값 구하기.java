class Solution {
    public int solution(int[] array) {
        int arrLength = array.length;
        
        for(int i = 0; i < arrLength; i++) {
            for(int j = 0; j < arrLength; j++) {
                if(array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        return array[arrLength / 2];
    }
}