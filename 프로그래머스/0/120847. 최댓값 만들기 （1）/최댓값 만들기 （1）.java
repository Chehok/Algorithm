import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] numbers) {
        Integer[] _numbers = new Integer[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            _numbers[i] = numbers[i];
        }
        Arrays.sort(_numbers, Collections.reverseOrder());
        return _numbers[0] * _numbers[1];
    }
}