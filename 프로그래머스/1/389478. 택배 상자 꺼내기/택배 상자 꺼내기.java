class Solution {
    public int solution(int n, int w, int num) {
        int answer = 1;
        int y = (num - 1) / w;
        int x = (num - 1) % w;
        int ny = (n - 1) / w;
        int nx = (n - 1) % w;
        
        if(y % 2 == 1) {
            x = w - 1 - x;
        }
        
        answer += ny - y;
        
        if(ny % 2 == 1) {
            nx = w - 1 - nx;
            if(x < nx) answer--;
        } else {
            if(x > nx) answer--;
        }
        
        return answer;
    }
}

/* y = 세로축 ((num - 1) / w) / x = 가로축 ((num - 1) % w)
            
    2   13 14 15 16 17 18
    1   12 11 10 9  8  7
    0   1  2  3  4  5  6

        0  1  2  3  4  5
*/