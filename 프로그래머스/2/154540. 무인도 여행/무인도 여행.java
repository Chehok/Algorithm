import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int x, y;
    int[][] pos = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
    Queue<int[]> q = new LinkedList<>();
    List<Integer> answer = new ArrayList<>();
    boolean[][] visited;
    char[][] graph;
    
    public void bfs() {
        int cnt = 0;
        while (!q.isEmpty()) {
            int[] nowPos = q.poll();

            cnt += graph[nowPos[0]][nowPos[1]] - '0';

            for(int idx = 0; idx < 4; idx++) {

                int nextX = nowPos[0] + pos[idx][0];
                int nextY = nowPos[1] + pos[idx][1];

                if(0 <= nextX && 0 <= nextY && nextX < x && nextY < y) {
                    if(!visited[nextX][nextY] && Character.isDigit(graph[nextX][nextY])) {
                        q.add(new int[] { nextX, nextY });
                        visited[nextX][nextY] = true;
                    }
                    
                }
            }
        }  
        answer.add(cnt);
    }
    
    public List<Integer> solution(String[] maps) {
        x = maps.length;
        y = maps[0].length();
        graph = new char[x][y];
        visited = new boolean[x][y];
        
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                graph[i][j] = maps[i].charAt(j);
            }
        }
        
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                char c = graph[i][j];
                if(Character.isDigit(c)) {
                    if(!visited[i][j]) {
                        q.add(new int[] { i, j });
                        visited[i][j] = true;
                        bfs();
                    }
                }
            }
        }
        
        answer.sort((o1, o2) -> Integer.compare(o1, o2));
        
        if(answer.size() == 0) {
            answer.add(-1);
        }
        return answer;
    }
}