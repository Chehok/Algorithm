class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int cnt1 = 0;
        int cnt2 = 0;
        
        if(arr1.length < arr2.length) {
            return -1;
        } else if(arr1.length > arr2.length) {
            return 1;
        } else {
            for(int i1: arr1) cnt1 += i1;
            for(int i2: arr2) cnt2 += i2;
            
            if(cnt1 < cnt2) {
                return -1;
            } else if(cnt1 > cnt2) {
                return 1;
            }
            return 0;
        }
    }
}