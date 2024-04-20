import java.util.ArrayList;

class Solution {
    static ArrayList<Integer>[] graph;
    static int result = 100;
    static boolean[] visited;
    static int sum;
    
    public int solution(int n, int[][] wires) {
        graph = new ArrayList[n + 1];
        for(int i = 1; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] wire: wires) {
            graph[wire[0]].add(wire[1]);
            graph[wire[1]].add(wire[0]);
        }
        
        for(int[] wire: wires) {
            graph[wire[0]].remove(Integer.valueOf(wire[1]));
            graph[wire[1]].remove(Integer.valueOf(wire[0]));
            
            visited = new boolean[n + 1];
            sum = 0;
            
            int startIdx = 0;
            for(int i = 1; i < n + 1; i++) {
                startIdx = i;
                if(!graph[i].isEmpty()) break;
            }
            
            dfs(startIdx);
            
            int diff = Math.abs(sum * 2 - n);
            
            result = result > diff ? diff : result; 
            
            graph[wire[0]].add(wire[1]);
            graph[wire[1]].add(wire[0]);
        }
        
        return result;
    }
    
    public void dfs(int startIdx) {
        for(int i: graph[startIdx]) {
            if(!visited[i]) {
                visited[i] = true;
                sum++;
                dfs(i);
            }
        }
    }
}

/*
ArrayList<ArrayList<Integer>>
[
    [] -> index: 0
    
    [3]
    [3]
    [1, 2, 4]
    [3, 5, 6, 7]
    [4]
    [4]
    [4, 8, 9]
    [7]
    [7]
]
*/