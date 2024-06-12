import java.util.Arrays;

class Solution {
    public Integer[] solution(int[] numlist, int n) {
        Integer[] _numlist = new Integer[numlist.length];
        for(int i = 0; i < numlist.length; i++) {
            _numlist[i] = numlist[i];
        }
        
        Arrays.sort(_numlist, (o1, o2) -> {
            if(Math.abs(o1 - n) == Math.abs(o2 - n)) {
                return Math.abs(o1 - n - 1) - Math.abs(o2 - n - 1);
            }
            return Math.abs(o1 - n) - Math.abs(o2 - n);
        });
        
        return _numlist;
    }
}