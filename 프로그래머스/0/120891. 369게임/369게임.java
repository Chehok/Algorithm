class Solution {
    public int solution(int order) {
        int answer = 0;
        
        int div = 10;
        while(order != 0) {
            int temp = order % div;
            
            switch(temp) {
                case 3:
                case 6:
                case 9:
                    answer++;
                    break;
            }
            
            order /= div;
        }
        
        return answer;
    }
}