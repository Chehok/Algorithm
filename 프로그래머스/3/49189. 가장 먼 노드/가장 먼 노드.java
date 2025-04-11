import java.util.Queue;
import java.util.LinkedList;

import java.util.Set;
import java.util.HashSet;

import java.util.List;
import java.util.ArrayList;

class Solution {
    static Queue<int[]> q;
    static List<Integer>[] list;
    static boolean[] visited;
    
    public int solution(int n, int[][] edge) {
        q = new LinkedList<>();
        list = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        
        for(int i = 1; i < n + 1; i++) list[i] = new ArrayList<>();
        
        int max = 0;
        int answer = 0;
        q.add(new int[]{1, 0});
        visited[1] = true;
        
        for(int[] e: edge) {
            list[e[0]].add(e[1]);
            list[e[1]].add(e[0]);
        }

        while(q.size() > 0) {
            int[] temp = q.poll();
            
            if(max < temp[1]) {
                max = temp[1];
                answer = 1;
            } else if(max == temp[1]) {
                answer++;
            }
            
            bfs(temp[0], temp[1]);
        }
        
        return answer;
    }
    
    void bfs(int a, int k) {
        for(int temp: list[a]) {
            if(!visited[temp]) {
                q.add(new int[]{temp, k + 1});
                visited[temp] = true;
            }
        }
    }
}