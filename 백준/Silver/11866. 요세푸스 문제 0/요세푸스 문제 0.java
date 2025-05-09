import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int i = -1;

        boolean[] boolList = new boolean[n];
        Queue<String> q = new LinkedList<>();

        while(cnt < n) {
            for(int j = 0; j < k; j++) {
                i = ++i % n;
                while(boolList[i]) i = ++i % n;
            }

            boolList[i] = true;
            q.add(String.valueOf(i + 1));
            cnt++;
        }

        bw.write("<");
        while(q.size() > 0) {
            bw.write(q.poll());
            if(q.size() != 0) bw.write(", ");
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}