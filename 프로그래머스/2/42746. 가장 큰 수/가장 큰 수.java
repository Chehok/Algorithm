import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        
        String[] changed = new String[numbers.length];
        for(int i = 0 ; i < numbers.length; i++) {
            changed[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(changed, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        if(changed[0].equals("0")) return "0";
        
        for(String s: changed) answer.append(s);
        
        return answer.toString();
    }
}