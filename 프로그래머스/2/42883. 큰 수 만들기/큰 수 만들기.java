import java.util.TreeSet;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        
        /* 
        number.length() == 10 / k == 4 일 때,
        6자리 숫자를 구한다는 뜻이된다.
        이는 첫번째 숫자를 구할 때에 뒤에 최소한 5개의 숫자를 남겨야 한다는 것과 같다.
        그러므로 n번째 숫자는 i 이전 index 까지만 탐색하도록 구성
        */
        int idx = 0;
        for(int i = k + 1; i <= number.length(); i++) {
            int maxIdx = idx;
            for(; idx < i; idx++) {
                int max = number.charAt(maxIdx) - '0';
                int now = number.charAt(idx) - '0';
                if(max < now) {
                    maxIdx = idx;
                }
            }
            answer.append(number.charAt(maxIdx));
            idx = maxIdx + 1;
        }
        
        return answer.toString();
    }
}