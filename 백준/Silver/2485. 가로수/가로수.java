import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int[] numList = new int[n];
        int[] numList2 = new int[n - 1];
        int answer = 0;

        for(int i = 0; i < n; i++) 
            numList[i] = Integer.parseInt(br.readLine());

        for(int i = 0; i < n - 1; i++) {
            stk.push(numList[i + 1] - numList[i]);
            numList2[i] = numList[i + 1] - numList[i];
        }

        while(stk.size() != 1) {
            int a = stk.pop();
            int b = stk.pop();

            stk.push(GCD(a, b));
        }

        int gcd = stk.pop();

        for(int i = 0; i < n - 1; i++) 
            answer += numList2[i] / gcd - 1;

        System.out.println(answer);
    }

    public static int GCD(int a, int b) {
        while(a != 0) {
            if(a < b) {
                int temp = a; a = b; b = temp;
            }

            a %= b;
        }

        return b;
    }
}