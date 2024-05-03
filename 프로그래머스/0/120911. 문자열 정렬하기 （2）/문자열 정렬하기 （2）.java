import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] temp = my_string.toLowerCase().toCharArray();
        
        Arrays.sort(temp);
        
        return String.valueOf(temp);
    }
}