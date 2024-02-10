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