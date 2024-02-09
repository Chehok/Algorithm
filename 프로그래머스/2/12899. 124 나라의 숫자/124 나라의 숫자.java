class Solution {
    public String solution(int n) {
        String[] arr = { "4", "1", "2" };
        StringBuilder answer = new StringBuilder();
        
        while(n != 0) {
            int idx = n % 3;
            n /= 3;
            if(idx == 0) n--;
            
            answer.append(arr[idx]);
        }
        
        return answer.reverse().toString();
    }
}