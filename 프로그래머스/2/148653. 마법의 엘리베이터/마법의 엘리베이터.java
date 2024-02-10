class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while(storey > 0) {
            int temp = storey % 10;
            storey /= 10;
            
            if(temp == 5) {
                if(storey % 10 >= 5) {
                    storey++;
                }
                answer += temp;
            } else if (temp < 5) {
                answer += temp;
            } else if(temp > 5) {
                storey++;
                answer += (10 - temp);
            }
        }
        
        return answer;
    }
}

/* 풀이 설명

가장 작은 자리부터 큰 자리 순으로 검사한다. (256층 -> 6, 50, 200 순)
현재 검사하는 자리가 5인경우, 다음 자리에 따라 +-를 결정함.

1. 다음 자리가 4이하인 경우, -
2. 다음 자리가 6이상인 경우, +
4. 다음 자리가 5인 경우, + - 둘다 연산횟수가 같지만 다음 자릿수에 또 영향을 주게 되고 +가 더 연산이 적도록 유도함.
*/