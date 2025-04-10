import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[][] graph = new boolean[101][101];
        int answer = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int j = a; j < a + 10; j++) {
                for(int k = b; k < b + 10; k++) {
                    graph[j][k] = true;
                }
            }
        }

        for(int i = 0; i < 101; i++) {
            for(int j = 0; j < 101; j++) {
                if(graph[i][j]) answer++;
            }
        }

        System.out.println(answer);
    }
}