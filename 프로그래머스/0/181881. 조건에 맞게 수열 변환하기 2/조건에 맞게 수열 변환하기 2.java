class Solution {
    public int solution(int[] arr) {
        int cnt = 0;
        
        loop:
        while(true) {
            int[] temp = arr.clone();
            for(int i = 0; i < arr.length; i++) {
                if(50 <= arr[i]) {
                    if(temp[i] % 2 == 0) {
                        temp[i] /= 2;
                    }
                } else {
                    if(temp[i] % 2 != 0) {
                        temp[i] *= 2;
                        temp[i]++;
                    }
                }
            }
            
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != temp[i]) {
                    arr = temp;
                    cnt++;
                    continue loop;
                }
            }
            
            return cnt;
        }
    }
}