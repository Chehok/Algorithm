class Solution {
    public int solution(int a, int b, int c) {
        int cnt = 0;
        int answer = a + b + c;
        
        if(a == b) cnt++;
        if(b == c) cnt++;
        if(c == a) cnt++;
        
        switch(cnt) {
            case 3:
                answer *= (a * a * a + b * b * b + c * c * c);
            case 1:
                answer *= (a * a + b * b + c * c);
        }
        
        return answer;
    }
}