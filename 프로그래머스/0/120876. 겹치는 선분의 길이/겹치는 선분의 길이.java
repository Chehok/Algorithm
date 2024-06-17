class Solution {
    public int solution(int[][] lines) {
        int[] overlap = new int[200];
        boolean[] check = new boolean[200];
        int answer = 0;
        
        for(int[] l: lines) {
            for(int i = l[0]; i < l[1]; i++) {
                if(overlap[i + 100] != 0) check[i + 100] = true;
                overlap[i + 100]++;
            }
        }
        
        for(int i = 0; i < 200; i++) {
            if(check[i]) answer++;
        }
        
        return answer;
    }
}