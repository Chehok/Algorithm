class Solution {
    boolean[][][] visited = new boolean[11][11][4];
    int[] location = { 5, 5 }; // start idx
    public int solution(String dirs) {
        int answer = 0;
        
        for(char c: dirs.toCharArray()) {
            int x = location[0];
            int y = location[1];
            int vec = 0;
            int reverse = 0;
            switch(c) {
                case 'U': // 0
                    y++;
                    reverse = 1;
                    break;
                case 'D': // 1
                    y--;
                    vec = 1;
                    reverse = 0;
                    break;
                case 'L': // 2
                    x--;
                    vec = 2;
                    reverse = 3;
                    break;
                case 'R': // 3
                    x++;
                    vec = 3;
                    reverse = 2;
                    break;
            }
            
            if(x >= 0 && y >= 0 && x < 11 && y < 11) {
                if(!visited[x][y][vec]) {
                    answer++;
                }
                visited[x][y][vec] = true;
                visited[location[0]][location[1]][reverse] = true;
                location[0] = x;
                location[1] = y;
            }
        }
        return answer;
    }
}