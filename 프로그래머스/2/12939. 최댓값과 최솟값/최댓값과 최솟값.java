import java.util.Arrays;
import java.util.stream.*;
class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] n = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            n[i] = Integer.parseInt(str[i]);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.stream(n).min().getAsInt());
        sb.append(" ");
        sb.append(Arrays.stream(n).max().getAsInt());
        
        return sb.toString();
    }
}