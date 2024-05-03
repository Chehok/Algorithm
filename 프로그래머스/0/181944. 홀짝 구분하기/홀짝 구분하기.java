import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int val = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(val));
        bw.write(" ");
        
        if(val % 2 == 0) {
            bw.write("is even");
        } else {
            bw.write("is odd");
        }
        
        bw.flush();
        bw.close();
    }
}